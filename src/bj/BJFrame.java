package bj;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;
import javax.swing.border.LineBorder;
import javax.swing.SwingUtilities;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseMotionAdapter;

public class BJFrame extends JFrame {
	int aW = 1280;
	int aH = 1100;
	Color background = new Color(39, 119, 20);
	
	int gridX = 50;
	int gridY = 50;
	int gridW = 900;
	int gridH = 400;
	
	int cardSpacing = 10;
	int cardTW = gridW/6;
	int cardTH = gridH/6;
	int cardAW = cardTW-2*cardSpacing;
	int cardAH = cardTH-2*cardSpacing;
	
	int hsX = gridX + gridW +50;
	int hsY = gridY;
	int hsW = 230;
	int hsh = 400;
	
	int pmX = hsX;
	int pmY = hsY + hsh + 50;
	int pmW = hsW;
	int pmH = 200;

	public BJFrame() {
		this.setSize(aW + 6, aH + 29);
		this.setVisible(true);
		this.setTitle("BlackJack");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel myPanel = new MyPanel();
		this.setContentPane(myPanel);

	}

	public class MyPanel extends JPanel {

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(background);
			g.fillRect(0, 0, aW, aH);
			
			g.setColor(Color.black);
			g.drawRect(gridX, gridY, gridW, gridH);
			
			g.setColor(Color.black);
			g.drawRect(gridX, gridY+gridH+50, gridW, 500);
			
			g.drawRect(hsX, hsY, hsW, hsh);
			g.drawRect(pmX, pmY, pmW, pmH);
			
			
			for (int i=0; i<6; i++) {
				g.drawRect(gridX+i*cardTW+cardSpacing, gridY+cardSpacing, cardAW, cardAH);
				g.drawRect(gridX+i*cardTW+cardSpacing, gridY+cardSpacing+cardTH, cardAW, cardAH);

			}
		}

	}

}
