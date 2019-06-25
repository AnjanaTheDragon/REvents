import java.awt.*;
import java.io.*;
import java.util.*;
import java.text.*;

public class Cal {
   Calendar calendar;
   int xlength;
   int ylength;
   public Cal (int xlength, int ylength, Date today) {
      this.xlength = xlength;
      this.ylength = ylength;
      calendar = Calendar.getInstance();
	   calendar.setTime(today);
   }
   public void drawCalender (Graphics g) {
      for (int i = 0; i < 5; i++) {
         g.setColor(Color.GREEN);
         g.fillRect(0+i*xlength/5, ylength/2, xlength/5, ylength/4);
         g.setColor(Color.BLACK);
         g.drawRect(0+i*xlength/5, ylength/2, xlength/5, ylength/4);
         g.setColor(Color.GREEN);
         g.fillRect(0+i*xlength/5, ylength/4*3, xlength/5, ylength/4);
         g.setColor(Color.BLACK);
         g.drawRect(0+i*xlength/5, ylength/4*3, xlength/5, ylength/4);
      }
      SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM d");
      Calendar monday = calendar;
      monday.add(monday.DAY_OF_MONTH, -(7-monday.DAY_OF_WEEK)-1);
      java.util.Date utilDate = monday.getTime();
      String day = dateFormat.format(utilDate);
      System.out.println(day);
      try {
         File data = new File (day + " week.txt");
         Scanner scan = new Scanner(data);
         String special = scan.nextLine();
         for (int i = 0; i < 5; i++) {
            Calendar days = monday;
            days.add(days.DAY_OF_MONTH, i);
            Day five;
            if (special.equals("x")) {
               five = new Day (days);
            } else {
               five = new Day (days, special);
            }
            ArrayList<String> arraystringlist = five.getSchedual();
            for (int v = 0; v < arraystringlist.size(); v++) {
               g.setColor(Color.BLACK);
               g.drawString(arraystringlist.get(v), 0+i*xlength/5+1, ylength/2+11*(v+1));
            }
         }
      } catch (FileNotFoundException e) {
         g.drawString("Unknown", 1, ylength/2+11);
      }
      monday.add(Calendar.DAY_OF_MONTH, 7);
      utilDate = monday.getTime();
      day = dateFormat.format(utilDate);
      for (int i = 0; i < 5; i++) {
         Calendar days = monday;
         days.add(days.DAY_OF_MONTH, i);
         try {
            File data = new File (day + " week.txt");
            Scanner scan = new Scanner(data);
            String special = scan.nextLine();
            Day five;
            if (special.equals("x")) {
               five = new Day (days);
            } else {
               five = new Day (days, special);
            }
            ArrayList<String> arraystringlist = five.getSchedual();
            for (int v = 0; v < arraystringlist.size(); v++) {
               g.setColor(Color.BLACK);
               g.drawString(arraystringlist.get(v), 0+i*xlength/5+1, ylength/4*3+11*(v+1));
            }
         } catch (FileNotFoundException e) {
            g.drawString("Unknown", 1, ylength/4*3+11);
         }
      }
   }                                                                                                                                                                                                                                                                                                                                                                         
}