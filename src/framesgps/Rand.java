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
public class Rand {
    
    Random ran = new Random();
    
        
    public String getCadenaRandom(){
        String cad = "";
        
        for (int i = 0; i < 10; i++) {
            char val = (char) (ran.nextInt(26)+65);
            cad += val;
        }
        return cad;
    }
    
    public String [] getCadenaRecortada(String cad){
        ArrayList<Character> nuevo = new ArrayList<Character>();
        ArrayList<Character> resp = new ArrayList<Character>();
        String sal = "";
        String res = "";
        for (int i = 0; i < cad.length(); i++) {
            nuevo.add(cad.charAt(i));
        }
        
        for (int i = 0; i < 3; i++) {
            int val = ran.nextInt(10-i);
            resp.add(nuevo.get(val));
            nuevo.remove(val);
        }
        
        for (int i = 0; i < 7; i++) {
            sal+=nuevo.get(i);
        
        }
        res = resp.toString();
        String [] cont = {sal, res};
        
        return cont;
    }
    
    public int[] getNumeros(int lim){
       ArrayList<Integer> numeros = new ArrayList<Integer>(); 
       int car[] = new int[lim];
        for (int i = 1; i <= lim; i++) {
            numeros.add(i);
        }
        
        for (int i = 0; i < lim; i++) {
            int val = ran.nextInt(lim-i);
            car[i]=numeros.get(val);
            numeros.remove(val);
        }
        return car;
    }
    
    public int[] getNumerosFaltantes(int [] ra,int falt){
       ArrayList<Integer> numeros = new ArrayList<Integer>(); 
       int car[] = new int[falt];
        for (int i = 1; i <= ra.length; i++) {
            numeros.add(ra[i-1]);
        }
        
        for (int i = 0; i < falt; i++) {
            int val = ran.nextInt(ra.length-i);
            car[i]=numeros.get(val);
            numeros.remove(val);
        }
        return car;
    }
}