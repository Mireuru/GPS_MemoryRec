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
public class Interact {
    public void back(JFrame men, JFrame loc){
        men.setVisible(true);
        men.toFront();
        loc.dispose();
    }
    
    public boolean getPareja(String[] val1,String[] val2,String bot1, String bot2){
        for (int i = 0; i < 9; i++) {
            if (val1[i] == bot1 && val2[i] == bot2) {
                return true;
            }
            
        }
        return false;
    }
    
    public boolean getPareja(int val1,int val2){
        int mayor;
        int menor;
        if(val1<val2){
            mayor = val2;
            menor = val1;
        }
        else{
            mayor = val1;
            menor = val2;
        }
        if(mayor>26 && menor<27){
            return false;
        }
        
        if ((mayor-13) == menor)
            return true;
        else
            return false;
            
    }
    
    public boolean getColorCorr(int val1,int val2){
        boolean flag = false;
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
        return flag;
    }
    
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
        return flag;
    }
    
    public boolean getSabor(int val1,String sab){
        boolean flag = false;
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
        return flag;
    }
    
    public void accPareja(boolean par,JButton bot1,JButton bot2){
        if(par){
            bot1.setEnabled(false);
            bot2.setEnabled(false);
        }
        else{
            bot1.setEnabled(true);
            bot2.setEnabled(true);
        }
            
    }
    
    public int getPosBoton(JButton[] bots, JButton pres){
        int pos = 0;
        for (int i = 0; i < bots.length; i++) {
            if(bots[i] == pres)
                pos = i;
        }
        return pos;
    }
    
    public int getPosLabel(JLabel[] labs, JLabel act){
        int pos = 0;
        for (int i = 0; i < labs.length; i++) {
            if(labs[i] == act)
                pos = i;
        }
        return pos;
    }
    
    public void ActividadR(int a ){
        switch (a) {
            case 1: a=1;
                
                break;
            case 2: a=2;
                
                break;
            case 3: a=3;
                
                break;
            case 4: a=4;
                
                break;
            case 5: a=5;
                
                break;
            case 6: a=6;
                
                break;
            case 7: a=7;
                
                break;
            case 8: a=8;
                
                break;
            case 9: a=9;
                
                break;
            case 10: a=10;
                
                break;
            case 11: a=11;
                
                break;
            case 12: a=12;
                
                break;
            case 13: a=13;
                
                break;
            case 14: a=14;
                
                break;
            case 15: a=15;
                
                break;
            case 16: a=16;
                
                break;
            case 17: a=17;
                
                break;
            case 18: a=18;
                
                break;
        }
    }
    
    public boolean getSuma(String val1,String val2,int val3){
        if(Integer.parseInt(val1) + Integer.parseInt(val2) == val3)
                return true;
        else
                return false;
    }
    
    public void setRanking(String key, int errores){
        ArrayList<String> conts = new ArrayList<String>();
        int lin = 0;
        String ruta = "./src/framesgps/records/records.txt";
        try {
            File file = new File(ruta);
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                conts.add(sc.nextLine());
            }
            for (int i = 0; i < conts.size(); i++) {
                if(conts.get(i).contains(key)){
                    lin = i+1;
                }
            }
            conts.set(lin, errores+"");
            String contenido = "";
            for (int i = 0; i < conts.size(); i++) {
                contenido += conts.get(i)+"\n";
            }
            FileWriter fw;
            try {
                fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
            } catch (IOException ex) {
                Logger.getLogger(Cartas.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cartas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int getRanking(String key){
        ArrayList<String> conts = new ArrayList<String>();
        int val = 0;
        String ruta = "./src/framesgps/records/records.txt";
        try {
            File file = new File(ruta);
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                conts.add(sc.nextLine());
            }
            for (int i = 0; i < conts.size(); i++) {
                if(conts.get(i).contains(key)){
                    val = Integer.parseInt(conts.get(i+1));
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Interact.class.getName()).log(Level.SEVERE, null, ex);
        }
        return val;
    }
    
    public JFrame getNew(int val){
        JFrame ob = new JFrame();
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
            case 5: ob = new Colores();
                break;
            case 6: ob = new LaWeaQueNoSale();
                break;
            case 7: ob = new LetrasDesordenadas();
                break;
            case 8: ob = new MemoriaCortoPlazo();
                break;
            case 9: ob = new MemoriaEpisodica();
                break;
            case 11: ob = new MemoriaSemantica();
                break;
            case 12: ob = new MemoriaSensorialGustativa();
                break;
            case 13: ob = new MemoriaSensorialOlfativa();
                break;
            case 14: ob = new MemoriaSensorialVisualComp();
                break;
            case 15: ob = new SopaDeLetras();
                break;
        }
        return ob;
    }
    
}
