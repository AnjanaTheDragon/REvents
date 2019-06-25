import java.awt.*;
import java.io.*;
import java.util.*;
import java.text.*;

public class MainClass {
   public static int xPixels = 400;
   public static int yPixels = 600;
   public static void main (String [] args) {
      Scanner console = new Scanner(System.in); //this is to get the user input.
      Date today = new Date();
      DrawingPanel panel = new DrawingPanel(xPixels, yPixels);
      Graphics g = panel.getGraphics();
      SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd");
      String day = dateFormat.format(today);
      printer(g, day);
      Cal calender = new Cal (xPixels, yPixels, today);
      calender.drawCalender(g);
   }
   public static void printer (Graphics g, String day) {
      ArrayList <String> fileData = new ArrayList <String>();
      fileData.add("Daily Anouncements!");
      System.out.println(day);
      try {
         File data = new File (day + ".txt");
         Scanner scan = new Scanner(data);
         while (scan.hasNextLine()) {
            fileData.add(scan.nextLine());
         }
      } catch (FileNotFoundException e) {
         fileData.add("Nothing Found");
      }
      for (int v = 0; v < fileData.size(); v++) {
            g.setColor(Color.BLACK);
            g.drawString( fileData.get(v), 1, 11+11*v);
      }
   }
}