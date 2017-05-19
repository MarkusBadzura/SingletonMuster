package singletonmuster;

/**
 * Beispiel für das Entwurfsmuster Singleton
 * @author Markus Badzura
 */
public class Singleton 
{
    // Beispiel nur der Singletonklasse laut UML-Klassendiagramm
    
    // Klassenvariable vom Typ Singelton erstellen
    private static final Singleton SINGEL = new Singleton();
    
    // Konstruktur mit Zugriffszertifizierer private, damit von ausserhalb
    // kein Objekt erstellt werden kann.
    
    private Singleton(){}
    
    // Getter-Methode, um das EINZIGARTIGE Singleton - Objekt zu erhalten
    
    /**
     * Singletonobjekt erhalten
     * @return Singletonobjekt
     */
    public static Singleton getInstance()
    {
        return SINGEL;
    } 
}
