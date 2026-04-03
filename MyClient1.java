import java.io.*;
import java.net.*;

public class MyClient1 {
    public static void main(String[] args)throws IOException{
        DatagramSocket dSocket=new DatagramSocket();
        InetAddress add=InetAddress.getByName("localhost");
        String str="* Message to Server from Client*";
        byte[]bufBytes=str.getBytes();
        DatagramPacket datagramPacket=new DatagramPacket(bufBytes,bufBytes.length,add,9000 );
        dSocket.send(datagramPacket);
        dSocket.close();
        
    }
    
}
