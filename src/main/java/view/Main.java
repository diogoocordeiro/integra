package view;

import com.mashape.unirest.http.exceptions.UnirestException;
import model.Issue;


public class Main {
    public static void main(String[] args) throws  UnirestException {

        Issue issue = new Issue();
        issue.CreateIssue("{\n" +
                "      \"fields\": {\n" +
                "        \"project\": {\n" +
                "          \"key\": \"FABDF\"\n" +
                "        },\n" +
                "        \"summary\": \"APENAS UM TESTE 3\",\n" +
                "        \"issuetype\": {\n" +
                "          \"name\": \"Task\"\n" +
                "        },\n" +
                "        \"duedate\": \"2018-12-01\",\n" +
                "        \"customfield_10033\": {\n" +
                "          \"value\": \"ANEEL\"\n" +
                "        },\n" +
                "        \"customfield_10056\": {\n" +
                "          \"value\": \"Baixa\"\n" +
                "        },\n" +
                "        \"customfield_10090\": \"Sistema\",\n" +
                "        \"customfield_10091\": \"Ciclo\",\n" +
                "        \"customfield_10092\": \"Fase\",\n" +
                "        \"customfield_10088\": \"Ordem de Serviço\",\n" +
                "        \"customfield_10089\": \"Iteração\",\n"+
                "        \"customfield_10094\": {\n" +
                "          \"value\": \"Automação\"\n" +
                "        }\n" +
                "      }}");


    }
}

//comentario