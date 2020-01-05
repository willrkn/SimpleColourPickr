/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Will
 */

import java.util.Scanner;
import java.awt.Robot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner reader = new Scanner(System.in);
        String rgb = "null";
        Robot r = new Robot();
        
        System.out.println("Type the X Co-ordinate");
        int xval = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type the Y Co-ordinate");
        int yval = Integer.parseInt(reader.nextLine());
        
        Color colour = r.getPixelColor(xval, yval);
        
        System.out.println(colour);
    }
}