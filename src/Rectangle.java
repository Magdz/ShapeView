
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
public class Rectangle extends Shape{
    
    protected final double length;
    private final double width;

    public Rectangle(String ShapeName, double x, double y, double length, double width, Color Color) {
        super(ShapeName, x, y, Color);
        this.length = length;
        this.width = width;
    }
    
}
