/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dream
 */
public class GamePiece 
{
    //class data members for GamePiece
    String type;          //describes the type of the game piece
    char symbol;          //represents the game piece on the grid
    int rowPos;           //row where the game piece will be positioned
    int colPos;           //column where the game piece will be positioned
    
    //methods
    public GamePiece()    //constructor
    {
        type="?";              //initializes type to ?
                symbol='?';    //initializes symbol to ?
    }            
    
    public void  setType (String P)   
    {
     type=P ;
     
    }
    public void setSymbol (char Y)
    {
        symbol=Y ;
           
    }
    public void setRowPos (int V)
    {
        rowPos=V ;
    }   
    public void setColPos (int K)
    {
        colPos=K ;
    }
    
    public String getType()
    {
        return type;
    }
    public char getSymbol()    
    {
        return symbol;
    }
    public int getRowPos()
    {
        return rowPos;
    }
    public int getColPos()
    {
        return colPos;
    }
}//GamePiece    