/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.produzionemattoni;

/**
 *
 * @author frida
 */
class Impastatore {
    private int codImpastatore;
    Impastatore(int codiceThreadProduttore) {
        codImpastatore=codiceThreadProduttore;
    }
    
    public String Impasta(){
        return "mescolata malta per 200 mattoni dall'impastatore "+codImpastatore;
    }
}
