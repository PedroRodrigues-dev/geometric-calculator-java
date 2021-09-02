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
public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] sides1 = {5,8,7};
        int[] sides2 = {5,8,7};
        Triangle t1 = new Triangle(sides1);
        t1.status();
        Triangle t2 = new Triangle(sides2);
        t2.status();
        System.out.println(Compare.trianglePerimeter(t1,t2) + "\n");
    }
}
