import java.awt.*;
import java.io.*;
import java.util.*;
import java.text.*;

public class IOTest {
/*   public static void main (String [] args) {
      Day five = new Day (3, 4);
      ArrayList<String> fivish = five.getSchedual();
      String fiveS = "";
      for(int i = 0; i < fivish.size(); i++) {
         fiveS = fiveS +"\n"+ fivish.get(i);
      }
      System.out.print(fiveS);
      DrawingPanel panel = new DrawingPanel(400, 600);
      Graphics g = panel.getGraphics();
      g.drawString("girdy", 0, 10);
   }
   */
   public static void main (String [] args) throws ParseException {
      Date today = new Date();
      System.out.println(today);
      SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("MMMM dd");
      String date = DATE_FORMAT.format(today);
      System.out.println("Today in dd/MM/yy pattern : " + date);
      SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
   	String dateInString = "31-08-1982 10:20:56";
		sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");	
		Calendar calendar = new GregorianCalendar(2013,0,31);
		System.out.println(sdf.format(calendar.getTime()));
   }
}
/*
    Calendar cal = Calendar.getInstance();
    cal.clear();

    java.util.Date utilDate = cal.getTime();
    System.out.println(utilDate);
*/










































































 /*  
 
 
 
  
 
  
  
 
  
  
 The void surrounds the fallen god of ice
 Of fire, too, and darkness, endless night.
 And He remembers crushing gods like mice,
 And smiling, He grins, glowing darkly bright.
 He threw down pillars, killing, ending light
 His chains were once a crown for he was king
 He poison'd land, cast worlds to endless blight
 The universe once was his accursed ring.
 But now all He can do is wait, plotting
 His three jewels, His three Stars, lost forever,
 The end must come and darkness is falling
 And He will He will give up, oh, never!
 And his brother will fall, the red blood flows,
 And He knows He will rule, the darkness grows.

  
  
 
  
  
 
  
  
 
  
  
 
  
  
 
  
  */