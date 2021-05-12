/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dream
 */
public class SpotTakenException extends Exception
{
    public SpotTakenException()
    {
        super();  //parent method
    }
    @Override
    public String toString()
    {
        return("Position Occupied!");  //message displayed for exception
    }
}
