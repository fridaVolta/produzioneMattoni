/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.produzionemattoni;

import java.util.ArrayList;

/**
 *
 * @author frida
 */
class RulloStampante {
    private int codiceRullo;
    private ArrayList<Mattone> mattoniStampatiList; 
    private static final int NUM_MATTONI_STAMPATI=200;
    
    public RulloStampante(int codiceThreadProduttore){
        codiceRullo=codiceThreadProduttore;
        mattoniStampatiList= new ArrayList<>();
    }
    public String StampaMattoni(){
        for(int i=0; i<NUM_MATTONI_STAMPATI; i++){
            Mattone m= new Mattone(String.valueOf(codiceRullo)+"_"+String.valueOf(i)+"_");
            mattoniStampatiList.add(m);
        }
        return "Prodotti 200 mattoni in uscita dal rullo "+codiceRullo;
    }
    public ArrayList<Mattone> TrasportaMattoni(){
        return mattoniStampatiList;
    }
}
