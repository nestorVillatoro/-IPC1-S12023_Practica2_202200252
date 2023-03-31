package com.mycompany.monkey;

import static com.mycompany.monkey.jpanel.contFinal;
import static com.mycompany.monkey.jpanel.contIn;
import static com.mycompany.monkey.jpanel.contIv;
import static com.mycompany.monkey.jpanel.contP;
import static com.mycompany.monkey.jpanel.contS;
import static com.mycompany.monkey.menu.tiempoEmpaq;
import static com.mycompany.monkey.menu.tiempoInv;
import static com.mycompany.monkey.menu.tiempoProd;
import static com.mycompany.monkey.menu.tiempoSal;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class circulo extends JPanel implements Runnable{
        private int x = 25;
        private int y =25;
        private int x1 = 170;
        private int y1 = 25;
        private int x2 = 170;
        private int y2 = 1000;
        private int x3 = 170;
        private int y3 = 1000;
        private int x4 = 1000;
        private int y4 = 475;
    private int dx = 2;
    private int dy = 2;
    private int a = 50;
    private int b = 50;   
    private int c = 50;  
    private int d = 50;  
    private int e = 50; 
    private int f = 50; 
    private int h = 50; 
    private int l = 50;
    public circulo(){
        Thread hilo = new Thread(this);
        hilo.start();
    }
    @Override
public void paint(Graphics g){
    super.paint(g);
    Graphics2D g2d = (Graphics2D)g;
    BasicStroke grosor = new BasicStroke(3);
    //inicio
    g.setColor(new Color(135, 135, 135));
    g.fillRoundRect(0, 0, 100, 100, 20, 20);
    g.setColor(Color.black);
    g.drawRoundRect(0, 0, 100, 100, 20, 20);
    //inventario
    g.setColor(new Color(67, 88, 145));
    g.fillRoundRect(150, 0, 100, 100, 20, 20);
    g.setColor(Color.black);
    g.drawRoundRect(150, 0, 100, 100, 20, 20);
    //producción
    g.setColor(new Color(67, 145, 87));
    g.fillRoundRect(150, 150, 100, 100, 20, 20);
    g.setColor(Color.black);
    g.drawRoundRect(150, 150, 100, 100, 20, 20);
    //empaquetado
    g.setColor(new Color(145, 67, 124));
    g.fillRoundRect(150, 300, 100, 100, 20, 20);
    g.setColor(Color.black);
    g.drawRoundRect(150, 300, 100, 100, 20, 20);
    //salida
    g.setColor(new Color(150, 29, 73));
    g.fillRoundRect(150, 450, 100, 100, 20, 20);
    g.setColor(Color.black);
    g.drawRoundRect(150, 450, 100, 100, 20, 20);
    //final
    g.setColor(new Color(214, 166, 77));
    g.fillRoundRect(0, 450, 100, 100, 20, 20);
    g.setColor(Color.black);
    g.drawRoundRect(0, 450, 100, 100, 20, 20);
    g2d.setStroke(grosor);
    g.setColor(Color.black);
    g.drawOval(x, y, e, e);
    g.drawOval(x1, y1, h, h);
    g.drawOval(x2, y2, d, d);
    g.drawOval(x3, y3, f, f);
    g.drawOval(x4, y4, l, l);
    /*g.drawOval(25, 25, a, a);
    g.drawOval(170, 25, b, b);*/
}
    @Override
    public void run() {
        int tiempo = 3;
               for (int i = 0; i < 30; i++) {
                   /*if (i==29){
                   a=0;
                   b=0;
                   }
                   if (contIv == 0){
                   c=0;
                   d=0;
                   }
                   repaint();*/
        //Inicio a Inv
            x=25;
        while (x!=171){
            x += dx;
            if(contIv==0){
                e=0;
            }
            repaint();
            try{
                Thread.sleep(tiempo);
            }catch(InterruptedException ex){
                System.out.println("error");
            }
        }
        //Inv a Prod
        if(contIv==tiempoInv){
            y1=25;
        while (y1!=171){
            y1 += dy;
            repaint();
            try{
                Thread.sleep(tiempo);
            }catch(InterruptedException ex){
                System.out.println("error");
            }
        }
        }
        if(contIn==0){
        if(contIv!=0){
            y1=25;
            while (y1!=171){
            y1 += dy;
            repaint();
            try{
                Thread.sleep(tiempo);
            }catch(InterruptedException ex){
                System.out.println("error");
            }
        }
        }else{
            h=0;
        }
            }
        
        //Prod a Empaq
        if(contP==tiempoProd){
            y2=171;
        while (y2!=321){
            y2 += dy;
            repaint();
            try{
                Thread.sleep(tiempo);
            }catch(InterruptedException ex){
                System.out.println("error");
            }
        }
        }
        if(contIn==0){
        if(contP!=0){
            y2=171;
            while (y2!=321){
            y2 += dy;
            repaint();
            try{
                Thread.sleep(tiempo);
            }catch(InterruptedException ex){
                System.out.println("error");
            }
        }
        }else{
            d=0;
        }
            }
        
        //Empaq a Sal
        if(contS==tiempoSal){
            y3=321;
        while (y3!=475){
            y3 += dy;
            repaint();
            try{
                Thread.sleep(tiempo);
            }catch(InterruptedException ex){
                System.out.println("error");
            }
        }
        }
        if(contIn==0){
        if(contS!=0){
            y3=321;
            while (y3!=475){
            y3 += dy;
            repaint();
            try{
                Thread.sleep(tiempo);
            }catch(InterruptedException ex){
                System.out.println("error");
            }
        }
        }else{
            f=0;
        }
            }
        // Sal a Final
        if(contFinal!=0){
          x4=171;
        while (x4!=25){
            x4 -= dx;
            if(contFinal==30){
                l=0;
            }
            repaint();
            try{
                Thread.sleep(tiempo);
            }catch(InterruptedException ex){
                System.out.println("error");
            }
        }  
        }
        
        
        
        }
        }
        }
    
    

