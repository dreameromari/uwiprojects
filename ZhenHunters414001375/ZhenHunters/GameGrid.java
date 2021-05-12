/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.lang.*;
/**
 *
 * @author dream
 */
public class GameGrid 
{
    private int numRows; //number of rows on grid
    private int numCols;  //number of columns on grid
    GamePiece[][] grid;   //2-d array that holds Gamepiece objects
    Player player1, player2;  //player objects
     private int numZhens;   //number of zhens player selectss
     private int[] hunter1Coord = new int[2];  //position of hunter 1
     private int[] hunter2Coord = new int[2];   // position of hunter 2
     private int numHunters;   // shows the number of hunters still in play on the grid
     Hunter hunter1,hunter2;
     int zhenRow, zhenCol;   // zhen row and zhen column 
     int [] zhenLoc;  //vector that stores location of zhen
     Scanner myScanner = new Scanner(System.in);
             
             
    GameGrid()  //default constructor
    {
        numRows = 8;
        numCols = 8;
        grid = new GamePiece[numRows] [numCols];
        hunter1Coord = new int [2];   // holds position coordinate for hunter 1
        hunter2Coord = new int [2];  //holds position coordinate for hunter 2
    }
    boolean addGamePiece(GamePiece piece, int row, int col)  //method to add piece to the grid at the designated position using row and col
    {
        if (grid[row][col] == null) //checks to see if grid is empty
        {
            grid[row][col] = piece;
            piece.setRowPos (row);
            piece.setColPos (col);
            
            return true;
        }
        else
        {
           System.out.print("Error in addGamePiece Function");  //error here 
            return false;
        }
        }
    
