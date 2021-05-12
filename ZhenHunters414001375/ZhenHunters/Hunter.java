/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dream
 */
public class Hunter extends MovablePiece implements CalcEatingMoves,CalcStraightMoves,CalcDiagonalMoves //inheritance between Hunter and parent GamePiece
{    
    //class datat members for Hunter
    public int energyLevel;         //shows the current energy level of a hunter
    final int MAXENERGY = 6;  //maximum energy constant of hunter
    char hName;      //indicates the character the player chooses for a hunter
    private int[]position;
    int timesNotEaten;  //shows the numbers of rounds since the hunter last ate    
    
    //methods
    public Hunter()         //constructor
    {
        type= "hunter";    //intializing hunter to type
        symbol= 'H';       //intializing symbol to H
        energyLevel= 4;     // energy level of hunter set to 4 
        GamePiece Hunter= new GamePiece();
}
    public void  setEnergyLevel(int S)
    {
        energyLevel  = S;
        
    }
    public void sethName (char J)     
    {
        hName = J;
        
    }
    
    public int getEnergyLevel()
    {
        return energyLevel;
    }
    public int getMAXENERGY()
    {
        return MAXENERGY;
    }
    public char gethName()
    {
        return hName;
    }
     public int[] calcNewPos(int direction)
     {
         int [] position = new int [2];
         
         if (direction == 1) //integer variable to move and eat in direction up
         {
             calcMoveUp();
             calcEatUp();
             
         }
         else
             if (direction == 2)  //integer variable to move and eat in direction right
             {
                 calcMoveRight();
                 calcEatRight();
             }
         if (direction == 3) //integer variable to move and eat in direction down
         {
             calcMoveDown();
             calcEatDown();
         }
     else 
             if (direction == 4)  //integer variable to move and eat in drection left
             {
                 calcMoveLeft();
                 calcEatLeft();
                 
             }
         else
                 if (direction == 5) //integer variable for up-left
                 {
                     calcMoveUpLeft();
                 }
         else
                     if (direction == 6) //integer variable for up-right
                     {
                         calcMoveUpRight();
                     }
         else
                         if(direction == 7) //integer variable for down-right
                         {
                             calcMoveDownRight();
                         }
         else
              if (direction == 8)       //integer variable for down-left
              {
                  calcMoveDownLeft();
              }
         return position;
         
       }
   public void moveToNewPos(int newRow,int newCol)  //updates data members on current postions to aid in moving the hunter 
       setRowPos(newRow);
       setColPos(newCol);
   }
   
   @Override
   public void calcMoveLeft()
   {
       position[0]=rowPos;
       position[1]=colPos-1;
   }
   @Override
   public void calcEatLeft()
   {
       position[0]=rowPos;
       position[1]=colPos-1;
   }
   @Override
   public void calcMoveRight()
   {
     position[0]=rowPos;
     position[1]=colPos+1;
     
   }
   @Override
   public void calcEatRight()
   {
       position[0]=rowPos;
       position[1]=colPos+1;
   }
   @Override
   public void calcMoveUp()
   {
       position[0]=rowPos-1;
       position[1]=colPos;
       
   }
   @Override
   public void calcEatUp()
   {
       int colPos=getColPos();
       int rowPos=getRowPos();
       rowPos--;
       position[0]=rowPos-1;
       position[1]=colPos;
   }
   @Override
   public void calcMoveDown()
   {
       position[0]=rowPos+1;
       position[1]=colPos;
   }  
   
   @Override
   public void calcEatDown()
   {
       position[0]=rowPos+1;
       position[1]=colPos;
   }
   @Override
   public void calcMoveUpLeft()
   {
       position[0]=rowPos-1;
       position[1]=colPos-1;
   }
   @Override
   public void calcMoveUpRight()
   {
       position[0]=rowPos-1;
       position[1]=colPos+1;
   }
   @Override
   public void calcMoveDownLeft()
   {
       position[0]=rowPos+1;
       position[1]=colPos-1;
   }
   @Override
   public void calcMoveDownRight()
   {
       position[0]=rowPos+1;
       position[1]=colPos+1;
       
   }
}//Hunter

