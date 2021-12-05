/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package framesgps;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author mgarc
 */
//Clase encargada de manejar las interacciones existentes en el proyecto
public class Interact {
    //Método encargado de los cambios de frame
    //Recibe el frame al que se mostrará, y el que se está cerrando
    public void back(JFrame men, JFrame loc){
        men.setVisible(true);   //Se establece el nuevo frame a mostrar
        men.toFront();  //Se llama al frente
        loc.dispose();  //Se elimina el frame anterior
    }
    
    /*
    *   Método para verificar si un string de un caracter dado en un arreglo,
    *   con una correspondencia numérica en otro, cuentan con la misma
    *   y si son iguales a valores dados en los strings bot1 y bot2
    *   Recibe los valores de los caracteres, los numeros, como strings ambos
    *   el texto de un botón y el texto de otro.
    */
    public boolean getPareja(String[] val1,String[] val2,String bot1, String bot2){
        for (int i = 0; i < 9; i++) {
            //En caso de que bot1 y bot2, sean en alguno de los puntos de los arreglos
            //iguales a los mismos, significa que hay una correspondencia y que se
            //está en lo correcto, por lo que devuelve true y termina el método
            if (val1[i] == bot1 && val2[i] == bot2) {   
                return true;
            }
            
        }
        return false;   //Devuelve false en caso de que no hubiera correspondencia
    }
    
    /*
    *   Método que comprueba si una pareja de valores son una pareja
    *   correspondientes a la regla de que un valor es pareja de otro si al sumar
    *   13 a la menor, o restar 13 a la mayor, se obtiene la otra, esto mientras
    *   el valor de la mayor sea menor a 27, ya que las parejas solo se corresponden
    *   desde 1-26 y de 27-52
    */
    public boolean getPareja(int val1,int val2){
        int mayor;
        int menor;
        //Primero se identifica que valor es el mayor y cual el menor
        if(val1<val2){  //Si al compararlos val1 es menor, entonces se establece esto
            mayor = val2;
            menor = val1;
        }
        else{   //En caso contrario, se establece la relación contraria
            mayor = val1;
            menor = val2;
        }
        if(mayor>26 && menor<27){   //Se compara si los valores recibidos no est+an
            return false;           //en conjuntos de parejas no correspondientes
        }                           //de así serlo significa que no son pareja, devuelve false
        
        if ((mayor-13) == menor)    //En caso de que los valores estén en conjuntos
            return true;            //permisibles, se resta 13 al mayor, y si el resultado
        else                        //es igual al menor, se devuelve true, es una pareja
            return false;           //en caso contrario se devuelve false, no lo es
            
    }
    
    //Método para revisar la correlación de dos valores en una regla por colores
    public boolean getColorCorr(int val1,int val2){
        boolean flag = false;
        //El valor de la comparación es el valor objetivo, mientras que el valor
        //en el switch es el valor a comparar, se verifica si existe un true
        //para esta combinación de valores
        if(val1 == 0){
            switch(val2){
                case 2: flag = true;
                    break;
                default: flag = false;
                    break;
            }
        }
        if(val1 == 1){
            switch(val2){
                case 5: flag = true;
                    break;
                default: flag = false;
                    break;
            }
        }
        if(val1 == 2){
            switch(val2){
                case 1: flag = true;
                    break;
                default: flag = false;
                    break;
            }
        }
        if(val1 == 3){
            switch(val2){
                case 4: flag = true;
                    break;
                default: flag = false;
                    break;
            }
        }
        if(val1 == 4){
            switch(val2){
                case 3: flag = true;
                    break;
                default: flag = false;
                    break;
            }
        }
        if(val1 == 5){
            switch(val2){
                case 2: flag = true;
                    break;
                default: flag = false;
                    break;
            }
        }
        if(val1 == 6){
            switch(val2){
                case 2: flag = true;
                    break;
                default: flag = false;
                    break;
            }
        }
        return flag;    //Una vez revisado, se devuelve el resultado booleano
    }
    
