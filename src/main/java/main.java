import model.Issue;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.exceptions.UnirestException;
import model.Project;

public class main {
    public static void main(String[] args) throws UnirestException {

        /*JsonNode body = new JsonNode(
                "{\r\n    \"key\":\"NOVO\",\r\n    " +
                        "\"name\":\"NOVO PROJETO\",\r\n    " +
                        "\"projectTypeKey\":\"business\",\r\n    " +
                        "\"description\":\"PROJETO TESTE\",\r\n    " +
                        "\"leadAccountId\":\"5b36418cdab53b667c4dfbe9\",\r\n}"
        );

        Project project = new Project();
            issue.DeleteProject("NOVO");

    }*/

        //create Issue
        /*
        JsonNode body = new JsonNode("{\n" +
                "\"fields\": {\n" +
                "  \"project\": {\n" +
                "    \"key\":\"TES\" \n" +
                "  },\n" +
                "  \"issuetype\":{\n" +
                "\t\"name\":\"Problem\"\n" +
                "  },\n" +
                "  \"labels\":[\n" +
                "  \t\"mctic\"\n" +
                "  ],\n" +
                "  \"summary\":\"Nova Issue\",\n" +
                "  \"description\":\"Apenas um teste para a API\"\n" +
                "  }\n" +
                "  \n" +
                "}\n");

        Issue issue = new Issue();
        issue.CreateIssue(body);
    }
    */
        //delete Issue
        /*
        Issue issue = new Issue();
        issue.DeleteIssue("");
    }
    */
    }
}