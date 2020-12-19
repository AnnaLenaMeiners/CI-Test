/*
 * EarthProjectileTester.java
 * 
 * @version 1.00 - 24 Apr 2017 - Anna-Lena Meiners - initial version 
 */

/**
 * Calculator for properties of a vertically-shot projectile on earth.
 *
 * @author Anna-Lena Meiners (annalena.mei@gmail.com)
 */

public class EarthProjectileTester {

    /** Exit status indicating a failure. */     
    private static final int EXIT_FAILURE = 1;
    
    /** Usage string given in case of incorrect input. */
    private static final String USAGE = "Please enter speed of projectile in km/h.";
    
    
    /** Calculates the maximal height a vertically-shot projectile can reach on earth
    * given the projectile's initial speed. Returns the error exit code '1' to the
    * caller (operating system) in all error cases.
    *
    * @param args   arg[0] the speed of the projectile in km/h
    */
    public static void main(String[] args) {
        
        double speedInKmh = 0.0;
 
        // check if value for km/h is given
        if (args.length > 0) {
            // if yes, use as speedInKmh
            speedInKmh = Double.parseDouble(args [0]);
        } else {
            // if not, print usage message
            System.out.println("Error: " + USAGE);
            System.exit(EarthProjectileTester.EXIT_FAILURE);
        }

        // creating projectile
        EarthProjectile myEarthProjectile = new EarthProjectile(speedInKmh);
        
        // calculating and printing initial speed in km/h and resulting maximal height
        System.out.println("Your projectile starts with " + speedInKmh + " km/h.");
        System.out.println("The maximal height of your projectile is "
                + myEarthProjectile.maxHeight() + " m.");
        
    }    
}
