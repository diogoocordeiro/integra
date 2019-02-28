package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.SocketException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

public class FtpConnect {

    final String dir = System.getProperty("user.dir");
     String filename;
     List lista;

    public List ftp() throws SocketException,

            IOException, ParseException, InterruptedException {

        FTPClient ftp = new FTPClient();

        lista = new ArrayList();

        //Conexão
        ftp.connect("sco.rsinet.com.br", 21);

        ftp.login("user.ftpjira", "U5erJ1r@2019!");

        if (FTPReply.isPositiveCompletion(ftp.getReplyCode())) {
            System.out.println("Conectado ao FTP");
            ftp.enterLocalPassiveMode();

            ftp.changeWorkingDirectory("jira");

            String[] arq = ftp.listNames();
            System.out.println("Listando arquivos: \n");


            for (String f : arq) {

                if (!f.isEmpty()) {

                    System.setProperty("file.encoding", "UTF-8");
                    SimpleDateFormat format = new SimpleDateFormat("ddMMyyyyHHmmss");
                    Date now = new Date();
                    filename = format.format(now) + ".json";
                    lista.add(filename);
                    //Download dos Arquivos
                    FileOutputStream fos = new FileOutputStream(dir + "/dir/" + filename);
                    String ext = f.substring(f.lastIndexOf("."));
                    System.out.println(ext);

                    if (ext.equals(".json")) {
                        System.out.println("Arquivo " + filename + " identificado!");

                        if (ftp.retrieveFile(f, fos)) {

                            System.out.println("Download efetuado com sucesso!");

                            //Enviar arquivo baixado para a pasta "Executed"
                            ftp.changeWorkingDirectory("../executed");

                            FileInputStream arqEnviar =

                                    new FileInputStream(dir + "/dir/" + filename);

                            if (ftp.storeFile(filename, arqEnviar)) {

                                System.out.println("Arquivo armazenado com sucesso em " + dir +" !");

                                ftp.changeWorkingDirectory("../jira");

                                ftp.deleteFile(f);

                                System.out.println("Arquivo " + filename + " excluído!");

                            } else

                                System.out.println("Erro ao armazenar o arquivo.");

                        } else {

                            System.out.println("Erro ao efetuar download do arquivo.");
                        }
                    } else {
                        System.out.println("Formato do arquivo não aceito!");
                    }

                    Thread.sleep(1100);
                }
            }
            //fechar conexão FTP
            ftp.logout();
            ftp.disconnect();
        }
        return lista;
    }
}