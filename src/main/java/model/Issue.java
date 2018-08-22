package model;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.exceptions.UnirestException;
import utils.Requests;

public class Issue {
    Requests issue = new Requests();


    public void CreateIssue(JsonNode body) throws UnirestException {
        issue.PostRequest("issue", body );

    }

    public void UpdateIssue(int key, JsonNode body) throws UnirestException {
        issue.PutRequest("issue/"+ key , body);
    }

    public void DeleteIssue(int key) throws UnirestException{
        issue.DeleteRequest("issue/" + key);
    }

    public HttpResponse<JsonNode> GetIssue(int key) throws UnirestException{
        HttpResponse<JsonNode> json = issue.GetRequest("issue/" + key);
        return json;
    }
}
