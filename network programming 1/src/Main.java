import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args){
        try{
            System.out.println("1 Before creating the server socket");
            ServerSocket serverSocket= new ServerSocket(50001);
            System.out.println("2 after creating the server socket");

            System.out.println("3 before accept client");
            Socket client = serverSocket.accept();
            System.out.println("4 after accept client");

            System.out.println("5 before writing data to client");
            DataOutputStream dataOutputStream = new DataOutputStream(client.getOutputStream());
            dataOutputStream.writeBytes("hello/n");
            System.out.println("6 after writing data to client");

            System.out.println("7 before closing connection to the client");
            client.close();
            System.out.println("8 after closing connection to the client");


    }

            catch(IOException e){
            e.printStackTrace();
        }
    }

}