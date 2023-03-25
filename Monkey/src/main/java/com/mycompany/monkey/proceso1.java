package com.mycompany.monkey;

import java.awt.Graphics;
import javax.swing.JPanel;

public class proceso1 extends JPanel implements Runnable{
int segundos =0;
int minutos = 0;
String contador = "00:00";
public proceso1(){
    Thread hilo = new Thread(this);
    hilo.start();
}
@Override
public void paint(Graphics g){
    super.paint(g);
    g.drawString(contador, 100, 50);   
}
    @Override
    public void run() {
        while (true){
            if (segundos == 60){
                minutos++;
                        segundos = 0;
            }
            if (segundos <10){
                System.out.println(minutos + ":0" + segundos);
                contador = minutos + ":0" + segundos;
            }else {
                System.out.println(minutos+":"+segundos);
                contador = minutos + ":" + segundos;
            }
            repaint();
            try{
                Thread.sleep(1000);
                segundos++;
            }catch(InterruptedException ex){
                System.out.println("error");
            }
        }
    
}
}
