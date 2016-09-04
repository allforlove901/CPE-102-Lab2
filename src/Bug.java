/**
   This class models a bug that crawls along a horizontal line.
*/
public class Bug
{
	private int position = 0;
	private int direction = 1;
   /**
      Constructs a bug with a given position, facing right.
      @param initialPosition the initial position
   */
   public Bug(int initialPosition)
   {
      position = initialPosition;
   }
   
   /**
      Moves the bug by one unit in the current direction.
   */
   public void move()
   {
      position = position + direction;
   }
   
   /**
      Flips the direction of this bug. 
   */
   public void turn()
   {
      direction *= -1;
   }
   
   /**
      Gets the current position of this bug.
      @return the position
   */
   public int getPosition()
   {
      return position;
   }
}