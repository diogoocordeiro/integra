package controller;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.TimerTask;

public class Schedule extends TimerTask {

    Issue issue = new Issue();
    Read read = new Read();
    FtpConnect ftpc = new FtpConnect();

    @Override
    public void run() {
        Date data = new Date();
        System.out.println(data);

        // Conexão com o FTP
        try {
            ftpc.ftp();
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
        JSONObject body = read.ler("C:/java_api/integra/dir/");

        // Criar nova Tarefa
        try {
            issue.CreateIssue(body.toString());
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        System.out.println("Fim");
    }

}