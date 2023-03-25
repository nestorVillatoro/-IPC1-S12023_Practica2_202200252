package com.mycompany.monkey;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class circulo extends JPanel implements Runnable{
    public circulo(){
        Thread hilo = new Thread(this);
        hilo.start();
    }
    @Override
public void paint(Graphics g){
    super.paint(g);
    Graphics2D g2d = (Graphics2D)g;
    BasicStroke grosor = new BasicStroke(3);
    g2d.setStroke(grosor);
    g.setColor(Color.black);
    g.drawOval(75, 190, 50, 50);
}
    @Override
    public void run() {
        while (true){
            
            repaint();
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ex){
                System.out.println("error");
            }
        }
    }
    
}
