/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonmuster;

/**
 * Beispiel Singleton - Entwurfsmuster
 * @author Markus Badzura
 */
public class Lottospieler 
{
    private String name;
    private double einsatz;
    Lottospieler(String name, double einsatz)
    {
        this.name = name;
        this.einsatz = einsatz;
    }
    
    public void spielen()
    {
        gesamteinsatzLotto d = gesamteinsatzLotto.getInstance();
        d.setEinsatz(einsatz);
    }
}
