package testandolista;

import java.io.*;

public class inputs {
	public static void main(String[] args) throws IOException {
		InputStream s = System.in;
		InputStreamReader s2 = new InputStreamReader(s);
		BufferedReader s3 = new BufferedReader(s2);
		String s4 = s3.readLine();
		
		while(s4!=null) {
			System.out.println(s4);
			s4 = s3.readLine();
		}
	
	}
}
