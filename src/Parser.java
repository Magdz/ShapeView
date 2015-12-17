
import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public final class Parser {
    
    private final BufferedReader buff;
    private final String[] Lines;
    
    public Parser(BufferedReader buff) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException{
        this.buff = buff;
        StringBuilder Builder = new StringBuilder();
        String line;
        try {
            line = buff.readLine();
            while (line != null) {
                Builder.append(line);
                Builder.append("\n");
                line = buff.readLine();
            }
            buff.close();
        } catch (IOException ex) {
            System.out.println("Buffering Error");
        }
        Lines = Builder.toString().split("\n");
        Parse();
    }
    
    public void Parse() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException{
        String ShapeType;
        for(String Line:this.Lines){
            String[] getType;
            getType = Line.split(":");
            ShapeType = getType[0];
            String[] Comma;
            Comma = getType[1].split(",");
            switch(ShapeType){
                case "Rectangle":
                    Rectangle Rectangle = new Rectangle(Comma[0], Double.parseDouble(Comma[1]), Double.parseDouble(Comma[2]), Double.parseDouble(Comma[3]), Double.parseDouble(Comma[4]), (Color)Color.class.getField(Comma[5]).get(null));
                    Canvas.Shapes.add(Rectangle);
                    break;
                case "Square":
                    Square Square = new Square(Comma[0], Double.parseDouble(Comma[1]), Double.parseDouble(Comma[2]), Double.parseDouble(Comma[3]), (Color)Color.class.getField(Comma[4]).get(null));
                    Canvas.Shapes.add(Square);
                    break;
                case "Circle":
                    Circle Circle = new Circle(Comma[0], Double.parseDouble(Comma[1]), Double.parseDouble(Comma[2]), Double.parseDouble(Comma[3]), (Color)Color.class.getField(Comma[4]).get(null));
                    Canvas.Shapes.add(Circle);
                    break;
                default:
                    break;
            }
        }
    }
}
