/*
 * ProjectileTester.java
 * 
 * @version 1.00 - 24 Apr 2017 - Anna-Lena Meiners - initial version 
 */

/**
 * Calculator for properties of a vertically-shot projectile in any environment.
 *
 * @author Anna-Lena Meiners (annalena.mei@gmail.com)
 */

public class ProjectileTester {

    /** Exit status indicating a failure. */     
    private static final int EXIT_FAILURE = 1;
    
    /** Usage string given in case of incorrect input. */
    private static final String USAGE = "Please enter speed of projectile in km/h and"
            + " gravitation of the projectile's environment in m/s^2(optional).";
            
    /** Earth's gravitation. */
    private static final double GRAVITATION = 9.81;
    
    
    /** Calculates the maximal height a vertically-shot projectile can reach given the projectile's
    * initial speed and gravitation of it's environment. Returns the error exit code '1' to the
    * caller (operating system) in all error cases.
    *
    * @param args   arg[0] the speed of the projectile in km/h, arg[1] gravitation (optional,
    *       default Earth's gravity)
    */
    public static void main(String[] args) {
        
        // default speed 0.0 km/h
        double speedInKmh = 0.0;
        //default gravitation is earth's gravitation
        double gravitation = ProjectileTester.GRAVITATION;
 
        // check if value for km/h is given
        if (args.length > 0) {
            // if yes, use as speedInKmh
            speedInKmh = Double.parseDouble(args [0]);
        } else {
            // if not, print usage message
            System.out.println("Error: " + USAGE);
            System.exit(ProjectileTester.EXIT_FAILURE);
        }
        
        // check if value for gravitation is given
        if (args.length > 1) {
            //if yes, use as gravitation
            gravitation = Double.parseDouble(args [1]);
        }

        // creating projectile
        Projectile myProjectile = new Projectile(speedInKmh, gravitation);
        
        // calculating and printing initial speed in km/h and resulting maximal height
        System.out.println("Your projectile starts with " + speedInKmh + " km/h.");
        
        // check if value for gravitation is indicating a certain planet
        if (gravitation == 9.81) {
            //if yes, print line suggesting the planet
            System.out.println("Since gravitation is 9,81 m/s^2, it's probably shot on earth.");
        }
        
        // check if value for gravitation is indicating a certain planet
        if (gravitation == 1.67) {
            //if yes, print line suggesting the planet
            System.out.println("Since gravitation is 1,67 m/s^2, it's probably shot on the moon.");
        }

        // check if value for gravitation is indicating a certain planet
        if (gravitation == 3.73) {
            //if yes, print line suggesting the planet
            System.out.println("Since gravitation is 3,73 m/s^2, it's probably shot on either"
                    + " Mercury or Mars.");
        }
        
        // check if value for gravitation is indicating a certain planet
        if (gravitation == 8.83) {
            //if yes, print line suggesting the planet
            System.out.println("Since gravitation is 8,83 m/s^2, it's probably shot on Venus.");
        }
        
        // check if value for gravitation is indicating a certain planet
        if (gravitation == 0.589) {
            //if yes, print line suggesting the planet
            System.out.println("Since gravitation is 0,589 m/s^2, it's probably shot on Pluto.");
        }
         
                 
        System.out.println("The maximal height of your projectile is " + myProjectile.maxHeight()
                + " m.");
        
    }    
}
