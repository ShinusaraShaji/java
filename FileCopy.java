package javaprograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream fi = new FileInputStream("BCA.txt");
            FileOutputStream fo = new FileOutputStream("MCA.txt");

            int i;

            
            while ((i = fi.read()) != -1)
            {
                fo.write(i);
            }

            System.out.println("Successfully copied one file to another");

            fi.close();
            fo.close();
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
