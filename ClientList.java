import java.io.*;
import java.net.*;

class ClientList{
	public static void main(String args[])
	throws Exception{
		Socket s = new Socket("localhost",4040);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		DataInputStream fromServer = new DataInputStream(s.getInputStream());

		DataOutputStream toServer = new DataOutputStream(s.getOutputStream());

		System.out.println("Enter file names (END to stop):");

		String fileName=null;

		while(true){
			fileName = br.readLine();
			toServer.writeBytes(fileName+"\n");
		
			if(fileName.equals("END")) break;
		}

		String str=null;
		while(true){
			str = fromServer.readLine();
			if(str.equals("END")) break;
			System.out.println(str);
		}
	}
}
	





