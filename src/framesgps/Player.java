/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package framesgps;

import javazoom.jlgui.basicplayer.BasicPlayer;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jlgui.basicplayer.BasicPlayerException;

/**
 *
 * @author mgarc
 */
//Esta clase se encarga de los sonidos de la aplicación
public class Player {
    private BasicPlayer player;
    File cla;
    
    //Inicializa el objeto de la clase
    public Player() {
        player = new BasicPlayer();
    }
    
    //Método encargado de leer el valor del volumen en su archivo correspondiente
    public double vol(){
        String ruta = "/conf/vol.conf";  //Ruta del archivo de volumen
        String dat = "";
        try {
            //Se crea un archivo con la ruta completa del archivo de configuración
            File file = new File(cla.getParentFile().getPath()+ruta);
            Scanner sc = new Scanner(file);
            dat = sc.nextLine();    //Se lee la primera linea de texto y se define en una variable
            sc.close();
        } catch (IOException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Double.parseDouble(dat); //Se devuelve la linea leida como un doble
    }
    
    //Método para el sonido de click
    public void click(){
        try {
            //Abre el archivo con el sonido de click en la ruta del programa y su posición específica
            player.open(new File(cla.getParentFile().getPath()+"/sounds/click.wav"));
            player.play();  //Inicia la reproducción del sonido
            player.setGain(vol());  //Establece el volumen del sonido reproduciendose
        } catch (BasicPlayerException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Método para el sonido de error
    public void error(){
        try {
            //Abre el archivo con el sonido de error en la ruta del programa y su posición específica
            player.open(new File(cla.getParentFile().getPath()+"/sounds/error.wav"));
            player.play();  //Inicia la reproducción del sonido
            player.setGain(vol());  //Establece el volumen del sonido reproduciendose
        } catch (BasicPlayerException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Método para el sonido de acierto
    public void acierto(){
        try {
            //Abre el archivo con el sonido de acierto en la ruta del programa y su posición específica
            player.open(new File(cla.getParentFile().getPath()+"/sounds/acierto.wav"));
            player.play();  //Inicia la reproducción del sonido
            player.setGain(vol());  //Establece el volumen del sonido reproduciendose
        } catch (BasicPlayerException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Método para el sonido de victoria
    public void victoria(){
        try {
            //Abre el archivo con el sonido de victoria en la ruta del programa y su posición específica
            player.open(new File(cla.getParentFile().getPath()+"/sounds/victoria.wav"));
            player.play();  //Inicia la reproducción del sonido
            player.setGain(vol());  //Establece el volumen del sonido reproduciendose
        } catch (BasicPlayerException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
}
