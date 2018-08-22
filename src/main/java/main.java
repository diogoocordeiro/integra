import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.exceptions.UnirestException;
import model.Issue;

public class main {
    public static void main(String[] args) throws UnirestException {

        JsonNode body = new JsonNode("\n" +
                "    {\n" +
                "  \"fields\": {\n" +
                "    \"project\": {\n" +
                "      \"key\": \"\"\n" +
                "    },\n" +
                "    \"summary\": \"\",\n" +
                "    \"issuetype\": {\n" +
                "      \"name\": \"\"\n" +
                "    },\n" +
                "    \"assignee\": {\n" +
                "      \"name\": \"\"\n" +
                "    },\n" +
                "    \"reporter\": {\n" +
                "      \"name\": \"\"\n" +
                "    },\n" +
                "    \"labels\": {\n" +
                "    }\n" +
                "  }\n" +
                "}");




    }
}
