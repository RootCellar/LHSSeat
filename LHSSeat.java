/*
 * 
 * Darian Marvel - 5/16/19
 * Writing a program to help with seating in the Hering Auditorium
 * 
 */

import java.util.ArrayList;

import Logging.Logger;

public class LHSSeat
{
    private static Logger debug = new Logger("Debug", "Debug");
    private static Logger log = new Logger("Standard", "Standard");
    
    public static void main(String[] args) {
        debug("Starting...");
        
        Auditorium hering = new Auditorium();
        
        out(hering.numSeats() + "");
    }
    
    public static void out(String s) {
        System.out.println(s);
        log.log(s);
    }
    
    public static void debug(String s) {
        debug.log(s);
    }
}