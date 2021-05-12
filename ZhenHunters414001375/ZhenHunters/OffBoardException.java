/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dream
 */
public class OffBoardException extends Exception
{
    public OffBoardException()
    {
        super(); //parent method
    }
    @Override
    public String toString()
    {
        return("Jumping off board!");  //message displayed for exception
}
