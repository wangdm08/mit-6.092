package Assignment6;

import java.awt.Graphics;

public class Duplication {
    private int x;
    private int y;
    private int xDirection;
    private int yDirection;
    private Sprite sprite;
    public Duplication(int x, int y, int xDirection, int yDirection, Graphics surface) {
        x += xDirection;
        y += yDirection;

    }
}