    void setupGrid()
    {
        String player1Name, player2Name;
        int row;
        int col;
        
        
        System.out.println("Please enter the name for Player 1: "); //asks the user for the players name
        player1Name = myScanner.nextLine();     //reads the user input for the players name
        System.out.println("\t");
        player1 = new Player(player1Name);
        
        System.out.println("Please enter then name of player 2: ");//asks the user for player 2 name
        player2Name = myScanner.nextLine();   //reads the input for players 2 name
        System.out.println("\t");
        player2 = new Player(player2Name);
        
        Bramble bramble = new Bramble();
        Zhen zhen = new Zhen();
        hunter1 = new Hunter();
        hunter2 = new Hunter();
        
        //Top Left Corner Of Board
        for (row=0; row < 2; row++)
        {
            for (col=0; col < 2; col++)
            {
                if (!addGamePiece(bramble,row,col))
                {
                    System.out.print("Error not a valid input");
                    System.exit(0);
                }
                /*else
                {
                    addGamePiece(bramble,row,col);
                }*/
            }
        }
        //Top Right Corner Of Board 
         for (row=0; row < 2; row++)
        {
            for (col=6; col < 8; col++)
            {
                if (!addGamePiece(bramble,row,col))
                {
                    System.out.print("Error not a valid input");
                    System.exit(0);
                }
                /*else
                {
                    addGamePiece(bramble,row,col);
                }*/
            }
        }
         //Last Left Corner of Board
          for (row=6; row < 8;row++)
        {
            for (col=0; col < 2; col++)
            {
                if (!addGamePiece(bramble,row,col))
                {
                    System.out.print("Error not a valid input");
                    System.exit(0);
                }
               /*else
                {
                    addGamePiece(bramble,row,col);
                }*/
            }
        }
    

//Last Right Corner Of Board
for (row=6; row <8; row++)
        {
            for (col=6; col< 8;col++)
            {
                if (!addGamePiece(bramble,row,col))
                {
                    System.out.print("Error not a valid input");
                   System.exit(0);
                }
                /*else
                {
                    addGamePiece(bramble,row,col);
                }*/
            }
        }
//Zhen pieces part for numZhens
 System.out.println("Please enter the number of Zhens you would like to play with (only valid numbers are 16,18 and 20)");
 numZhens = myScanner.nextInt();
 {
    if (numZhens == 16 || numZhens == 18 || numZhens == 20 ) //if player selects 16
        {
            for (row=0;row < 2; row++)                                       
            {
            for (col=0; col < 8 ; col++) 
              {
                  //System.out.println("Updating "+row+" "+col);
                   if (col > 1 && col <6)
               {
                zhen = new Zhen();
                //System.out.print("Updating Zhen to grid");
            boolean Zhen = addGamePiece(zhen, row, col); 
             if (Zhen == false)
                {
                    System.out.print("Error Please Place Correctly");
                    return;
                }
               }
              }
            }
            for (row=2;row <3; row++)
            {
                for (col=0; col < 8;col++)
                {
                    zhen = new Zhen();
            boolean Zhen = addGamePiece(zhen, row, col);
            }
           }
           }
    if (numZhens == 18) //if player selects 18
    {
        for (row = 3; row < 4; row++)
                {
                    for (col = 0; col < 8; col++)
                    {
                     if (col == 0 || col == 7)       
                     {
                             zhen = new Zhen();
                         // System.out.print("Updating Zhen");
            boolean Zhen = addGamePiece(zhen, row, col); 
                 if (Zhen == false)
                {
                    System.out.print("Error Please Place Correctly");
                    return;
                }
                     }
                    }
                }
            }
    if (numZhens == 20)  //if user selects 20
    {
        for (row = 3; row < 4; row++)
                {
                    for (col = 0; col < 8; col++)
                    {
                     if (col == 0 || col == 7)       
                     {
                             zhen = new Zhen();
                         // System.out.print("Updating Zhen");
            boolean Zhen = addGamePiece(zhen, row, col); 
                 if (Zhen == false)
                {
                    System.out.print("Error Please Place Correctly");
                    return;
                }
                     }
                    }
                }
            }
    //Hunter pieces for Grid
    for (row=4; row < 5; row++) //Hunter1
            {
                for (col=3; col < 4; col++)
                {
                     //hunter1 = new Hunter();
            boolean h1 = addGamePiece(hunter1, row, col);
            numHunters++;
            if (h1 == false)
            {
                System.out.print("Error");
                    return;
            }
                }
                    hunter1Coord[0]=hunter1.getRowPos();  //hunter 1 positon on the row
                    hunter1Coord[1]=hunter1.getColPos(); //hunter 1 position on the column
            }
            
            for (row=4; row < 5; row++) //Hunter 2
            {
                for (col=4; col < 5; col++)
                {
                     //hunter2 = new Hunter();
            boolean h2 = addGamePiece(hunter2, row, col);
            numHunters++;
            if (h2 == false)
            {
                System.out.print("Error");
                    return;
            }
                }
                 hunter2Coord[0]=hunter2.getRowPos();  // hunter 2 position on the row
                hunter2Coord[1]=hunter2.getColPos();  //hunter 2 position on the column  
            }
             System.out.print("Please enter the Character for Hunter1: ");
        hunter1.sethName(myScanner.next().charAt(0)); 
        System.out.print("Please enter the Character for Hunter2: ");
        hunter2.sethName(myScanner.next().charAt(0));  
    }
//Assigning hunter 1 and 2 positions/coordinates on the rows and columns on the grid

   
    }    
    void displayGrid()
    {
    for (int row=0;row<8;row++)
    {
        for (int col=0;col < 8; col++)
        {
           // System.out.println("... ");
            if (grid[row][col] == null)
            {
                System.out.print(" |"+ " |");
            }
            else if (grid[row][col] instanceof Hunter)
            {
                 System.out.print(" | "+((Hunter)grid[row][col]).gethName()+"|");
            }
            else 
            {
                System.out.print(" |"+grid[row][col].getSymbol()+ "|");
            }
        }
        System.out.println();
    }
      //System.out.println ("Hunter"+((Hunter)grid[row][col]).getEnergyLevel()); 
     //System.out.println ("Number of Zhens"+((Zhen)grid[row][col]).getZhen());     //error when trying to update hunter energy and number of zhens    
    System.out.printf("Hunter %c energy: %d %n",((Hunter)hunter1).gethName(),hunter1.getEnergyLevel());
    System.out.printf("Hunter %c energy: %d %n",((Hunter)hunter2).gethName(),hunter2.getEnergyLevel());
    System.out.printf("Number of Zhens: %d %n",numZhens);       
    }//displayGrid
 
    public boolean isZhenPosition(int rowPos, int colPos)  //checks position of zhen on rows and columns of board
    {
		if ((grid[rowPos][colPos]) instanceof Zhen)
        {
			return true;
        }
		else 
		{
			return false;
		}
    }
    
