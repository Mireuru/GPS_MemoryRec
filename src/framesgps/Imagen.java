/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package framesgps;

import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author mgarc
 */
public class Imagen {

    public Imagen() {
        
    }
    
    public void setImageBoton(int ancho,int alto, String n,JButton c){
        String nom = "/framesgps/img/" + n;
        ImageIcon img = new ImageIcon(getClass().getResource(nom));
        Image image = img.getImage();
        Image res = image.getScaledInstance(ancho, alto,  java.awt.Image.SCALE_SMOOTH);
        img = new ImageIcon(res);
        c.setIcon(img);
    }
    
    public void setImageBotonDisabled(int ancho,int alto, String n,JButton c){
        String nom = "/framesgps/img/" + n;
        ImageIcon img = new ImageIcon(getClass().getResource(nom));
        Image image = img.getImage();
        Image res = image.getScaledInstance(ancho, alto,  java.awt.Image.SCALE_SMOOTH);
        img = new ImageIcon(res);
        c.setDisabledIcon(img);
    }
    
    public void setImageLabel(int ancho,int alto, String n,JLabel c){
        String nom = "/framesgps/img/" + n;
        ImageIcon img = new ImageIcon(getClass().getResource(nom));
        Image image = img.getImage();
        Image res = image.getScaledInstance(ancho, alto,  java.awt.Image.SCALE_SMOOTH);
        img = new ImageIcon(res);
        c.setIcon(img);
    }
    
    public void setIconBoton(int [] num, String [] nom, JButton [] bot, int ancho, int alto){
        for (int i = 0; i < num.length; i++) {
            setImageBoton(ancho,alto,nom[num[i]-1],bot[i]);
        }
    }
    
    public void setIconBotonDisabled(int [] num, String [] nom, JButton [] bot, int ancho, int alto){
        for (int i = 0; i < num.length; i++) {
            setImageBotonDisabled(ancho,alto,nom[num[i]-1],bot[i]);
        }
    }
    
    public void setIconLabel(int [] num, String [] nom, JLabel [] lab, int ancho, int alto){
        for (int i = 0; i < num.length; i++) {
            setImageLabel(ancho,alto,nom[num[i]-1],lab[i]);
        }
    }
    
    public void setNumberBoton(int ancho,int alto, String n,JButton c){
        String nom = n;
        //ImageIcon img = new ImageIcon(nom);
       // Image image = img.getImage();
        //Image res = image.getScaledInstance(ancho, alto,  java.awt.Image.SCALE_SMOOTH);
        //img = new ImageIcon(res);
        c.setText(n);
    }
    
    public void setTextBoton(int [] num, String [] nom, JButton[] bot, int ancho, int alto){
        for (int i = 0; i < num.length; i++) {
            setNumberBoton(ancho,alto,nom[num[i]-1],bot[i]);
        }
    }
    
    public void setIconGeneral(JFrame fr){
        String nom = "/framesgps/img/memRec.png";
        ImageIcon img = new ImageIcon(getClass().getResource(nom));
        Image image = img.getImage();
        fr.setIconImage(image);
    }
}
