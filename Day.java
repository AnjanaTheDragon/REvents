import java.awt.*;
import java.io.*;
import java.util.*;

//Calendar calendar = new GregorianCalendar(2013,0,31);
//		System.out.println(sdf.format(calendar.getTime()));
      
public class Day {
   Calendar calendar;
   boolean specialness;
   String nameOfFile;
   public Day (Calendar calendar) {
      this.calendar = calendar;
      specialness = false;
   }
   public Day (Calendar calendar, String name) {
      this.calendar = calendar;
      specialness = true;
      nameOfFile = name;
      
   }
   public ArrayList<String> getSchedual () {
      ArrayList <String> returnData = new ArrayList <String>();
      if (calendar.DAY_OF_WEEK == 6 || calendar.DAY_OF_WEEK == 7) {
         returnData.add("No School!!");
         return returnData;
      } else {
         if (specialness) {//I don't want it to do anything because in this case, nameOfFile has already been defined.
         
         } else {
            if (calendar.DAY_OF_WEEK == 1 || calendar.DAY_OF_WEEK == 2 || calendar.DAY_OF_WEEK == 4 || calendar.DAY_OF_WEEK == 5) {
               nameOfFile = "normal s";
               if(calendar.DAY_OF_WEEK == 1) {
                  returnData.add("Monday,");
               } else if (calendar.DAY_OF_WEEK == 2) {
                  returnData.add("Tuesday");
               } else if (calendar.DAY_OF_WEEK == 4) {
                  returnData.add("Thursday");
               } else {
                  returnData.add("Friday");
               }
            } else {
               nameOfFile = "wen s";
               returnData.add("Wenesday,");
            }
            returnData.add("the " + calendar.MONTH + "th");
            try {
               File data = new File (nameOfFile + ".txt");
               Scanner scan = new Scanner(data);
               while (scan.hasNextLine()) {
                  returnData.add(scan.nextLine());
               }
            } catch (FileNotFoundException e) {
               returnData.add("Nothing Found");
            }
         }
         return returnData;
      }
   }
} 