/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Container;
import javax.swing.*;

/**
 *
 * @author Will
 */

public class Main {
    public static void main(String[] args) throws Exception{
        
        JFrame frame = new JFrame("SimpleColourPickr");
        frame.setSize(200,500);
        frame.setLocation(100,100);
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        Container c = frame.getContentPane();
        
        // infinite loop of cursor   mouse updating.
        // TODO: Save processing power by not updating when the cursour is still
        while(true){
            // get pointer value
            PointerGet iteratingPoint = new PointerGet();
            // show rgb vlaue
            ColourGet iteratingPixel = new ColourGet(iteratingPoint.getX(), iteratingPoint.getY());
            iteratingPixel.printColour();
            
            c.setBackground(iteratingPixel.getColour());
            
//            TODO: Why does this not work?
            if(KeyPressDetect.isWPressed()){
                break;
            }
        }
    }
}