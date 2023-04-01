package uniRest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class PostMethod {

	
	public void postRequest() throws UnirestException {
		String bodyContent="{\"name\":\"Jayant\",\"age\":\"20\",\"salary\":\"80000\"}";
		HttpResponse<JsonNode>jsonResponse=Unirest.post("https://reqres.in/api/users").body(bodyContent).asJson();
		int statusCode=jsonResponse.getStatus();
		String message=jsonResponse.getStatusText();
		JsonNode content=jsonResponse.getBody();
		System.out.println("Status code: "+statusCode);
		System.out.println("Message: "+message);
		System.out.println("Content: \n"+content);
	}
}
