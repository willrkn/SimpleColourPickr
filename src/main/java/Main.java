/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.Point;

/**
 *
 * @author Will
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the X Co-ordinate");
        int x = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type the Y Co-ordinate");
        int y = Integer.parseInt(reader.nextLine());
        
        ColourGet pixel = new ColourGet(x, y);
        pixel.printColour();
        
        PointerGet point = new PointerGet();
        point.printX();
        point.printY();
    }
}