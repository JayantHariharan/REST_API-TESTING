package requestMethods;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PostMethod {

	public  void postRequest() throws IOException {
		URL url=new URL("https://reqres.in/api/users");
		HttpURLConnection connection=(HttpURLConnection) url.openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type","application/json");
		connection.setDoOutput(true);
		String jsonText= "{\"name\":\"Jayant\",\"age\":\"20\",\"salary\":\"80000\"}";
		byte[]json=jsonText.getBytes();
		OutputStream outputStream=connection.getOutputStream();
		outputStream.write(json);
		int statusCode=connection.getResponseCode();
		String message=connection.getResponseMessage();
		System.out.println("Status Code: "+statusCode+" Message: "+message);
		ReaderMethod reader=new ReaderMethod();
		reader.readFile(connection);
		 
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PostMethod post=new PostMethod();
		post.postRequest();

	}

}
