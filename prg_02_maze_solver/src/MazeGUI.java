/*
 * CS 2050 - Computer Science II - Spring 2020
 * Instructor: Thyago Mota
 * Description: Prg02 - MazeGUI class
 * Your name(s):
 */

import javax.swing.*;
import java.awt.*;

class MazeGUI extends JFrame {

    private Maze maze;
    private Path path;
    static final int WIDTH    = 900;
    static final int HEIGHT   = 700;
    static final String TITLE = "CS 2050 - Prg02 (Maze Solver)";

    MazeGUI(final Maze maze) {
        setSize(MazeGUI.WIDTH, MazeGUI.HEIGHT);
        setTitle(MazeGUI.TITLE);
        this.maze = maze;
        this.path = null;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.GRAY);
        MazePanel mazePanel = new MazePanel(this);
        mazePanel.setPreferredSize(new Dimension(MazeGUI.WIDTH, MazeGUI.HEIGHT));
        setContentPane(mazePanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    Maze getMaze() {
        return maze;
    }

    void setPath(final Path path) {
        this.path = path;
    }

    Path getPath() { return path; }
}