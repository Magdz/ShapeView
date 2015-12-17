
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
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

    @Override
    public void Draw(Graphics2D g) {
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(color);
        g.setStroke(new BasicStroke((float) (1)));
        g.fill(new Ellipse2D.Double(x, y, radius, radius));
    }
    
}
