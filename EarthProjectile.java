/*
 * EarthProjectile.java
 *
 * @version 1.00 - 25 Apr 2017 - Anna-Lena Meiners - initial version 
 */

/** 
 * A class for describing a projectile vertically shot from earth.
 * 
 * @author Anna-Lena Meiners (annalena.mei@gmail.com)
 */
 
public class EarthProjectile {

    // Attributes

    /** Earth's gravitation. */
    private static final double GRAVITATION = 9.81;

    /** Speed of the projectile in meters per second. */
    private double speed;
    

    // Constructor
    /**
     * Creates a projectile vertically shot from earth.
     * 
     * @param speedInKmh    speed in kilometers per hour
     */
    public EarthProjectile(double speedInKmh) {
        this.speed = this.kmHToMS(speedInKmh);
    }
    
    
    // Methods
    
    /**
     * Converts the speed in kilometers per hour into meters per second.
     * 
     * @param kmh   speed in kilometers per hour
     * @return speed in meters per second
     */
    private double kmHToMS(double kmh) {
        return kmh / 3.6;
    }

    /**
     * Calculates the maximal height a vertically
     * shot projectile can achieve given earth's gravitation
     * and the input speed.
     * 
     * @return maximal height in meters.
     */
    public double maxHeight() {
        return this.speed * this.speed / (2 * EarthProjectile.GRAVITATION);
    }

}
