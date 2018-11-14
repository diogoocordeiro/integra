package view;

import com.mashape.unirest.http.exceptions.UnirestException;
import controller.FtpConnect;
import controller.Issue;
import controller.Read;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.net.SocketException;
import java.text.ParseException;


public class Main {
    public static void main(String[] args) throws UnirestException, IOException, ParseException, InterruptedException {

        FtpConnect ftpc = new FtpConnect();
        ftpc.ftp();

      //  Read read = new Read();
        //JSONObject body = read.ler("/Users/diogo.cordeiro.RSINET/Desktop/API_SCO_JAVA/java_api_sco/dir/");

       // Issue issue = new Issue();
       //  issue.CreateIssue(body.toString());



    }
}

