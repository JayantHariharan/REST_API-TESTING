package requestMethods;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class DeleteMethod {
	
	public void deleteRequest() throws IOException {
		URL url=new URL("https://reqres.in/api/users/2");
		HttpURLConnection connection=(HttpURLConnection) url.openConnection();
		connection.setRequestMethod("DELETE");
		connection.setRequestProperty("Content-Type","application/json");
		connection.setDoOutput(true);
		int statusCode=connection.getResponseCode();
		String message=connection.getResponseMessage();
		System.out.println("Status Code: "+statusCode+" Message: "+message);
		ReaderMethod reader=new ReaderMethod();
		reader.readFile(connection);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DeleteMethod delete=new DeleteMethod();
		delete.deleteRequest();

	}

}
