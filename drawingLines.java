import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.program.*;
import java.awt.event.MouseEvent;
import java.awt.event.*;


/*This allows the user to draw a line based off of the mouse click
 * Created by Robert Johns 10/5/2020
 */
public class drawingLines extends GraphicsProgram {
	
	public void run () {
		addMouseListeners();
	}
	
	//Gets position at where mouse was clicked
	public void mousePressed(MouseEvent m) {
		
		int x = m.getX();
		int y = m.getY();
		
		line = new GLine(x,y,x,y);
		add(line);		
		
	}
	
	//gets end point of mouse when click is released making the line
	public void mouseDragged(MouseEvent m) {
		
		int xEnd = m.getX();
		int yEnd = m.getY();
		line.setEndPoint(xEnd,yEnd);
		
	}
	
	private GLine line;
}
