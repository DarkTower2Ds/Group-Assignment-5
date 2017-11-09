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
    
    //dir is an int from 1-4. 1=Down, 2=Up, 3=Left, 4=Right
    public boolean wouldBeOutOfBounds(int dir)
    {
    	switch(dir)
    	{ //I'm mildly terrified by this, ngl... - Alex
    	case 1: if((currRow + 1) > 8)
    				{return true;}
		    	else
		    		{return false;}
    	case 2: if((currRow -1) < 0)
    				{return true;}
		    	else
					{return false;}
    	case 3: if((currCol - 1) < 0)
    				{return true;}
		    	else
		    		{return false;}
    	case 4: if((currCol + 1) > 8)
    				{return true;}
		    	else
		    		{return false;}
    	default: System.out.println("There's been a terrible mistake..."); 
    			 return false;
    	}
    }
    
    public boolean wouldBeOutOfBounds(char dir)
    {
    	switch(dir)
    	{ //I'm mildly terrified by this, ngl... - Alex
    	case 's': if((currRow + 1) > 8)
    				{return true;}
		    	else
		    		{return false;}
    	case 'w': if((currRow -1) < 0)
    				{return true;}
		    	else
					{return false;}
    	case 'a': if((currCol - 1) < 0)
    				{return true;}
		    	else
		    		{return false;}
    	case 'd': if((currCol + 1) > 8)
    				{return true;}
		    	else
		    		{return false;}
    	default: System.out.println("There's been a terrible mistake..."); 
    			 return false;
    	}
    }
}
