import java.io.*;
import java.net.*;

class ServerList{
	public static void main(String args[])
	throws Exception{
		ServerSocket ss = new ServerSocket(4040);

		while(true){
			Socket s = ss.accept();

			DataInputStream fromClient = new DataInputStream(s.getInputStream());

			DataOutputStream toClient = new DataOutputStream(s.getOutputStream());

			String fileName=null;

			while(true){
				fileName = fromClient.readLine();
				if(fileName.equals("END")) break;
			
				File f = new File(fileName);
				if(f.exists())
					toClient.writeBytes(fileName+" found.\n");
				else
					toClient.writeBytes(fileName+" not found.\n");
			}
			toClient.writeBytes("END\n");
		}
	}
}	




