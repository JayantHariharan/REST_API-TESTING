package uniRest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class GetMethod {

	public void getRequest() throws UnirestException {
		HttpResponse<JsonNode>jsonResponse=Unirest.get("https://reqres.in/api/users?page=2").asJson();
		int statusCode=jsonResponse.getStatus();
		String message=jsonResponse.getStatusText();
		JsonNode content=jsonResponse.getBody();
		System.out.println("Status code: "+statusCode);
		System.out.println("Message: "+message);
		System.out.println("Content: \n"+content);
	}
}
