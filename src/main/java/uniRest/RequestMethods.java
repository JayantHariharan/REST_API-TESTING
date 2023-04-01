package uniRest;

import com.mashape.unirest.http.exceptions.UnirestException;

public class RequestMethods {

	public static void main(String[] args) throws UnirestException {
		GetMethod get=new GetMethod();
		PostMethod post=new PostMethod();
		PutMethod put=new PutMethod();
		DeleteMethod delete=new DeleteMethod();
		
		System.out.println("GET");
		get.getRequest();
		System.out.println("POST");
		post.postRequest();
		System.out.println("PUT");
		put.putRequest();
		System.out.println("DELETE");
		delete.deleteRequest();

	}

}
