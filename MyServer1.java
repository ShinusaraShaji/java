import java.io.*;
import java.net.*;

public class MyServer1 {
    public static void main(String[] args) {
        try {
            DatagramSocket dSocket = new DatagramSocket(9000);
            System.out.println("Server is waiting for message...");

            byte[] buf = new byte[256];
            DatagramPacket packet = new DatagramPacket(buf, buf.length);

            dSocket.receive(packet);

            // Important: use packet.getLength() to avoid extra garbage data
            String message = new String(packet.getData(), 0, packet.getLength());

            System.out.println("Server: " + message);

            dSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}