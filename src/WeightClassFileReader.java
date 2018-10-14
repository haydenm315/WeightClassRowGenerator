import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WeightClassFileReader
{
   public WeightClassFileReader() {
    
     weightClassesFile = Paths.get("data/WeightClassesData.txt");
           
   }
   Path weightClassesFile;
   
   public List<String> getFileLines()
   {
      List<String> linesAry = null;
      try
      {
         linesAry = Files.readAllLines(weightClassesFile);
      }
      catch (IOException e) { 
         System.out.println("IO Exception handled. ");
      }
           
      return linesAry;
   }
   
   public static void main(String[] args)
   {
      WeightClassFileReader reader = new WeightClassFileReader();
      List<String> lines =  reader.getFileLines();
      for (String line: lines)
         System.out.println(line);
   }
   
}
