/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dream
 */
public class GluttonyException extends Exception
{
    public GluttonyException()
    {
        super(); //parent method
    }
    @Override
    public String toString()
    {
        return("Death by gluttony!"); //message displayed by exception
    }
    
}