    //Método para verificar si se tiene valores correspondientes bajo una relación específica
    //El 1 es correspondiente con el 5, el 2 con 3, el 4 con 6, 7 con 8 y viceversa en cada
    //una de las ocasiones, esto se basa en la relación existente en las imagenes usadas en
    //la clase que este método es utilizado, de forma que estos valores representan posiciones
    //dentro de un arreglo 
    public boolean getSem(int val1,int val2){
        boolean flag = false;
        if(val1 == 1){
            if(val2 == 5)
                flag = true;
            else
                flag = false;
        }
        if(val1 == 2){
            if(val2 == 3)
                flag = true;
            else
                flag = false;
        }
        if(val1 == 3){
            if(val2 == 2)
                flag = true;
            else
                flag = false;
        }
        if(val1 == 4){
            if(val2 == 6)
                flag = true;
            else
                flag = false;
        }
        if(val1 == 5){
            if(val2 == 1)
                flag = true;
            else
                flag = false;
        }
        if(val1 == 6){
            if(val2 == 4)
                flag = true;
            else
                flag = false;
        }
        if(val1 == 7){
            if(val2 == 8)
                flag = true;
            else
                flag = false;
        }
        if(val1 == 8){
            if(val2 == 7)
                flag = true;
            else
                flag = false;
        }
        return flag;    //Se devuelve el resultado de la comparación
    }
    
    //Método para verificar si un valor se corresponde con un string específico
    public boolean getSabor(int val1,String sab){
        boolean flag = false;   //Se crea una bandera para el resultado, inicia como false
        //Se compara basandose en las características de las imagenes usadas en la clase
        //que el método es utilizado
        if(val1 == 1){
            if(sab.equals("Acido"))
                flag = true;
            else
                flag = false;
        }
        if(val1 == 2){
            if(sab.equals("Acido"))
                flag = true;
            else
                flag = false;
        }
        if(val1 == 3){
            if(sab.equals("Picante"))
                flag = true;
            else
                flag = false;
        }
        if(val1 == 4){
            if(sab.equals("Dulce"))
                flag = true;
            else
                flag = false;
        }
        if(val1 == 5){
            if(sab.equals("Dulce"))
                flag = true;
            else
                flag = false;
        }
        if(val1 == 6){
            if(sab.equals("Acido"))
                flag = true;
            else
                flag = false;
        }
        return flag;    //Una vez hecha la comparación, se devuelve su resultado
    }
    
    //Metodo para habilitar o deshabilitar una pareja de botones basndose en su relación
    public void accPareja(boolean par,JButton bot1,JButton bot2){
        if(par){    //En caso de rcibir un true, se deshabilitan
            bot1.setEnabled(false);
            bot2.setEnabled(false);
        }
        else{   //De lo contrario ambos se habilitan
            bot1.setEnabled(true);
            bot2.setEnabled(true);
        }
            
    }
    
    //Método para encontrar la posición de un botón específico dentro de un arreglo
    //en el que éste se encuentra
    public int getPosBoton(JButton[] bots, JButton pres){
        int pos = 0;
        //Ciclo que recorrerá los elementos de arreglo de botones
        for (int i = 0; i < bots.length; i++) {
            if(bots[i] == pres) //Si el elemento en i dentro del arreglo es igual
                pos = i;        //al botón recibido, se establece la posición en que ocurrió
        }
        return pos; //Se devuelve la posición
    }
    
    
    //Método con la misma funcionalidad que el anterior, pero referente a las etiquetas
    //Su funcionamiento es el mismo, cambiando sus datos de entrada por arreglo de etiquetas
    //y una etiqueta individual
    public int getPosLabel(JLabel[] labs, JLabel act){
        int pos = 0;
        for (int i = 0; i < labs.length; i++) {
            if(labs[i] == act)
                pos = i;
        }
        return pos;
    }
    
    //Método para verificar si la suma de dos valores es igual al tercero   
    public boolean getSuma(String val1,String val2,int val3){
        //Se vuelven los dos Strings recibidos en enteros, y se suman, se compara
        //si la suma es igual al tercer valor
        if(Integer.parseInt(val1) + Integer.parseInt(val2) == val3)
                return true;    //De ser así se devuelve true
        else
                return false;   //De lo contrario se devuelve false
    }
    
