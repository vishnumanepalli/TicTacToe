class Board 
{
    private char[][] grid; 
    private char ppos;
			
    public Board() 
    {
        grid = new char[3][3];
        ppos = 'x';
        inininst();
    }
    public void inininst() 
    {
        System.out.println("\t\t\tWelcome to Tic Tac Toe");
        System.out.println("position of locations are here!");
		System.out.println("-------------");
        for (int i = 0; i < 3; i++) 
        {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(3*i+j+1 + " | ");
                grid[i][j] = ' ';
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
    public void Display() 
    {
        for (int i = 0; i < 3; i++) 
        {
            System.out.println("--------------");
            System.out.print("| ");
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(grid[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("-------------");
    }
    public boolean Draw()
    {
        boolean var = true;
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                if (grid[i][j] == ' ') 
                {
                    var = false;
                    return var;
                }
            }
        }	
        return var;
    }
    public int Win() 
    {
        for (int i = 0; i < 3; i++) 
        {
            if (((grid[i][0] == grid[i][1]) && (grid[i][1] == grid[i][2])) == true) 
            {
                if (grid[i][0] == 'o')
				return +10;
			    else if (grid[i][0] == 'x')
				return -10;
            }
        }
        for (int i = 0; i < 3; i++) 
        {
            if (((grid[0][i] == grid[1][i]) && (grid[1][i] == grid[2][i])) == true) 
            {
                if (grid[0][i] == 'o')
				return +10;
			    else if (grid[0][i] == 'x')
				return -10;
            }
        }
        if(((grid[0][0] == grid[1][1]) && (grid[1][1] == grid[2][2]) == true) || ((grid[0][2] == grid[1][1]) && (grid[1][1] == grid[2][0]) == true))
        {
            if (grid[1][1] == 'o')
			return +10;
			else if (grid[1][1] == 'x')
			return -10;
        }
        return 0;
    }
    public void Next() 
    {
        if (ppos == 'x')
        ppos = 'o';
        else
        ppos = 'x';
    }
    public char pos()
    {
        return ppos;
    }
    public boolean update(int r, int c) 
    {
        if ((r >= 0) && (r < 3)) 
        {
            if ((c >= 0) && (c < 3)) 
            {
                if (grid[r][c] == ' ') 
                {
                    grid[r][c] = ppos;
                    return true;
                }
            }
        }
        return false;
    }
    public int minimax(int depth, Boolean isMax)
{
	int score = Win();
	if (score == 10)
		return score;
	if (score == -10)
		return score;
	if (Draw() == true)
		return 0;
	if (isMax)
	{
		int best = -1000;
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				if (grid[i][j]==' ')
				{
					grid[i][j] = 'x';
					int scor=minimax(depth+1,false);
					best = Math.max(best, minimax(depth + 1, !isMax));
					grid[i][j] = ' ';
				}
			}
		}
		return best;
	}
	else
	{
		int best = 1000;
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				if (grid[i][j] == ' ')
				{
					grid[i][j] = 'o';
					best = Math.min(best, minimax(depth + 1, !isMax));
					grid[i][j] = ' ';
				}
			}
		}
	return best;	
	}
}
public int findBestMove()
{
	int bestVal = -1000;
    int y=0;
	for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 3; j++)
		{
			if (grid[i][j] == ' ')
			{
				grid[i][j] = 'o';
				int moveVal = minimax(0, true);
				grid[i][j] = ' ';
				if (moveVal > bestVal)
				{
					y=3*i+j+1;
					System.out.println(moveVal);
					bestVal = moveVal;
				}
			}
		}
	}
	return y;
}

}
