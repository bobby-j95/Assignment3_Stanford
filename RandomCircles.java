import java.awt.Color;
import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

/*This program creates Random Circles with different sizes and 
 * colors at different places in the window.
 *Created by Robert Johns 
 */

public class RandomCircles extends GraphicsProgram {
	
	RandomGenerator v = new RandomGenerator();
	
	public void run() {
		
		//Randomly creates 10 balls of different size, colors, and positions
		for (int x=0; x<10; x++) {
			int r = (int) v.nextDouble(5, 50);
			Color rColor = v.nextColor();
			GOval ball = new GOval(v.nextDouble(0, getWidth()-r), v.nextDouble(0, getHeight()-r),
					     r, r);
			ball.setFilled(true);
			ball.setFillColor(rColor);
			add(ball);
		}
	}
	
	private static final int MAX_RADIUS_VALUE = 51;
}
