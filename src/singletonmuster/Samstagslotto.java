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
public class Samstagslotto 
{
    public static void main(String[] args) 
    {
        gesamteinsatzLotto lotto = gesamteinsatzLotto.getInstance();
        System.out.println("Gesamteinsatz aktuell: "+lotto.getSumme());
        Lottospieler markus = new Lottospieler("Markus",22.13);
        markus.spielen();
        System.out.println("Gesamteinsatz nach Markus: "+lotto.getSumme());
        Lottospieler heinz = new Lottospieler("Heinz",7.87);
        heinz.spielen();
        System.out.println("Gesamteinsatz nach Heinz: "+lotto.getSumme());
    }
}
