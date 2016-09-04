import java.util.Scanner;

/**
   This program converts meters to miles, feet, and inches.
*/
public class ConverterRunner
{
	
   public static void main(String[] args)
   {
	  final double MILE_TO_KM = 1.609;
	  final double M_TO_MILE = 1/1.609/1000;
	  final double M_TO_FEET = M_TO_MILE*5280;
	  final double M_TO_IN = M_TO_FEET*12;
      //Scanner in = new Scanner(System.in);
      System.out.println("Please enter a distance in meters: 100");
      //double meters = in.nextDouble();
   
      Converter c1 = new Converter(M_TO_MILE);
      Converter c2 = new Converter(M_TO_FEET);
      Converter c3 = new Converter(M_TO_IN);

      System.out.println("miles: " + c1.convertTo(100));
      System.out.println("feet: " + c2.convertTo(100));
      System.out.println("inches: " + c3.convertTo(100));   
   }
}