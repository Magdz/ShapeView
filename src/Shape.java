
import java.awt.Color;
import java.awt.Graphics2D;

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
    protected Color color;
    
    public Shape(String ShapeName, double x, double y, Color color){
        this.ShapeName = ShapeName;
        this.x = x;
        this.y = y;
        this.color = color;
    }
    
    public abstract void Draw(Graphics2D g);
    
}
