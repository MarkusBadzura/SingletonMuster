package singletonmuster;

/**
 * Beispiel Singleton - Entwurfsmuster
 * @author Markus Badzura
 */
public class gesamteinsatzLotto 

{
    private static final gesamteinsatzLotto GES_EINSATZ = new gesamteinsatzLotto();
    private double einsatz = 0;

    private gesamteinsatzLotto(){}
        
    /**
     * Objekt gesamteinsatzLotto erhalten
     * @return gesamteinsatzLotto-Objekt
     */
    public static gesamteinsatzLotto getInstance()
    {
        return GES_EINSATZ;
    } 
    
    /**
     * Spieleinsatz
     * @param einsatz double-Wert Einsatz 
     */
    public void setEinsatz(double einsatz)
    {
        this.einsatz += einsatz;
    }
    
    /**
     * Gesamgsumme Einsatz zurückgeben
     * @return einsatz
     */
    public double getSumme()
    {
        return einsatz;
    }
}

