/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dream
 */
public abstract class MovablePiece extends GamePiece
{
    public abstract int[] calcNewPos(int direction);
    public abstract void moveToNewPos(int newRow, int newCol);
    
}
