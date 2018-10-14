
public class SQLInsertGenerator
{
   
   public static String generateInsertStatementFromWeightClass(WeightClass weightClass)
   {
      String insertStatement = null;
      
      insertStatement = "Insert into SportsAdmin.Class (Name,WeightMin,WeightMax,AgeMin,AgeMax,Abbreviation," +
         "Description,UseAgeAsOf,ID_League,ID_Division,ID_SportSeason,ID_StatusClass) Values (" + 
         "'" + weightClass.Name + "'," +
         weightClass.weightMin + "," + 
         weightClass.weightMax + "," +
         weightClass.ageMin + "," + 
         weightClass.ageMax + "," + 
         weightClass.abbreviation + "," + 
         weightClass.description + "," +
         "'" + weightClass.useAgeAsOf + "'," +
         weightClass.leagueId + "," +
         weightClass.divisionId + "," +
         weightClass.seasonId + "," +
         weightClass.classStatus + 
         ");";
      
      return insertStatement;
      
   }
   
   

}
