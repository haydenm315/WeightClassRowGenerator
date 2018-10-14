
public class WeightClass
{
   public WeightClass()
   {
      this.useAgeAsOf = "2018-12-31 00:00:00";
      this.seasonId = 15;
      this.classStatus = 1;
      this.leagueId = 1;
      this.description = "NULL";  
   }
   
   public void setValuesFromFileLine(String inputLine)
   {
      String[] valueAry = inputLine.split("\t+");
      this.Name = valueAry[0];
      this.weightMin = Double.parseDouble(valueAry[1]);
      this.weightMax = Double.parseDouble(valueAry[2]);
      this.ageMin = Short.parseShort(valueAry[3]);
      this.ageMax = Short.parseShort(valueAry[4]);
      this.abbreviation = valueAry[5];
      this.description = valueAry[6];
      this.divisionId = Short.parseShort(valueAry[9]);
   }
   String Name;
   double weightMin;
   double weightMax;
   short ageMin;
   short ageMax;
   String abbreviation;
   String description;
   String useAgeAsOf;
   int leagueId;
   int divisionId;
   int seasonId;
   int classStatus;
   
   public String getAbbreviation()
   {
      if (abbreviation.contains("NULL"))
            return abbreviation;
      else
         return "'" + abbreviation + "'";
   }
}
