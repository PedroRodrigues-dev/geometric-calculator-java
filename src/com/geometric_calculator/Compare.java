/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geometric_calculator;

import com.geometric_calculator.forms.Triangle;

/**
 *
 * @author pedro
 */
public class Compare {
    public static String trianglePerimeter(Triangle triangle1, Triangle triangle2){
        if(triangle1.getPerimeter() > triangle2.getPerimeter()){
            return "Triângulo 1 tem perímetro maior que Triângulo 2";
        }else if(triangle1.getPerimeter() < triangle2.getPerimeter()){
            return "Triângulo 2 tem perímetro maior que Triângulo 1";
        }else {
            return "Apresentam mesmo perímetro";
        }
    }
}
