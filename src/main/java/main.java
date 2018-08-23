import model.Issue;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.exceptions.UnirestException;
import model.Project;

public class main {
    public static void main(String[] args) throws UnirestException {

        JsonNode body = new JsonNode(
                "{\r\n    \"key\":\"NOVO\",\r\n    " +
                        "\"name\":\"NOVO PROJETO\",\r\n    " +
                        "\"projectTypeKey\":\"business\",\r\n    " +
                        "\"description\":\"PROJETO TESTE\",\r\n    " +
                        "\"leadAccountId\":\"5b36418cdab53b667c4dfbe9\",\r\n}"
        );

        Project issue = new Project();
            issue.DeleteProject("NOVO");

    }
}
