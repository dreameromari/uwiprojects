/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author dream
 */
public class ZhenHunters
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        System.out.println("Welcome To Zhen Hunters do enjoy your experience"); //welcomes user to game
        
        GameGrid GridPlayGame = new GameGrid();   //calls Gamegrid
        GridPlayGame.setupGrid();                 //calls grid to setup
        GridPlayGame.displayGrid();               //calls grid to be displayed
        GridPlayGame.zhenTurn();                  //moves zhen pieces
    }
    }
    

//ZhenHunters