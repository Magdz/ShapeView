
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class Circle extends Shape{
    
    private final double radius;

    public Circle(String ShapeName, double x, double y, double radius, Color Color) {
        super(ShapeName, x, y, Color);
        this.radius = radius;
    }
    
}
