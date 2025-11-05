package com.skhu.tips.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import com.skhu.tips.view.map.MapPanel;


public class MyMouseMotionListener implements MouseMotionListener, MouseListener{
	private final MapPanel panel;
	
	
	
	public MyMouseMotionListener(MapPanel panel) {
		this.panel = panel;
	}
	
	public void mousePressed(MouseEvent e) {
		panel.setCurrentXY(e.getX(), e.getY());
	}
	public void mouseDragged(MouseEvent e) {

        int dx = e.getX() - panel.getCurrent_X();
        int dy = e.getY() - panel.getCurrent_Y();


        panel.setXY(panel.getImgX() + dx, panel.getImgY() + dy);


        panel.setCurrentXY(e.getX(), e.getY());

        panel.repaint();
	}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseMoved(MouseEvent e) {}
}
