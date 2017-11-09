public class Map
{
	private char[][] map;
	
	public Map()
	{
		map = new char[9][9];
		
		for(int i = 0; i < 9; i++)
			for(int j = 0; j < 9; j++)
				map[i][j] = '-';
	}
	
	public void updateMap(int row, int col, char data)
	{
		for(int i = 0; i < 9; i++)
			for(int j = 0; j < 9; j++)
				if(map[i][j] == data)
					map[i][j] = '-';
		
		map[row][col] = data;
	}
	
	public void printMap()
	{
		for(int i = 0; i < 9; i++)
		{
			System.out.println();
			for(int j = 0; j < 9; j++)
				System.out.print("\t" + map[i][j]);
		}
	}
}
