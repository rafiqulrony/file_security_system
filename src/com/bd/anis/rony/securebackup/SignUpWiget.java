package com.bd.anis.rony.securebackup;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class SignUpWiget extends JPanel {
	Image bgImage = Toolkit.getDefaultToolkit().getImage("raw/singupwigetbg.png");
	/**
	 * Create the panel.
	 */
	public SignUpWiget() {

	}
	@Override
	public void paintComponent(final Graphics g) {
	    super.paintComponent(g);
	    Dimension d = getSize();
	    if (bgImage != null)
	        g.drawImage(bgImage, 0, 0, d.width, d.height, this);
	}
}
