/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package framesgps;

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
    //El inicializador no tiene ningún parámetro ya que 
    //la clase se utiliza para llamar métodos específicos
    public Imagen() {
        
    }
    
    //Metodo para establecer una imagen en un botón, recibe ancho, alto
    // nombre de archivo de imagen y botón en el que se pondrá
    public void setImageBoton(int ancho,int alto, String n,JButton c){
        String nom = "/framesgps/img/" + n; //Ruta de la imagen compuesta
        //Se crea un objeto ImageIcon a partir de la ruta especificada,
        //buscandola dentro del archivo jar
        ImageIcon img = new ImageIcon(getClass().getResource(nom)); 
        Image image = img.getImage();   //Se obtiene la imagen del ImageIcon
        //Se escala la imagen a las medidas dadas
        Image res = image.getScaledInstance(ancho, alto,  java.awt.Image.SCALE_SMOOTH);
        img = new ImageIcon(res);   //Se da a img el valor del ImageIcon del resultado
        c.setIcon(img); //Se establece el icono en el botón recibido
    }
    
    //Metodo para establecer la imagen deshabilitada en un botón, recibe ancho, alto
    // nombre de archivo de imagen y botón en el que se pondrá
    public void setImageBotonDisabled(int ancho,int alto, String n,JButton c){
        String nom = "/framesgps/img/" + n; //Ruta de la imagen compuesta
        //Se crea un objeto ImageIcon a partir de la ruta especificada,
        //buscandola dentro del archivo jar
        ImageIcon img = new ImageIcon(getClass().getResource(nom));
        Image image = img.getImage();   //Se obtiene la imagen del ImageIcon
        //Se escala la imagen a las medidas dadas
        Image res = image.getScaledInstance(ancho, alto,  java.awt.Image.SCALE_SMOOTH);
        img = new ImageIcon(res);   //Se da a img el valor del ImageIcon del resultado
        c.setDisabledIcon(img); //Se establece el icono deshabilitado en el botón recibido
    }
    
    //Metodo para establecer una imagen en una etiqueta, recibe ancho, alto
    // nombre de archivo de imagen y etiqueta en la que se pondrá
    public void setImageLabel(int ancho,int alto, String n,JLabel c){
        String nom = "/framesgps/img/" + n; //Ruta de la imagen compuesta
        //Se crea un objeto ImageIcon a partir de la ruta especificada,
        //buscandola dentro del archivo jar
        ImageIcon img = new ImageIcon(getClass().getResource(nom));
        Image image = img.getImage();   //Se obtiene la imagen del ImageIcon
        //Se escala la imagen a las medidas dadas
        Image res = image.getScaledInstance(ancho, alto,  java.awt.Image.SCALE_SMOOTH);
        img = new ImageIcon(res);   //Se da a img el valor del ImageIcon del resultado
        c.setIcon(img); //Se establece el icono en la etiqueta recibida
    }
    
    /*
    *   Metodo para establecer iconos en un arreglo de botones basandose en un arreglo de nombres
    *   Recibe un arreglo de enteros que especifica el orden en que se establecerán los nombres
    *   Un arreglo de String que tiene los nombres, un arreglo de botones que cuenta con
    *   aquellos que se les asignará un icono, alto y ancho
    */
    public void setIconBoton(int [] num, String [] nom, JButton [] bot, int ancho, int alto){
        for (int i = 0; i < num.length; i++) {  //Ciclo que se corresponde con los elementos
            /*  
            *   Se establece la imagen con las medidas dadas, introduciendo el
            *   nombre en la posición indicada en num en el indice i, y se le resta
            *   uno a ese valor, de forma que se añadan los valores, pero al estos
            *   usarse iniciando en 1, se correspondan con los indices de un arreglo
            *   posteriormente se agrega el botón en la posición i
            */
            setImageBoton(ancho,alto,nom[num[i]-1],bot[i]);
        }
    }
    
    /*
    *   Metodo para establecer iconos de deshabilitado en un 
    *   arreglo de botones basandose en un arreglo de nombres
    *   Recibe un arreglo de enteros que especifica el orden en que se establecerán los nombres
    *   Un arreglo de String que tiene los nombres, un arreglo de botones que cuenta con
    *   aquellos que se les asignará un icono, alto y ancho
    */
    public void setIconBotonDisabled(int [] num, String [] nom, JButton [] bot, int ancho, int alto){
        for (int i = 0; i < num.length; i++) {
            //Actua de la misma manera que el método para los iconos regulares
            //Con el unico cambio es que las imagenes serán para el estado deshabilitado
            setImageBotonDisabled(ancho,alto,nom[num[i]-1],bot[i]);
        }
    }
    
    /*
    *   Metodo para establecer iconos en un arreglo de etiquetas basandose en un arreglo de nombres
    *   Recibe un arreglo de enteros que especifica el orden en que se establecerán los nombres
    *   Un arreglo de String que tiene los nombres, un arreglo de etiquetas que cuenta con
    *   aquellas que se les asignará un icono, alto y ancho
    */
    public void setIconLabel(int [] num, String [] nom, JLabel [] lab, int ancho, int alto){
        for (int i = 0; i < num.length; i++) {
            /*
            *   Actúa de la misma forma que su metodo para botones, cambiando
            *   solo en el aspecto que este se aplica a etiquetas, su funcionamiento
            *   es el mismo en los demás aspectos, llamando de igual manera a su
            *   correspondiente método para establecimiento de imagenes individuales
            *   de forma ciclica.
            */
            setImageLabel(ancho,alto,nom[num[i]-1],lab[i]);
        }
    }
    
    //Método para poner texto en un botón
    public void setNumberBoton(String n,JButton c){
        c.setText(n);   //Establece el texto recibido en n al botón especificado en c
    }
    
    //Método para poner un arreglo de strings en un arreglo de botones de forma correspondiente
    public void setTextBoton(int [] num, String [] nom, JButton[] bot){
        for (int i = 0; i < num.length; i++) {
            /*
            *   Se llama al método para poner texto y se le da el string en la
            *   posición que indique num en el índice i, y se le resta uno a ese
            *   valor, además se le da el botón en la posición i
            */
            setNumberBoton(nom[num[i]-1],bot[i]);
        }
    }
    
    //Método para establecer el ícono de frame
    //Recibe el frame objetivo
    public void setIconGeneral(JFrame fr){
        String nom = "/framesgps/img/memRec.png";   //Ruta de la imagen
        //Se crea un ImageIcon con la ruta de la imagen que busca en el jar
        ImageIcon img = new ImageIcon(getClass().getResource(nom));
        Image image = img.getImage();   //Se obtiene la imagen del ImageIcon
        fr.setIconImage(image); //Se establece la imagen de icono del frame recibido
    }
}
