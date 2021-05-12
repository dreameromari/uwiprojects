/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dream
 */
public class Player 
{
    String name;  //contains the players name
    
    //methods
    public Player(String play)  //constructor
    {
        play="";
        
    }
    public void setName(String player)
    {
        name= player;
        
    }
    public String getName()
    {
        return name;             //returns name to player input
    }
}//Player
