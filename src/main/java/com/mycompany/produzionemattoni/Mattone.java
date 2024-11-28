/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.produzionemattoni;

/**
 *
 * @author frida
 */
class Mattone {
    private String id;
    private String lotto;
    private float pesoKg;
    public Mattone(String codice){
        id=codice;
        pesoKg=(float)0.5;
    }
    public void setLotto(String l){
        lotto=l;
    }

    public String getString() {
         return "mattone "+lotto+id+pesoKg;
    }
}
