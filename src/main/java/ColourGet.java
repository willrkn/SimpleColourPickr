/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Robot;
import java.awt.Color;


/**
 *
 * @author Will
 */
public class ColourGet {
    private String rgb = "null";
    private final Robot r = new Robot();
        
    // gets rgb value of xy
    public ColourGet(int x, int y) throws Exception{
        Color colour = r.getPixelColor(x, y);
        rgb = colour.toString();
    }
    
    public void printColour(){
        System.out.println(this.rgb);
    }
}
