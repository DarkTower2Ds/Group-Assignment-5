public class Chicken extends Actor
{

<<<<<<< HEAD
	@Override
	public void move(char direction)
	{
		// Who knows what to do here...
=======
	//    Default constructor to set all the variable of the Player to the
//    center of the map.
//        - Write the definition for the move function take in user input and
//    move ‘P’ up, down, left right base on “awsd” and quit for ‘q’.
//    Remember to consider border check.
	public Chicken(){
		this.currRow = Math.random();
		this.currCol = Math.random();
		if(this.currCol == 4){
			this.currCol = Math.random()
		}
		if(this.currRow == 4){
			this.currRow = Math.random()
		}
		this.data = 'C';
>>>>>>> fe9beccb080951cdd24c07f0d01de6a7b94baf91
	}

	public void move(char direction){
		if(direction == 'w'){
			currRow =- 1;
		}

		else if(direction == 's'){
			currRow =+ 1;
		}

		else if(direction == 'a'){
			currCol =- 1;
		}

		else if(direction == 'd'){
			currCol =+ 1;
		}

		else{
			System.out.println("Invalid move! Please try again.");
			move(direction);
		}


	}


}
