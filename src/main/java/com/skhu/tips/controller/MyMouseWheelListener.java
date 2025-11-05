package com.skhu.tips.controller;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import com.skhu.tips.view.map.MapPanel;

//마우스 휠 이벤트 리스너
//zoom-in, zoom-out 구현

public class MyMouseWheelListener implements MouseWheelListener{
	private final MapPanel panel;
	
	public MyMouseWheelListener(MapPanel panel) {
		this.panel = panel;
	}
	
	
	public void mouseWheelMoved(MouseWheelEvent e) {
		int n = e.getWheelRotation();
		int size = 10; //사이즈 배율, 10만큼 커지거나 작아짐
		
		 int w = panel.getImgW();
	     int h = panel.getImgH();
		
		
		if(n < 0) { // 확대
			w += size; h += size;
        }
        else {      // 축소
        	w = Math.max(10, w - size);
            h = Math.max(10, h - size);
        }
		
		panel.setImgSize(w, h);
		
	}
	
	
}
