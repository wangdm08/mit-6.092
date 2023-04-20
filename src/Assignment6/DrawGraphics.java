package Assignment6;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<Sprite> Sprites = new ArrayList<>();
    ArrayList<Bouncer> Bouncers = new ArrayList<>();
    ArrayList<StraightMover> StraightMovers =new ArrayList<>();
    ArrayList<Mover> Movers = new ArrayList<>();

    /**
     * Initializes this class for drawing.
     */
    public DrawGraphics() {
        Sprites.add(new Rectangle(15, 20, Color.RED));
        Sprites.add(new Oval(50, 30, Color.BLUE));
        Bouncers.add(new Bouncer(100, 170, Sprites.get(0)));
        Bouncers.add(new Bouncer(150, 120, Sprites.get(1)));
        Bouncers.get(0).setMovementVector(3, 1);
        Bouncers.get(1).setMovementVector(6, 4);
        StraightMovers.add(new StraightMover(30,30, Sprites.get(0)));
        StraightMovers.add(new StraightMover(70,70, Sprites.get(1)));
        StraightMovers.get(0).setMovementVector(2,7);
        StraightMovers.get(1).setMovementVector(3,8);
        Movers.add(Bouncers.get(0));
        Movers.add(StraightMovers.get(0));
        Movers.add(Bouncers.get(1));
        Movers.add(StraightMovers.get(1));
    }

    /**
     * Draw the contents of the window on surface.
     */
    public void draw(Graphics surface) {
        for (Mover mover : Movers) {
            mover.draw(surface);
        }
    }
}
