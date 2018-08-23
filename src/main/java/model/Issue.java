package model;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.exceptions.UnirestException;
import utils.Requests;

public class Issue {
    Requests issue = new Requests();


    public void CreateIssue(JsonNode body) throws UnirestException {
       HttpResponse<JsonNode> response = issue.PostRequest("issue", body );
        if(response.getStatus() == 201){
            System.out.println(response.getStatusText());
        }else if(response.getStatus() == 400) {
            System.out.println(response.getBody().getObject().toString());
            System.out.println(response.getStatusText());
        }else if(response.getStatus() == 405){
            System.out.println(response.getBody().getObject().toString());
            System.out.println(response.getStatusText());
        }
    }

    public void UpdateIssue(String key, JsonNode body) throws UnirestException {
        HttpResponse<JsonNode> response = issue.PutRequest("issue/"+ key , body);
        if(response.getStatus() >=200 && response.getStatus() <= 204){
            System.out.println(response.getStatusText());
        }else if(response.getStatus() == 400){
            System.out.println(response.getBody().getObject().toString());
            System.out.println(response.getStatusText());
        }else if(response.getStatus() == 403){
            System.out.println(response.getBody().getObject().toString());
            System.out.println(response.getStatusText());
        }else if(response.getStatus() == 405){
            System.out.println(response.getBody().getObject().toString());
            System.out.println(response.getStatusText());
        }
    }

    public void DeleteIssue(String key) throws UnirestException{
        HttpResponse<JsonNode> response = issue.DeleteRequest("issue/" + key);
        if(response.getStatus() == 200){
            System.out.println(response.getStatusText() +" Issue deleted with success!");
        }else if(response.getStatus() == 400){
            System.out.println(response.getBody().getObject().toString());
            System.out.println(response.getStatusText());
        }else if(response.getStatus() == 401){
            System.out.println(response.getBody().getObject().toString());
            System.out.println(response.getStatusText());
        }else if(response.getStatus() == 403){
            System.out.println(response.getBody().getObject().toString());
            System.out.println(response.getStatusText());
        }else if(response.getStatus() == 404){
            System.out.println(response.getBody().getObject().toString());
            System.out.println(response.getStatusText());
        }else if(response.getStatus() == 405){
            System.out.println(response.getBody().getObject().toString());
            System.out.println(response.getStatusText());
        }
    }

    public HttpResponse<JsonNode> GetIssue(String key) throws UnirestException {
        HttpResponse<JsonNode> json = issue.GetRequest("issue/" + key);
        if (json.getStatus() == 200) {
            System.out.println(json.getBody().getObject().toString());
            return json;
        }else if (json.getStatus() == 404){
            System.out.println(json.getBody().getObject().toString());
            System.out.println(json.getStatusText());
            return json;
        }else if (json.getStatus() == 405){
            System.out.println(json.getBody().getObject().toString());
            System.out.println(json.getStatusText());
            return json;
        }else{
            return json;
        }
    }
}
