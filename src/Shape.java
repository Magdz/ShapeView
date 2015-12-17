
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
public abstract class Shape {
    
    protected String ShapeName;
    protected double x;
    protected double y;
    protected Color Color;
    
    public Shape(String ShapeName, double x, double y, Color Color){
        this.ShapeName = ShapeName;
        this.x = x;
        this.y = y;
        this.Color = Color;
    }
    
}
