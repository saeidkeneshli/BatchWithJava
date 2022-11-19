import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        Process process =   Runtime.getRuntime().exec("test.bat");
//        process.waitFor();
        InputStream inputStream = process.getInputStream();
        int ascii = inputStream.read();
        String content="";
        while (ascii!=-1)
        {
            content+=(char) ascii;
            ascii = inputStream.read();
        }
        inputStream.close();
        System.out.println(content);

    }
}
