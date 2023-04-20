/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.java.desktop_java;

/**
 *
 * @author HP
 */
import java.awt.*;
import java.awt.image.ImageObserver;
import javax.swing.JFrame;

public  class MyCanvas extends Canvas{
    public void paint(Graphics g){
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i =t.getImage("d:\\gifImg.gif");
        g.drawImage(i,5,5, (ImageObserver) this);
    }
   
}
