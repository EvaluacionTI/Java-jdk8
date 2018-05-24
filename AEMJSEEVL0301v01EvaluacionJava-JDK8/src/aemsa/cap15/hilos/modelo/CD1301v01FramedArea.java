package aemsa.cap15.hilos.modelo;

import aemsa.cap15.hilos.CV1301v01PhilAnimator;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Panel;

/*
 * This class requires no changes from the 1.0 version.
 * It's kept here so the rest of the example can compile.
 */

public class CD1301v01FramedArea extends Panel {
    private CD1303v01PhilosopherArea philosopherArea;

    public CD1301v01FramedArea(CV1301v01PhilAnimator controller) {
        super();

        //Set layout to one that makes its contents as big as possible.
        setLayout(new GridLayout(1,0));

	philosopherArea = new CD1303v01PhilosopherArea(controller);
        add(philosopherArea);
        validate();
    }

    public Insets getInsets() {
        return new Insets(4,4,5,5);
    }

    public void paint(Graphics g) {
        Dimension d = getSize();
        Color bg = getBackground();

        g.setColor(bg);
        g.draw3DRect(0, 0, d.width - 1, d.height - 1, true);
        g.draw3DRect(3, 3, d.width - 7, d.height - 7, false);
    }

    public void stopButton() {
	philosopherArea.stopPhilosophers();
	philosopherArea.createPhilosophersAndChopsticks();
	philosopherArea.repaint();
    }

    public void startButton() {
	philosopherArea.startPhilosophers();
    }
}
