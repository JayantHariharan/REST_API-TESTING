package uniRest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class PutMethod {

	public void putRequest() throws UnirestException {
		String bodyContent="{\"data\":{\"id\":32,\"email\":\"janet.weaver@reqres.in\",\"first_name\":\"Jayant\",\"last_name\":\"H\"}";
		HttpResponse<JsonNode>jsonResponse=Unirest.put("https://reqres.in/api/users/2").body(bodyContent).asJson();
		int statusCode=jsonResponse.getStatus();
		String message=jsonResponse.getStatusText();
		JsonNode content=jsonResponse.getBody();
		System.out.println("Status code: "+statusCode);
		System.out.println("Message: "+message);
		System.out.println("Content: \n"+content);
	}
}
