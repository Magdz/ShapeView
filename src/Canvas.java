
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class Canvas extends JPanel{
    
    public static ArrayList<Shape> Shapes = new ArrayList();
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.white);
        Graphics2D g2d = (Graphics2D)g;
        Shapes.stream().forEach((shape) -> {
            shape.Draw(g2d);
        });
    }
}
