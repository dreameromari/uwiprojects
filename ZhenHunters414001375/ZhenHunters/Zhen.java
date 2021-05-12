/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dream
 */
public class Zhen extends MovablePiece implements CalcStraightMoves
{  //inherits from Gamepiece
    private int[] position;
    //methods
    public Zhen()  //constructor
    {
        type="zhen";  //intializing type to zhen
        symbol='Z';     //intializing symbol to Z
        GamePiece Zhen = new GamePiece();
        position = new int [2];  //holds zhen piece position
    }
    
    @Override
    public int[]calcNewPos(int direction) // calls method from interfaces to find out new position
    {
        int[]position = new int[2];
        
        if (direction ==1) //integer value for the up direction
        {
            calcMoveUp();
        }
        else
            if(direction ==2 ) //integer value for the right direction
            {
                calcMoveRight();
            }
        else
                if(direction ==3 )  //integer value for the down direction
                {
                    calcMoveDown();
                }
        else
                   if(direction ==4)  //integer value for the left direction
                   {
                       calcMoveLeft();
                   }
     
        return position;
    }
                             
   public void moveToNewPos(int newRow,int newCol)  //updates the data members that hold the current position
    {
        setRowPos(newRow);
        setColPos(newCol);
    }
    
    @Override
    public void calcMoveLeft()
    {
        position[0]= rowPos;
        position[1]= colPos-1;
        
    }
    
    @Override
    public void calcMoveRight()
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
    public void calcMoveDown()
    {
       position[0]= rowPos+1;
       position[1]=colPos;
       
    }
             
}//Zhen
