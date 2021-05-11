package g1.CalcClientDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		// http://localhost:8080/MavenHelloWorld/webapi/calc/sum/12/5
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers   ");
		a=sc.nextInt();
		b=sc.nextInt();
		 try {
			URL url = new URL("http://localhost:8080/MavenHelloWorld/webapi/calc/sum/" +a +"/"+b);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("GET");
	        conn.setRequestProperty("Accept", "application/json");
	        if (conn.getResponseCode() != 200) {
	            throw new RuntimeException("Failed : HTTP error code : "
	                    + conn.getResponseCode());
	        }
	        BufferedReader br = new BufferedReader(new InputStreamReader(
		            (conn.getInputStream())));

		        String output;
		        System.out.println("Output from Server .... \n");
		        while ((output = br.readLine()) != null) {
		            System.out.println(output);
		        }
		        conn.disconnect();

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
