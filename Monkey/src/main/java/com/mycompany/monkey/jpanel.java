package com.mycompany.monkey;

import static com.mycompany.monkey.menu.tiempoEmpaq;
import static com.mycompany.monkey.menu.tiempoInv;
import static com.mycompany.monkey.menu.tiempoProd;
import static com.mycompany.monkey.menu.tiempoSal;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class jpanel extends JPanel implements Runnable{
public static byte contFinal=0;
public static byte contIn=1;
public static byte contIv=1;
public static byte contP=1;
public static byte contE=1;
public static byte contS=1;
int segundos =0;
int minutos = 0;
public static String contador = "0:00";
String Linicio = "Inicio: ";
String Linv = "Inventario: ";
String Lprod = "Producción: ";
String Lempaq = "Empaquetado: ";
String Lsal = "Salida: ";
String Lfinal = "final: ";
public jpanel(){
    Thread hilo = new Thread(this);
    hilo.start();
}
@Override
public void paint(Graphics g){
    super.paint(g);
    Graphics2D g2d = (Graphics2D)g;
    BasicStroke grosor = new BasicStroke(3);
    g2d.setStroke(grosor);
    /*//inicio
    g.setColor(new Color(135, 135, 135));
    g.fillRoundRect(50, 150, 100, 100, 20, 20);
    g.setColor(Color.black);
    g.drawRoundRect(50, 150, 100, 100, 20, 20);
    //inventario
    g.setColor(new Color(67, 88, 145));
    g.fillRoundRect(200, 150, 100, 100, 20, 20);
    g.setColor(Color.black);
    g.drawRoundRect(200, 150, 100, 100, 20, 20);
    //producción
    g.setColor(new Color(67, 145, 87));
    g.fillRoundRect(200, 300, 100, 100, 20, 20);
    g.setColor(Color.black);
    g.drawRoundRect(200, 300, 100, 100, 20, 20);
    //empaquetado
    g.setColor(new Color(145, 67, 124));
    g.fillRoundRect(200, 450, 100, 100, 20, 20);
    g.setColor(Color.black);
    g.drawRoundRect(200, 450, 100, 100, 20, 20);
    //salida
    g.setColor(new Color(150, 29, 73));
    g.fillRoundRect(200, 600, 100, 100, 20, 20);
    g.setColor(Color.black);
    g.drawRoundRect(200, 600, 100, 100, 20, 20);
    //final
    g.setColor(new Color(214, 166, 77));
    g.fillRoundRect(50, 600, 100, 100, 20, 20);
    g.setColor(Color.black);
    g.drawRoundRect(50, 600, 100, 100, 20, 20);*/
    g.setColor(Color.black);
    g.drawString(contador, 155, 50); 
    g.drawString(Linicio, 60, 140); 
    g.drawString(Linv, 310, 200); 
    g.drawString(Lprod, 310, 350); 
    g.drawString(Lempaq, 310, 500); 
    g.drawString(Lsal, 310, 650); 
    g.drawString(Lfinal, 60, 720); 
}

    @Override
public void run() {
    byte contF=0;
    byte contInicio=30;
    byte contInv=0;
    byte contProd=0;
    byte contEmpaq=0;
    byte contSal=0;
    while (contF!=30){
       
    //contador
    if (segundos == 60){
        minutos++;
        segundos = 0;
    }
    if (segundos <10){
        contador = minutos + ":0" + segundos;
    }else {
        contador = minutos + ":" + segundos;
    }
    
    //contador inicio
    if(contInicio!=0){
    contInicio--;
    Linicio= "Inicio: " + contInicio;
    }
    
    //contador inventario
    if(contInv!=tiempoInv && contInicio!=0){
    contInv++; 
    Linv= "Inventario: " + contInv;
    }
    if(contInicio==0){
        if(contInv!=0){
        contInv--;
    Linv= "Inventario: " + contInv;
    }
        }
    
    //contador produccion
    if(contInv==tiempoInv && contProd!=tiempoProd && contInv!=0){
        contProd++;
    Lprod= "Producción: " + contProd;
    }
    if (contInv==0){
    if(contProd!=0){
    contProd--;
    Lprod= "Producción: " + contProd;
    }
    }
    
    //contador Empaquetado
    if(contProd==tiempoProd && contEmpaq!=tiempoEmpaq && contProd!=0){
    contEmpaq++;
    Lempaq= "Empaquetado: " + contEmpaq;
    
    }
    if (contProd==0 && contEmpaq!=0){
    contEmpaq--;
    Lempaq= "Empaquetado: " + contEmpaq;
    }
    
    //contador salida
    if(contEmpaq==tiempoEmpaq && contSal!=tiempoSal && contEmpaq!=0){
    contSal++;
    Lsal= "Salida: " + contSal;
    }
    if (contEmpaq==0 && contSal!=0){
    contSal--;
    contF++;
    Lsal= "Salida: " + contSal;
    Lfinal= "Final: " + contF;
    }
    
    //contador final
    if(contSal==tiempoSal){
    if(contF!=30){
    contF++;
    Lfinal= "Final: " + contF;
    }
    }
    
    repaint();
    try{
    Thread.sleep(1000);
    segundos++;
    }catch(InterruptedException ex){
    System.out.println("error");
    }
    contFinal = contF;
    contIn= contInicio;
    contIv= contInv;
    contP= contProd;
    contE= contEmpaq;
    contS= contSal;
    }
    
}

}
