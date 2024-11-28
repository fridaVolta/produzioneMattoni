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
public class Imballatore {
 private ArrayList<Mattone> mattoniDaImballareList; 
 public Imballatore(ArrayList<Mattone> mattoniDaImballareList){
     this.mattoniDaImballareList=mattoniDaImballareList;
 }
    public String imballaMattoni() {
        for(Mattone m: mattoniDaImballareList){
            m.setLotto("29nov2024");
            System.out.print(m.getString()+" ");          
    }
        return "Imballati e stoccati in magazzino tutti i 1600 mattoni";
    }
    
}
