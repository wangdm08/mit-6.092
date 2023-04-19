package Assignment6;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    //Bouncer movingSprite;
    ArrayList<Sprite> boxes = new ArrayList<>();
    ArrayList<Bouncer> Sprites = new ArrayList<>();
    ArrayList<StraightMover> Movers =new ArrayList<>();

    /**
     * Initializes this class for drawing.
     */
    public DrawGraphics() {
        //Rectangle box = new Rectangle(15, 20, Color.RED);
        //Rectangle box1 =new Rectangle(25,10,Color.BLUE);
        boxes.add(new Rectangle(15, 20, Color.RED));
        boxes.add(new Oval(90, 80, Color.BLUE));
        Sprites.add(new Bouncer(100, 170, boxes.get(0)));
        Sprites.add(new Bouncer(150, 170, boxes.get(1)));
        Sprites.get(0).setMovementVector(3, 1);
        Sprites.get(1).setMovementVector(7, 8);
    }

    /**
     * Draw the contents of the window on surface.
     */
    public void draw(Graphics surface) {
        for (Bouncer Sprite : Sprites) {
            Sprite.draw(surface);
        }
        for (StraightMover Mover : Movers) {
        }
    }
}
