import java.util.List;

public class WeightClassRowGenerator
{
   
   
   public static void main(String args[])
   {
      //get the weight classes from the file
      WeightClassFileReader reader = new WeightClassFileReader();
      List<String> inputLines = reader.getFileLines();
      
      //Create weight classes from the file lines
      for (String inputLine: inputLines)
      {
         WeightClass weightClass = new WeightClass();
         weightClass.setValuesFromFileLine(inputLine);
         String sqlStatement = SQLInsertGenerator.generateInsertStatementFromWeightClass(weightClass);
         System.out.println(sqlStatement);
      }
   }

}
