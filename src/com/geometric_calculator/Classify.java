/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geometric_calculator;

/**
 *
 * @author pedro
 */
public class Classify {
    public static String triangle(int[] sides){
        if(sides[0] == sides[1] && sides[1] == sides[2]){
            return "Equilátero";
        } else if((sides[0] != sides[1] && sides[1] == sides[2]) || (sides[1] != sides[2] && sides[1] == sides[0]) || (sides[1] != sides[0] && sides[0] == sides[2])){
            return "Isóceles";
        } else {
            return "Escaleno";
        }
    }
}
