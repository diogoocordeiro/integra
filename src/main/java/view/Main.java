package view;

import com.mashape.unirest.http.exceptions.UnirestException;
import controller.Issue;
import controller.Read;
import org.json.simple.JSONObject;


public class Main {
    public static void main(String[] args) throws  UnirestException {

        Read read = new Read();
        JSONObject body = read.ler("C:/Users/diogo.cordeiro/Documents/integracao_jira/jsonFile_6377_22105_BANCO BRADESCO_1.json");

        Issue issue = new Issue();
        issue.CreateIssue("{\n" +
                "  \"fields\": {\n" +
                "    \"project\": { \"key\": \"FABDF\" },\n" +
                "    \"summary\": \"BRA TESTE DESCO - DEMANDA BRA TESTE DESCO - DSH - GESTÃO DE TESTES\",\n" +
                "    \"issuetype\": { \"name\": \"Task\" },\n" +
                "    \"timetracking\": {\n" +
                "      \"originalEstimate\": \"36h\",\n" +
                "      \"remainingEstimate\": \"0\"\n" +
                "    },\n" +
                "    \"duedate\": \"2018-11-30 00:00:00\",\n" +
                "    \"customfield_10033\": { \"value\": \"BRB\" },\n" +
                "    \"customfield_10090\": \"Sistema\",\n" +
                "    \"customfield_10091\": \"Ciclo\",\n" +
                "    \"customfield_10092\": \"Fase\",\n" +
                "    \"customfield_10088\": \"Serviço\",\n" +
                "    \"customfield_10089\": \"Iteração\"\n" +
                "  }\n" +
                "} ");


    }
}

