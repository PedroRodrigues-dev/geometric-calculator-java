/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geometric_calculator.forms;

import com.geometric_calculator.Classify;
import com.geometric_calculator.Operations;

/**
 *
 * @author pedro
 */
public final class Triangle extends Classify implements Operations{
    private int[] sides;
    private String type;
    private double perimeter;
    
    public Triangle(int[] sides) {
        if(sides.length == 3){
            if(Math.abs(sides[1] - sides[2]) < sides[0] && sides[0] < sides[1] + sides[2]){
                this.sides = sides;
                this.perimeter= this.perimeter();
                this.type = Classify.triangle(sides);
            }
        }
    }

    public Triangle(double[] sides) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void status(){
        if(this.sides != null){
            System.out.println("O Tipo do triângulo é " + this.type);
            System.out.println("Seu perímetro é " + this.perimeter + "\n");
        }else{
            System.out.println("O triângulo não existe!\n");
        }
    }
    
    public double getPerimeter(){
        return this.perimeter;
    }

    @Override
    public double perimeter() {
        double perimeterI = 0;
        for(int i = 0; i < sides.length; i++) {
            perimeterI += sides[i];
        }
        return perimeterI;
    }
    
}
