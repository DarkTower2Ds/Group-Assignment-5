public class Chicken extends Actor
{
	//    Default constructor to set all the variable of the Player to the
//    center of the map.
//        - Write the definition for the move function take in user input and
//    
//    Remember to consider border check.
	public Chicken()
	{
		data = 'C';
		
		boolean keepGoing = true;
		while(keepGoing)
		{
			currRow = (int) (Math.random() * 8) + 1;
			currCol = (int) (Math.random() * 8) + 1;
			
			//Turns out, if the chicken doesn't start on an even numbered row and col, the game is impossible to win...
			if(((currRow != 4) || (currCol != 4)) && ((currRow % 2 ==0) && (currCol % 2 == 0)))
			{
				keepGoing = false;
			}
		}
	}

	@Override
	public void move(char direction)
	{
		// Who knows what to do here...
	}
	
	public void move()
	{
		int dir;
		boolean keepGoing = true;
		while(keepGoing)
		{
			dir = (int) (Math.random() * 4) + 1;

			if(!wouldBeOutOfBounds(dir))
			{
				switch(dir)
				{
				case 1: currRow += 1;
						break;
				case 2: currRow -= 1;
						break;
				case 3: currCol -= 1;
						break;
				case 4: currCol += 1;
						break;
				default: System.out.println("There's been a terrible CHICKEN mistake...");
						 break;
				}
				
				keepGoing = false;
			}
		}
	}


}
