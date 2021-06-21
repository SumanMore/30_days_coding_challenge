import java.io.IOException;
import java.io.OutputStreamWriter;
public class q20 {
   public static void main(String args[]) throws IOException {
     
      OutputStreamWriter ob= new OutputStreamWriter(System.out);
      ob.write("Coding Wizard club");
      ob.flush();
   }
}