package controller;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;

public class Schedule extends TimerTask {

    Issue issue = new Issue();
    Read read = new Read();
    FtpConnect ftpc = new FtpConnect();
    List filenames;

    @Override
    public void run() {
        Date data = new Date();
        System.out.println(data);

        // Conexão com o FTP
        try {
           filenames = ftpc.ftp();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        // Especificar caminho do diretório
        for (int i = 0; i < filenames.size();i ++) {
            JSONObject body = read.ler("C:/java_api/dir/" + filenames.get(i) );

            // Criar nova Tarefa
            try {
                System.out.println(body.toString());
                if (body != null){
                    issue.CreateIssue(body.toString());
                    body = null;}
            } catch (UnirestException e) {
                e.printStackTrace();
            }
        }

        filenames = null;

        System.out.println("Fim");
    }

}