public abstract class Actor {
    //currRow: int, currCol: int, data:char)
    protected int currRow;
    protected int currCol;
    protected char data;

    public int getCurrRow(){return currRow;}

    public int getCurrCol(){return currCol;}

    public char getData(){return data;}


    public boolean borderCheck();

    public abstract void move(char direction);


}
