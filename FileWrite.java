import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite
{
    public static void main(String[] args)
    {
        try
        {
            Scanner s = new Scanner(System.in);

            System.out.print("\nEnter File Name : ");
            String fname = s.nextLine();

            FileWriter obW = new FileWriter(fname, true);

            System.out.print("\nEnter no. of entries in file : ");
            int n = s.nextInt();
            s.nextLine(); // fix buffer issue

            System.out.println("\nEnter " + n + " entries into file ");

            String data;

            for(int i = 0; i < n; i++)   // fixed loop
            {
                data = s.nextLine();
                obW.write(data + "\n");
            }

            obW.close();

            // Read File
            FileReader obR = new FileReader(fname);
            BufferedReader br = new BufferedReader(obR);

            String line;
            System.out.println("Data read from " + fname + " file:");

            while((line = br.readLine()) != null)
            {
                System.out.println(line);
            }

            br.close(); // added
            s.close();  // added
        }
        catch (IOException e)
        {
            System.out.println("----- Error -----");
        }
    }
}
