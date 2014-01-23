package galtolit.java;

/**
 *
 * @author Brandon Larsen -- Winter 2014 - CIT 260 ~ 03 ONLINE
 * Try this 1-1
 * This program converts gallons to liters
 * Call this program GalToLit.java
 */
 class GalToLitJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double gallons; // holds num of gallons
        double liters; // holds num of liters
        
        gallons = 10; // start with 10 gallons
        liters = gallons * 3.7854; // convert to liters
        
        System.out.println(gallons + " gallon is " + liters + " liters.");
        
    }
    
}
