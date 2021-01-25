/*
 * CS 2050 - Computer Science II - Spring 2020
 * Instructor: Thyago Mota
 * Description: Activity 13 - KochSnowflake class
 */

import javax.swing.*;
import java.awt.*;

public class KochSnowflake extends JPanel {

    private int    depth;
    private double size;
    private int    xPixel, yPixel;
    private double direction; // remember: this value is in degrees (not radians!)
    private Color  color;

    static final int    MIN_DEPTH     = 0;
    static final double MIN_SIZE     = 10;

    KochSnowflake(int xPixel, int yPixel, int depth, double size, Color color) {
        super();

        // TODOd: finish implementation according to instructions
        if (xPixel < 0)
            this.xPixel = 0;
        else
            this.xPixel = xPixel;
        if (yPixel < 0)
            this.yPixel = 0;
        else
            this.yPixel = yPixel;
        if (depth < MIN_DEPTH)
            this.depth = MIN_DEPTH;
        else
            this.depth = depth;
        if (size < MIN_SIZE)
            this.size = MIN_SIZE;
        else
            this.size = size;
        direction = 0; // degrees
        this.color = color;
    }

    // TODOd: implement helper method according to instructions
    private void drawLine(Graphics g) {
        double directionRadians = Math.toRadians(direction);
        int xPixelNew = (int) Math.round( xPixel + Math.cos(directionRadians) * size);
        int yPixelNew = (int) Math.round( yPixel + Math.sin(directionRadians) * size);
        g.drawLine(xPixel, yPixel, xPixelNew, yPixelNew);
        xPixel = xPixelNew;
        yPixel = yPixelNew;
    }

    // TODOd: implement helper method according to instructions
    private void rotate(int degrees) {
        direction += degrees;
    }

    // TODOd: implement drawCurve according to instructions
    private void drawCurve(Graphics g, int depth) {
        // base case
        if (depth == 0)
            drawLine(g);
        else {
            drawCurve(g, depth - 1);
            rotate(60);
            drawCurve(g, depth - 1);
            rotate(-120);
            drawCurve(g, depth - 1);
            rotate(60);
            drawCurve(g, depth - 1);
        }
    }

    // TODOd: implement drawSnowflake according to instructions
    private void drawSnowflake(Graphics g) {
        drawCurve(g, depth);
        rotate(-120);
        drawCurve(g, depth);
        rotate(-120);
        drawCurve(g, depth);
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(color);
        drawSnowflake(g);
//        drawCurve(g, depth);
    }
}