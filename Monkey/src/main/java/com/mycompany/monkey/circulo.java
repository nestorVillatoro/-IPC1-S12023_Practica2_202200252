package com.mycompany.monkey;

import static com.mycompany.monkey.jpanel.contE;
import static com.mycompany.monkey.jpanel.contFinal;
import static com.mycompany.monkey.jpanel.contIn;
import static com.mycompany.monkey.jpanel.contIv;
import static com.mycompany.monkey.jpanel.contP;
import static com.mycompany.monkey.jpanel.contS;
import static com.mycompany.monkey.menu.tiempoEmpaq;
import static com.mycompany.monkey.menu.tiempoInv;
import static com.mycompany.monkey.menu.tiempoProd;
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
    private int b = 0;
    private int c = 0;
    private int d = 50;  
    private int e = 50; 
    private int f = 50; 
    private int h = 50; 
    private int l = 50;
    private int m = 0;
    private int n = 0;
    private int ñ = 0;
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
    g.drawOval(25, 25, a, a);
    g.drawOval(171, 25, b, b);
    g.drawOval(170, 171, c, c);
    g.drawOval(170, 321, m, m);
    g.drawOval(170, 475, n, n);
    g.drawOval(25, 475, ñ, ñ);
}
    @Override
    public void run() {
               while(true){ 
        
        //Inicio a Inv
            x=25;
        while (x!=171){
            x += dx;
            if(contIn==0){
                e=0;
            }
            
            repaint();
            try{
                Thread.sleep(6);
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
                Thread.sleep(3);
            }catch(InterruptedException ex){
                System.out.println("error");
            }
        }
        }
        if(contIv==tiempoInv-1){
            y1=25;
        while (y1!=171){
            y1 += dy;
            repaint();
            try{
                Thread.sleep(3);
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
                Thread.sleep(3);
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
                Thread.sleep(3);
            }catch(InterruptedException ex){
                System.out.println("error");
            }
        }
        }
        if(contP==tiempoProd-1){
            y2=171;
        while (y2!=321){
            y2 += dy;
            repaint();
            try{
                Thread.sleep(3);
            }catch(InterruptedException ex){
                System.out.println("error");
            }
        }
        }
        if(contIv==0){
        if(contP!=0){
            y2=171;
            while (y2!=321){
            y2 += dy;
            repaint();
            try{
                Thread.sleep(3);
            }catch(InterruptedException ex){
                System.out.println("error");
            }
        }
        }else{
            d=0;
        }
            }
        
        //Empaq a Sal
        if(contE==tiempoEmpaq){
            y3=321;
        while (y3!=475){
            y3 += dy;
            repaint();
            try{
                Thread.sleep(3);
            }catch(InterruptedException ex){
                System.out.println("error");
            }
        }
        }
            if(contE==tiempoEmpaq-1){
        y3=321;
        while (y3!=475){
        y3 += dy;
        repaint();
        try{
        Thread.sleep(3);
        }catch(InterruptedException ex){
        System.out.println("error");
        }
        }
        }
        if(contIv==0){
        if(contE!=0){
            y3=321;
            while (y3!=475){
            y3 += dy;
            repaint();
            try{
                Thread.sleep(3);
            }catch(InterruptedException ex){
                System.out.println("error");
            }
        }
        }else{
            f=0;
        }
            }
        // Sal a Final
        if(contFinal==0){
            if(contFinal==1){
              x4=171;
        while (x4!=25){
            x4 -= dx;
            if(contFinal==30){
                l=0;
            }
            repaint();
            try{
                Thread.sleep(5);
            }catch(InterruptedException ex){
                System.out.println("error");
            }
        }  
            }
        }else{
            x4=171;
        while (x4!=25){
            x4 -= dx;
            if(contFinal==30){
                l=0;
            }
            repaint();
            try{
                Thread.sleep(5);
            }catch(InterruptedException ex){
                System.out.println("error");
            }
        }
        }
        if(contIn==0){
            a=0;
            }
        if(contIv==0){
            b=0;
            }else{
            b=50;
        }
        if(contP==0){
            c=0;
            }else{
            c=50;
        }
        if(contE==0){
            m=0;
            }else{
            m=50;
        }
        if(contS==0){
            n=0;
            }else{
            n=50;
        }
        if(contFinal>0){
            ñ=50;
            }else{
            ñ=0;
        }
        }
               
        }
        }
    
    

