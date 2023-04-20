package Assignment6;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<Sprite> boxes = new ArrayList<>();
    ArrayList<Bouncer> Sprites = new ArrayList<>();
    ArrayList<StraightMover> Straights =new ArrayList<>();
    ArrayList<Mover> Movers = new ArrayList<>();

    /**
     * Initializes this class for drawing.
     */
    public DrawGraphics() {
        boxes.add(new Rectangle(15, 20, Color.RED));
        boxes.add(new Oval(50, 30, Color.BLUE));
        Sprites.add(new Bouncer(100, 170, boxes.get(0)));
        Sprites.add(new Bouncer(150, 120, boxes.get(1)));
        Sprites.get(0).setMovementVector(3, 1);
        Sprites.get(1).setMovementVector(6, 4);
        Straights.add(new StraightMover(30,30, boxes.get(0)));
        Straights.add(new StraightMover(70,70, boxes.get(1)));
        Straights.get(0).setMovementVector(2,7);
        Straights.get(1).setMovementVector(3,8);
    }

    /**
     * Draw the contents of the window on surface.
     */
    public void draw(Graphics surface) {
        for (Bouncer Sprite : Sprites) {
            Sprite.draw(surface);
        }
        for (StraightMover Straight : Straights) {
            Straight.draw(surface);
        }
    }
}
