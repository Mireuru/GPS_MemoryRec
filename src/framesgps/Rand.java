/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package framesgps;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author mgarc
 */

//Clase para la generación de valores aleatorios
public class Rand {
    
    Random ran = new Random();  //Objeto de la clase Random por defecto
        
    //Método para obtener una cadena de 10 caracteres aleatorios
    public String getCadenaRandom(){
        String cad = "";    //String que contendrá la cadena
        
        for (int i = 0; i < 10; i++) {
            char val = (char) (ran.nextInt(26)+65); //Se lanza un caracter con valor en el rango de las mayusculas
            cad += val; //Se añade este valor al String
        }
        return cad; //Se devuelve la cadena generada
    }
    
    //Método para recortar una cadena en posiciones aleatorias y recibir los caracteres faltantes
    public String [] getCadenaRecortada(String cad){
        ArrayList<Character> nuevo = new ArrayList<Character>();
        ArrayList<Character> resp = new ArrayList<Character>();
        String sal = "";    //String que contendrá la cadena recortada
        String res = "";    //String que contendrá la respuesta, es decir los caracteres removidos
        for (int i = 0; i < cad.length(); i++) {
            nuevo.add(cad.charAt(i));   //Se introducen los valores del String original a un ArrayList
        }
        
        //Se hace un ciclo de 3 repeticiones
        for (int i = 0; i < 3; i++) {
            int val = ran.nextInt(10-i);    //Se da un valor cuyo limite cambie conforme al ArrayList
            resp.add(nuevo.get(val));       //Se añade al arraylist de respuestas el valor en la posición val
            nuevo.remove(val);              //Se borra este dato del arraylist de los datos originales
        }
        
        for (int i = 0; i < 7; i++) {
            sal+=nuevo.get(i);  //Se concatenan los valores del arraylist con los datos originales restante
        
        }
        res = resp.toString();  //Se define res como los valores de resp como string
        String [] cont = {sal, res};    //Se meten ambos valores a un arreglo
        
        return cont;    //Se devuelve el string con la cadena recortada y la respuesta
    }
    
    //Método para obtener una serie de números de 1 hasta el límite dado, en desorden
    public int[] getNumeros(int lim){
       ArrayList<Integer> numeros = new ArrayList<Integer>(); 
       int car[] = new int[lim];    //Arreglo contenedor
        for (int i = 1; i <= lim; i++) {
            numeros.add(i); //Se añaden los números en orden desde 1 hasta lim al ArrayList
        }
        
        for (int i = 0; i < lim; i++) {
            int val = ran.nextInt(lim-i);   //Se obtiene un valor random entre 0 y lim menos el valor de i
            car[i]=numeros.get(val);        //Se introduce el valor en la posición val del ArrayList al arreglo
            numeros.remove(val);            //Se elimina el valor ya introducido
        }
        return car; //Se devuelve el arreglo desordenado
    }
    
    //Se obtiene un arreglo con números faltantes a partir de un valor dado y el propio arreglo a quitarle
    public int[] getNumerosFaltantes(int [] ra,int falt){
       ArrayList<Integer> numeros = new ArrayList<Integer>(); 
       int car[] = new int[falt];   //Contenedor de los valores finales
        for (int i = 1; i <= ra.length; i++) {  //Se recorre el arreglo de entrada
            numeros.add(ra[i-1]);               //Se agregan los valores al ArrayList
        }
        
        for (int i = 0; i < falt; i++) {    //Se repite por las veces que diga el valor de entrada
            int val = ran.nextInt(ra.length-i); //Se obtiene un valor random entre 0 
                                                //y el largo del arreglo de entrada
            car[i]=numeros.get(val);            //Se introduce al arreglo los valores en esas posiciones
            numeros.remove(val);                //Se remueven valores usados
        }
        return car; //Se devuelve el arreglo con los valores faltantes (el número de valores es falt)
    }
}