package tictactoe2;

import org.junit.Test;
import static org.junit.Assert.*;

public class TicTacToeTest {

    @Test
    public void isGameOverDiagonal1() {
        // Arrange
        
        TicTacToe t3 = new TicTacToe(2);
        
        t3.setCell(0, 0, Cell.X);
        t3.setCell(1, 1, Cell.X);
        t3.setCell(2, 2, Cell.X);
        
        // Act
        boolean actual = t3.isGameOver();
        
        // Assert
        assertTrue( actual);

    }
    @Test
    public void isGameOverDiagonal2() {
        // Arrange
        
        TicTacToe t3 = new TicTacToe(2);
       
        
        t3.setCell(0, 2, Cell.X);
        t3.setCell(1, 1, Cell.X);
        t3.setCell(2, 0, Cell.X);
        
        // Act
        boolean actual = t3.isGameOver();
        
        // Assert
        assertTrue( actual);

    }
    @Test
    public void getWinner() {

    }
 
    @Test
    public void isGameOverRows() {}
 
    @Test
    public void isGameOverColumns() {}
    
 
    @Test
    public void isGameOverDraw() {} // game over since there are no more spaces
    
    @Test
    public void isValidMoveInRangeReturnsTrue() {} //
    @Test
    public void isValidMoveOutRangeReturnsFalse() {} 
    
    @Test
    public void isValidMoveCellOccupiedReturnsFalse() {} //
}
