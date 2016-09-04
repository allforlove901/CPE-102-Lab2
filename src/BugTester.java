public class BugTester
{
   public static void main(String[] args)
   {
      Bug lady = new Bug(10);
      
      // make the bug move and turn a few times
      lady.move();
      lady.move();
      lady.turn();
      lady.move();
      
      // print the actual and expected position
      System.out.println(lady.getPosition());
      System.out.println("Expected: 11");
   }
}