    	public boolean ZhenNotValid()
	{         
		if ((zhenRow > 7 || zhenRow < 0 || zhenCol > 7 || zhenCol < 0))
                {
                    System.out.println("Location is off the grid");
                    return true;
                }
                
		else //position on grid
		{
			if (grid[zhenRow][zhenCol]== null)
			{
				System.out.println("Location is empty");
				return true;
			} 
			else 
			{
				if (!isZhenPosition(zhenRow,zhenCol))
				{
					System.out.println("Your piece is incorrect");
					return true; 
				}
				else 
				{
					if (zhenRow == 0)
					{
						if (grid[zhenRow][zhenCol+1] != null && grid[zhenRow][zhenCol-1] != null && grid[zhenRow+1][zhenCol] != null) 
						{
							System.out.println("Zhen is blocked in. Select another zhen piece.");
							return true;
						}
						else
						{
							return false;
						}
					}
					else if(zhenRow == 7) 
					{
						if (grid[zhenRow][zhenCol+1] != null && grid[zhenRow][zhenCol-1] != null && grid[zhenRow-1][zhenCol] != null)
						{
							System.out.println("Zhen is blocked in. Select another zhen piece.");
							return true;
						}
						else 
						{
							return false;
						}
                    }
                    else if (zhenCol == 0)
                        {
                            if (grid[zhenRow-1][zhenCol] != null && grid[zhenRow+1][zhenCol] != null && grid[zhenRow][zhenCol+1] != null)
                            {
                                System.out.println("Zhen is blocked in. Select another zhen piece.");
                                return true;
                            }
                            else
                            {
                                return false;
                            }
                        }
                    else if(zhenCol==7)
				    {
						if (grid[zhenRow-1][zhenCol] != null && grid[zhenRow+1][zhenCol] != null && grid[zhenRow][zhenCol-1] != null)
						{
							System.out.println("Zhen is blocked in.Select another zhen piece.");
							return true;
						}
						else 
						{
							return false;
						}
				    }
					else 
					{
						if (grid[zhenRow-1][zhenCol] != null && grid[zhenRow+1][zhenCol] != null && grid[zhenRow][zhenCol-1] != null && grid[zhenRow][zhenCol+1] != null)
						{
							System.out.println("Zhen is blocked in. Select another zhen piece.");
							return true; 
						}
						else 
						{
							return false;
						}
					}
				}  
			}  
		}
	}

        
    boolean validateMove(int row, int col) throws OffBoardException, SpotTakenException  //checks to see if move is valid on rows or columns if not an exception is thrown
    {   
		if (row > 7 || row < 0 || col > 7 || col < 0)
		{
			throw new OffBoardException();  
		}
		else if(grid[row][col] != null)
		{
			throw new SpotTakenException();
		}
		return true;
	}
   
	public void zhenTurn()
	{
		boolean yes;            //
		boolean valMove = false;
                GamePiece temp = new GamePiece();
       
		System.out.println("Please enter the row location of a Zhen Piece: ");
		zhenRow = myScanner.nextInt();
		System.out.println("Please enter the column location of a Zhen Piece: ");
		zhenCol = myScanner.nextInt();
       
        yes = ZhenNotValid();
		while (yes)
		{
			System.out.println("Please enter the row location of a Zhen Piece: ");
			zhenRow = myScanner.nextInt();
			System.out.println("Please enter the column location of a Zhen Piece: ");
			zhenCol = myScanner.nextInt();
			yes = ZhenNotValid();
		}      
          
            displayMovementOptions(1);  
          	
            
        while (!valMove) 
        {
			System.out.println("Please enter the location of travel for Zhen piece: ");
			int direction;
			direction = myScanner.nextInt();
			while (direction>4 || direction<1)
			{
				System.out.println("Invalid direction. Please enter the location of travel for Zhen piece: ");
				direction = myScanner.nextInt();
			}
			
			zhenLoc = ((Zhen)grid[zhenRow][zhenCol]).calcNewPos(direction);  
                        System.out.println("Zhen will now be moved to location :" +zhenLoc[0] +" "+ zhenLoc[1]);
                                          
                        
			try
			{
				valMove = validateMove(zhenLoc[0], zhenLoc[1]);
			}
	   
			catch (OffBoardException e)
			{
				System.out.println("Re-enter or die!");
			}
		
			catch (SpotTakenException e) 
			{   
				System.out.println("Another peice at destination!");
			}
       switch(direction)
	{
	case 1:
		 temp= grid[zhenRow][zhenCol] ;
		grid[zhenRow][zhenCol] = null;
		grid[zhenRow-1][zhenCol] = temp;
		break;
	case 2:
		 temp =	grid[zhenRow][zhenCol];
		grid[zhenRow][zhenCol] = null;
		grid[zhenRow][zhenCol+1] = temp;
		break;
	case 3:
		
		 temp=grid[zhenRow][zhenCol] ;
		grid[zhenRow][zhenCol] = null;
		grid[zhenRow+1][zhenCol] = temp;
		break;
		
	case 4:
		 temp =	grid[zhenRow][zhenCol] ;
		grid[zhenRow][zhenCol] = null;
		grid[zhenRow][zhenCol-1] = temp;
		break;
	default:
		System.out.println("Invalid option");
	}
 displayGrid();
        }
}//zhenTurn
        
    public void displayMovementOptions(int player)
    { 
		if (player == 1)
		{
			//Zhen movement options
			System.out.println("You are a Zhen and these are your movement options: ");
			System.out.println("1- Up     2- Right    3 - Down       4-Left");
		}
		else if (player == 2)
		{
			//Hunter movement options
			System.out.println("You are a Hunter and these are your movement options: ");
			System.out.println("1- Up     2- Right    3 - Down       4-Left");
			System.out.println("5-UpLeft  6-UpRiht    7-DownRight    8-DownLeft");
			System.out.println("You can only eat Up, Down, Left or Right");
		}  
    }

    
}//GameGrid




