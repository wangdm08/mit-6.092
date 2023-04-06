package Assignment5;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    BouncingBox box;
    BouncingBox boxOne;
    BouncingBox boxTwo;
    ArrayList<BouncingBox> animation = new ArrayList<BouncingBox>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box = new BouncingBox(200, 50, Color.RED);
        box.setMovementVector(-1,-1);
        animation.add(box);
        boxOne = new BouncingBox(100,100,Color.GREEN);
        boxOne.setMovementVector(5,1);
        animation.add(boxOne);
        boxTwo = new BouncingBox(50,200,Color.BLUE);
        boxTwo.setMovementVector(-5,0);
        animation.add(boxTwo);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        surface.drawRect(10,10,90,60);
        surface.drawOval(70,70,60,60);
        surface.drawRoundRect(100,100,50,90,90,90);
        for (int i = 0;i < animation.size();i++) {
            animation.get(i).draw(surface);
        }
//        box.draw(surface);
//        boxOne.draw(surface);
//        boxTwo.draw(surface);
    }
}