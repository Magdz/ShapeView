
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class Parser {
    
    private final BufferedReader buff;
    private final String[] Lines;
    
    public Parser(BufferedReader buff){
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
    }
}
