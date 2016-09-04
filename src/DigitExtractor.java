import java.util.Scanner;

public class DigitExtractor
{
	int currentDigit = 0;
	String reverse = "";
	
   /** 
   Constructs a digit extractor that gets the digits
   of an integer in reverse order. 
      \@param anInteger the integer to break up into digits 
   */
   public DigitExtractor(int anInteger) 
   {
	   System.out.println("Please enter a 5 digit integer: " + anInteger);
	   String num = Integer.toString(anInteger);
	   for(int numLength = num.length(); numLength>0; numLength--)
	   {
		   reverse += num.charAt(numLength-1);
	   }   	   
   }

   /** 
   Returns the next digit to be extracted. 
      \@return the next digit 
   */
   public void nextDigit() 
   {
	   currentDigit++;
	   System.out.println(reverse.charAt(currentDigit-1));
	   //return reverse.charAt(currentDigit-1);
   }
} 