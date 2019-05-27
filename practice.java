import java.io.*;
import java.net.*;

public class practice{
    public static void main(String args[]){
        try {
            Socket s = new Socket("127.0.0.1", 4242);
            System.out.println(s);
            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);
            String advice = reader.readLine();
            System.out.println("Today you should : " + advice);
            reader.close();
            s.close();
        } catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