    //Metodo para establecer un ranking en el archivo que lleva su control
    //Recibe un string que contiene la palabra clave de una actividd y el valor a escribir
    public void setRanking(String key, int errores){
        ArrayList<String> conts = new ArrayList<String>();  //Se crea un ArrayList para los 
        int lin = 0;                                        //contenidos del archivo
        String ruta = "/records/records.txt";   //Ruta del archivo
        try {
            //Se crea un archivo nuevo que servirá para obtener la ruta en que
            //se encuentra la aplicación
            File cla = new File(getClass().getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
            try {
                //Se crea el archivo a usar, basandose en el archivo de texto existente
                //concatenando la ruta del proyecto con la ruta del archivo de texto
                File file = new File(cla.getParentFile().getPath()+ruta);
                Scanner sc = new Scanner(file); //Se crea un scanner para leer el archivo
                while(sc.hasNextLine()){    //Si el archivo no ha llegado al fin de linea
                    conts.add(sc.nextLine());       //Se añade el contenido de la linea
                }                                   //al ArrayList de contenidos
                for (int i = 0; i < conts.size(); i++) {    //Se recorre conts
                    if(conts.get(i).contains(key)){     //Si la linea específica tiene
                        lin = i+1;                      //la palabra clave, se guarda el
                    }                                   //número de línea+1
                }
                conts.set(lin, errores+""); //establece el texto en el Arraylist en la posición
                                            //obtenida como el valor dado por la entrada del método
                String contenido = "";      //String para contener los valores del ArrayList
                for (int i = 0; i < conts.size(); i++) {    //Se recorre el Arraylist
                    contenido += conts.get(i)+"\n"; //Se agrega el contenido del Arraylist al String
                }
                FileWriter fw;
                try {
                    fw = new FileWriter(file);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(contenido);    //Se sobrescribe el archivo de texto con el texto en el String
                    bw.close();
                } catch (IOException ex) {
                    Logger.getLogger(Cartas.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Cartas.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            Logger.getLogger(Interact.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Método para obtenerel valor de una actividad basandose en su clave
    public int getRanking(String key){
        ArrayList<String> conts = new ArrayList<String>();
        int val = 0;
        try {
            String ruta = "/records/records.txt";   //Ruta del archivo de texto
            //Se obtiene la ruta del programa
            File cla = new File(getClass().getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
            try {
                //Se crea el archivo con la ruta completa
                File file = new File(cla.getParentFile().getPath()+ruta);
                Scanner sc = new Scanner(file);
                while(sc.hasNextLine()){
                    conts.add(sc.nextLine());   //Se recorre el archivo agregando su contenido a conts
                }
                for (int i = 0; i < conts.size(); i++) {
                    if(conts.get(i).contains(key)){     //Si el contenido del ArrayList se corresponde
                        val = Integer.parseInt(conts.get(i+1));     //con la clave, se guarda el valor 
                    }                                               //en la siguiente posición, su puntaje
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Interact.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            Logger.getLogger(Interact.class.getName()).log(Level.SEVERE, null, ex);
        }
        return val;
    }
    
    //Método para establecer el tipo de frrame a crear, se basa en un valor de entrada
    public JFrame getNew(int val){
        JFrame ob = new JFrame();
        //En situación del valor introducido, se crea un frame de distinto tipo
        switch(val){
            case 0: ob = new AtencionDividida();
                break;
            case 1: ob = new Atencion_Selectiva();
                break;
            case 2: ob = new Atencion_Sostenida();
                break;
            case 3: ob = new Atencion_Sostenida2();
                break;
            case 4: ob = new CalculosMatematicos();
                break;
            case 5: ob = new MemoriaSemantica2();
                break;
            case 6: ob = new Atencion_Sostenida3();
                break;
            case 7: ob = new AtencionAlternada();
                break;
            case 8: ob = new MemoriaEpisodica();
                break;
            case 9: ob = new MemoriaSemantica();
                break;
            case 10: ob = new MemoriaSensorialGustativa();
                break;
            case 11: ob = new MemoriaSensorialOlfativa();
                break;
            case 12: ob = new MemoriaSensorialVisualComp();
                break;
            case 13: ob = new AtencionAlternada2();
                break;
        }
        return ob;  //Se devuelve el frame del tipo especificado
    }
    
}
