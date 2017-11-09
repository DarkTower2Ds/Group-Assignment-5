public abstract class Actor {
    //currRow: int, currCol: int, data:char)
    protected int currRow;
    protected int currCol;
    protected char data;

    public int getCurrRow(){return currRow;}

    public int getCurrCol(){return currCol;}

    public char getData(){return data;}

    public abstract void move(char direction);


    public boolean isAtBorder(){
        if(currCol == 8 || currRow ==8){
            return true;
        }
        else if(currCol == 0 || currRow ==0){
            return true;
        }
        else{
            return false;
        }

    }

<<<<<<< HEAD
=======
    public boolean borderCheck()
    {
    	return false;
    }
>>>>>>> f69e8444186d9d7d0fa4435cd08026a9beaa3fd3



}
