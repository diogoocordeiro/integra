package model;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Requests {

    private String host = "https://rsisolucoes.atlassian.net/rest/api/2/";
    private String token = "Basic ZGlvZ28uY29yZGVpcm9AcnNpbmV0LmNvbS5icjpkaW9nbzY1NzQyMw==";
    private String json = "application/json";

    public HttpResponse<JsonNode> GetRequest(String url) throws UnirestException {
        HttpResponse<JsonNode> request = Unirest.get(host + url)
                .header("Accept", json)
                .header("Content-Type", json)
                .header("Authorization",token)
                .asJson();
        return request;
    }

    public HttpResponse<JsonNode> PostRequest(String url, String body) throws UnirestException {
        HttpResponse<JsonNode> request = Unirest.post(host + url)
                .header("Accept", json)
                .header("Content-Type", json)
                .header("Authorization",token)
                .body(body)
                .asJson();
        return request;
    }

    public HttpResponse<JsonNode> PutRequest(String url, String body) throws UnirestException {
        HttpResponse<JsonNode> request = Unirest.put(host + url)
                .header("Accept", json)
                .header("Content-Type", json)
                .header("Authorization",token)
                .body(body)
                .asJson();
        return request;

    }

    public HttpResponse<JsonNode> DeleteRequest(String url) throws UnirestException {
        HttpResponse<JsonNode> request = Unirest.delete(host + url)
                .header("Accept", json)
                .header("Content-Type", json)
                .header("Authorization",token)
                .asJson();
        return request;

    }
}