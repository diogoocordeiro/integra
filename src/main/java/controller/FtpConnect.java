package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.net.SocketException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.apache.commons.net.ftp.FTPClient;
import org.json.simple.JSONObject;


public class FtpConnect {

     final String dir = System.getProperty("user.dir");

    public void ftp() throws SocketException,

            IOException, ParseException, InterruptedException {


            FTPClient ftp = new FTPClient();
        //Conexão
            ftp.connect("sco.rsinet.com.br",21);

            ftp.login("user.ftpjira","U5erJ1r@2018!");

            ftp.changeWorkingDirectory("jira");

            String[] arq = ftp.listNames();

            System.out.println("Listando arquivos: \n");

            for (String f : arq) {

              if (!f.isEmpty()){

                  SimpleDateFormat format = new SimpleDateFormat("ddMMyyyyHHmmss");
                  Date now = new Date();
                  String filename = format.format(now);

                  //Download dos Arquivos
                  FileOutputStream fos = new FileOutputStream(dir + "/dir/"+ filename +".json");
                  String ext = f.substring(f.lastIndexOf("."));
                  System.out.println(ext);

                  if (ext.equals(".json")){
                      System.out.println("Arquivo .json identificado!");


                  if (ftp.retrieveFile(f,fos)) {

                      System.out.println("Download efetuado com sucesso!");

                      //Enviar arquivo baixado para a pasta "Executed"

                      ftp.changeWorkingDirectory("../executed");

                      FileInputStream arqEnviar =

                              new FileInputStream(dir + "/dir/"+ filename +".json");

                      if (ftp.storeFile (filename+".json", arqEnviar)) {

                          System.out.println("Arquivo armazenado com sucesso!");

                          ftp.changeWorkingDirectory("../jira");

                          ftp.deleteFile(f);

                          System.out.println("Arquivo"+ filename +".json excluído!");

                      } else

                          System.out.println ("Erro ao armazenar o arquivo.");

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
}

