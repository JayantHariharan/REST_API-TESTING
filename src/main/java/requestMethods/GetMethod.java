package requestMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class GetMethod {
	
	public void getRequest() throws IOException {
		URL url=new URL("https://reqres.in/api/users/2");
		HttpURLConnection connection=(HttpURLConnection)url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();
		int statusCode=connection.getResponseCode();
		String message=connection.getResponseMessage();
		System.out.println("Status Cdoe: "+statusCode+" Response Message: "+message);
		ReaderMethod reader=new ReaderMethod();
		reader.readFile(connection);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			GetMethod get=new GetMethod();
			get.getRequest();
	}

}
