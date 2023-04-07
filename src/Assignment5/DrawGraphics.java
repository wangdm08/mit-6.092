package Assignment5;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    BouncingBox box;
    ArrayList<BouncingBox> boxes = new ArrayList<BouncingBox>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box = new BouncingBox(200, 50, Color.RED);
        boxes.add(new BouncingBox(200, 50, Color.RED));
        boxes.add(new BouncingBox(10, 10, Color.BLUE));
        boxes.add(new BouncingBox(100, 100, Color.GREEN));
        boxes.get(0).setMovementVector(1, 0);
        boxes.get(1).setMovementVector(-3, -2);
        boxes.get(2).setMovementVector(1, 1);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        box.draw(surface);
        surface.fillRect (150, 100, 25, 40);
        surface.fillOval (40, 40, 25, 10);
        surface.setColor (Color.YELLOW);
        surface.drawString ("Mr. And Mrs. Smith", 200, 10);
        for (BouncingBox box : boxes) {
            box.draw(surface);
        }
    }
}
