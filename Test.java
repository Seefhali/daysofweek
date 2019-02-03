/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 *
 * @author Acer
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sundays=0;
        for(int year=1901;year<=2000;year++){
            for(int month=1;month<=12;month++){
                if((LocalDate.of(year,month,1).getDayOfWeek().equals(DayOfWeek.SUNDAY))){
                    sundays++;
                
            }
        }
        
    }
    System.out.println(sundays);
    }
}


    
