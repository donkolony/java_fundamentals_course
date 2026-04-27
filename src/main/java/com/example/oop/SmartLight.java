/*
THE SETTER GATEKEEPER

Task:
Create private fields: String location and int brightness.
Setter: public void setBrightness(int brightness). If the value is < 0, set it to 0. If it is > 100, set it to 100.
Master Constructor: SmartLight(String location, int brightness). Crucial: Assign the location normally, but assign the brightness by calling setBrightness(brightness).
Chained Constructor: SmartLight(String location). Call the master constructor with a default brightness of 50.
 */

package com.example.oop;

public class SmartLight {

    private String location;
    private int brightness;

    /*
    Chained Constructor
    When only the location is given when an instance is created the brightness defaults to 50
     */
    public SmartLight(String location){
        this(location, 50);
    }

    /*
    Master Constructor
    When an instance is created both location and brightness is provided
    The brightness would first be checked and go through a validation through the setBrightness method
     */
    public SmartLight(String location, int brightness){
        this.location = location;
        setBrightness(brightness);
    }

    // Getter
    public int getBrightness(){
        return brightness;
    }

    /*
     Setter Logic
     The constructor trust the setter to handle the rules if brightness is not between 0-100
     */
    public void setBrightness(int brightness){
        if (brightness > 100) {
            this.brightness = 100;
        } else if (brightness < 0) {
            this.brightness = 0;
        } else{
            this.brightness = brightness;
        }
    }
}
