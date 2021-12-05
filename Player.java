/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package framesgps;

import javazoom.jlgui.basicplayer.BasicPlayer;
import java.io.File;
import java.io.FileNotFoundException;
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

    public Player() {
        player = new BasicPlayer();
    }
    
    public double vol(){
        String ruta = "./src/framesgps/conf/vol.txt";
        String dat = "";
        try {
            File file = new File(ruta);
            Scanner sc = new Scanner(file);
            dat = sc.nextLine();
            sc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Double.parseDouble(dat);
    }
    
    public void click(){
        try {
            player.open(new File("./src/framesgps/sounds/click.wav"));
            player.play();
            player.setGain(vol());
        } catch (BasicPlayerException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void error(){
        try {
            player.open(new File("./src/framesgps/sounds/error.wav"));
            player.play();
            player.setGain(vol());
        } catch (BasicPlayerException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void acierto(){
        try {
            player.open(new File("./src/framesgps/sounds/acierto.wav"));
            player.play();
            player.setGain(vol());
        } catch (BasicPlayerException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void victoria(){
        try {
            player.open(new File("./src/framesgps/sounds/victoria.wav"));
            player.play();
            player.setGain(vol());
        } catch (BasicPlayerException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tecla() throws BasicPlayerException{
            player.open(new File("./src/framesgps/sounds/tecla.wav"));
            player.play();
            player.setGain(vol());
    }
        
}
