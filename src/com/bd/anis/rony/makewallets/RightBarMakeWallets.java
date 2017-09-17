package com.bd.anis.rony.makewallets;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class RightBarMakeWallets extends JPanel {
	Image bgImage = Toolkit.getDefaultToolkit().getImage("raw/rightbarmakewallets.png");
	/**
	 * Create the panel.
	 */
	public RightBarMakeWallets() {

	}
	@Override
	public void paintComponent(final Graphics g) {
	    super.paintComponent(g);
	    Dimension d = getSize();
	    if (bgImage != null)
	        g.drawImage(bgImage, 0, 0, d.width, d.height, this);
	}
}
