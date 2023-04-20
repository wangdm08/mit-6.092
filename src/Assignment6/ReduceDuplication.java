package Assignment6;

import java.awt.Graphics;

public class ReduceDuplication {
    private int x;
    private int y;
    private int xDirection;
    private int yDirection;
    private Sprite sprite;
    public ReduceDuplication(int x, int y, int xDirection, int yDirection, Graphics surface) {
        x += xDirection;
        y += yDirection;

    }
}

