package Assignment6;

import java.awt.Graphics;

public class Duplication {
    private int x;
    private int y;
    private int xDirection;
    private int yDirection;
    private Sprite sprite;
    public void setMovementVector(int xIncrement, int yIncrement) {
        xDirection = xIncrement;
        yDirection = yIncrement;
    }
}

