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




}
