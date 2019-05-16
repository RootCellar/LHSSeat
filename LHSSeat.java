/*
 * 
 * Darian Marvel - 5/16/19
 * Writing a program to help with seating in the Hering Auditorium
 * 
 */

import java.util.ArrayList;

public class LHSSeat
{
    public static void main(String[] args) {
        Auditorium hering = new Auditorium();
        
        out(hering.numSeats() + "");
    }
    
    public static void out(String s) {
        System.out.println(s);
    }
}