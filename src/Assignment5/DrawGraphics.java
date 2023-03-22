package Assignment5;

import java.awt.Color;
import java.awt.Graphics;

public class DrawGraphics {
    BouncingBox box;

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box = new BouncingBox(200, 50, Color.RED);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        surface.drawRect(10,10,90,60);
        surface.drawOval(70,70,60,60);
        surface.drawRoundRect(100,100,50,90,90,90);
        box.draw(surface);
    }
}