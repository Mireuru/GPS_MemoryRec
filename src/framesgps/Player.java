/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package framesgps;

import javazoom.jlgui.basicplayer.BasicPlayer;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jlgui.basicplayer.BasicPlayerException;

/**
 *
 * @author mgarc
 */
public class Player {
    private BasicPlayer player;
    File cla;
    
    public Player() {
        try {
            this.cla = new File(getClass().getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
        } catch (URISyntaxException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
        player = new BasicPlayer();
    }
    
    public double vol(){
        String ruta = "/conf/vol.txt";
        String dat = "";
        try {
            File file = new File(cla.getParentFile().getPath()+ruta);
            Scanner sc = new Scanner(file);
            dat = sc.nextLine();
            sc.close();
        } catch (IOException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Double.parseDouble(dat);
    }
    
    public void click(){
        try {
            player.open(new File(cla.getParentFile().getPath()+"/sounds/click.wav"));
            player.play();
            player.setGain(vol());
        } catch (BasicPlayerException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void error(){
        try {
            player.open(new File(cla.getParentFile().getPath()+"/sounds/error.wav"));
            player.play();
            player.setGain(vol());
        } catch (BasicPlayerException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void acierto(){
        try {
            player.open(new File(cla.getParentFile().getPath()+"/sounds/acierto.wav"));
            player.play();
            player.setGain(vol());
        } catch (BasicPlayerException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void victoria(){
        try {
            player.open(new File(cla.getParentFile().getPath()+"/sounds/victoria.wav"));
            player.play();
            player.setGain(vol());
        } catch (BasicPlayerException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tecla() throws BasicPlayerException{
            player.open(new File(cla.getParentFile().getPath()+"/sounds/tecla.wav"));
            player.play();
            player.setGain(vol());
    }
        
}
