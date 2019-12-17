
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class DragBallPanel extends JPanel implements MouseListener, MouseMotionListener {
	private static final int BALL_DIAMETER = 40;

	private int _ballX = 50;
	private int _ballY = 50;

	private int _dragFromX = 0; // apasat atât in interiorul
	private int _dragFromY = 0; // dreptunghiului mingii.

	private boolean _canDrag = false;

	public DragBallPanel() {
		setPreferredSize(new Dimension(300, 300));
		setBackground(Color.blue);
		setForeground(Color.yellow);

		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillOval(_ballX, _ballY, BALL_DIAMETER, BALL_DIAMETER);
		// g.drawString(_ballX + ", " + _ballY, 15, 35);
	}

	public void mousePressed(MouseEvent e) {
		int x = e.getX(); // Save the x coord of the click
		int y = e.getY(); // Save the y coord of the click

		// int centerx = _ballX + BALL_DIAMETER / 2;
		// int centery = _ballY + BALL_DIAMETER / 2;

		if (x >= _ballX && x <= (_ballX + BALL_DIAMETER) && y >= _ballY && y <= (_ballY + BALL_DIAMETER)) {
			_canDrag = true;
			_dragFromX = x - _ballX; // how far from left
			_dragFromY = y - _ballY; // how far from top
		} else {
			_canDrag = false;
		}
	}

	public void mouseDragged(MouseEvent e) {
		if (_canDrag) {
			_ballX = e.getX() - _dragFromX;
			_ballY = e.getY() - _dragFromY;

			// --- Nu muta mingea in afara marginilor ecranului
			_ballX = Math.max(_ballX, 0);
			_ballX = Math.min(_ballX, getWidth() - BALL_DIAMETER);

			// --- Nu muta mingea pest marginile de sus sau jos
			_ballY = Math.max(_ballY, 0);
			_ballY = Math.min(_ballY, getHeight() - BALL_DIAMETER);

			this.repaint();
		}
	}

	public void mouseExited(MouseEvent e) {
		_canDrag = false;
	}

	public void mouseMoved(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
		 //Random rand= new Random();
		 //TODO
		 //this.repaint();
	}

	public void mouseReleased(MouseEvent e) {
	}
}