import java.util.Scanner;

public class RPG
{
	public static void main(String[] args)
	{
		Map map = new Map();
		Player player = new Player();
		Chicken chicken = new Chicken();
		Scanner input = new Scanner(System.in);
				
		char dir;		
		boolean keepGoing = true;
		while(keepGoing)
		{
			map.updateMap(chicken.getCurrRow(), chicken.getCurrCol(), chicken.getData());
			map.updateMap(player.getCurrRow(), player.getCurrCol(), player.getData());
			map.printMap();
			
			if((player.getCurrRow() == chicken.getCurrRow()) && (player.getCurrCol() == chicken.getCurrCol()))
			{
				System.out.println("\nChicken captured!\nGame over!");
				keepGoing = false;
			}
			else
			{
				System.out.println("\nUp: w | Down: s | Left: a | Right: d | Quit: q\nYour move: ");
				dir = input.next().toLowerCase().charAt(0);
				if(dir == 'q')
				{
					keepGoing = false;
				}
				else if(!(dir == 'w') && !(dir == 's') && !(dir == 'a') && !(dir == 'd'))
				{
					System.out.println("That is not a valid input. Please try again.");
				}
				else
				{
					if(!player.wouldBeOutOfBounds(dir))
					{
						player.move(dir);
						chicken.move();
					}
					else
					{
						System.out.println("You cannot move out of bounds!");
					}
				}
			}
		}
		
		input.close();
	}
}
