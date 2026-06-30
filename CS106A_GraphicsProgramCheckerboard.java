/**
 * File: CS106A_GraphicsProgramCheckerboard.java
 * ----------------------------
 * Generates a checkerboard pattern to the GCanvas.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class CS106A_GraphicsProgramCheckerboard extends GraphicsProgram
{
	private static final int N_ROWS = 8;
	private static final int N_COLUMNS = 8;
	
	public void run()
	{
		createCheckerboard();
	}
	
	
	private void createCheckerboard()
	{
		double sqSize = getHeight() / N_ROWS;

		for (int i = 0; i < N_ROWS; i++) { //rows lie horizontal but move down (y changes here)
			for (int j = 0; j < N_COLUMNS; j++){ //columns lie vertically, but move across (x changes here)
				double x = j * sqSize;
				double y = i * sqSize;
				GRect square = new GRect(x, y, sqSize, sqSize);
				square.setColor(Color.PINK);
				square.setFilled((i + j) % 2 == 0);//careful here, account for x AND y before testing
				add(square);
			}
		}
	}
}











