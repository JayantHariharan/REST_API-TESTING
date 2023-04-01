package requestMethods;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PutMethod {
	
	public void putRequest() throws IOException {
		URL url=new URL("https://reqres.in/api/users/2");
		HttpURLConnection connection=(HttpURLConnection) url.openConnection();
		connection.setRequestMethod("PUT");
		connection.setRequestProperty("Content-Type","application/json");
		connection.setDoOutput(true);
		String jsonContent="{\"data\":{\"id\":32,\"email\":\"janet.weaver@reqres.in\",\"first_name\":\"Jayant\",\"last_name\":\"H\",\"avatar\":\"https://reqres.in/img/faces/2-image.jpg\"},\"support\":{\"url\":\"https://reqres.in/#support-heading\",\"text\":\"To keep ReqRes free, contributions towards server costs are appreciated!\"}}";
		byte[]json=jsonContent.getBytes();
		OutputStream stream=connection.getOutputStream();
		stream.write(json);
		int statusCode=connection.getResponseCode();
		String message=connection.getResponseMessage();
		System.out.println("Status Code: "+statusCode+" Message: "+message);
		ReaderMethod reader=new ReaderMethod();
		reader.readFile(connection);
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PutMethod put=new PutMethod();
		put.putRequest();

	}

}
