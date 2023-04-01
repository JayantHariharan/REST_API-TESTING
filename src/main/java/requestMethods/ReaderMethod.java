package requestMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class ReaderMethod {

	public void readFile(HttpURLConnection connection) throws IOException {
	  InputStream inputStream=connection.getInputStream();
	  InputStreamReader streamReader=new InputStreamReader(inputStream);
	  BufferedReader reader=new BufferedReader(streamReader);
	  String line=null;
	  StringBuffer buffer=new StringBuffer();
	  while((line=reader.readLine())!=null) {
		  buffer.append(line);
	  }
	  System.out.println(buffer);
	}
}
