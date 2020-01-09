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

public class Main {
    public static void main(String[] args) throws Exception{
        while(true){
            // get pointer value
            PointerGet iteratingPoint = new PointerGet();
            // show rgb vlaue
            ColourGet iteratingPixel = new ColourGet(iteratingPoint.getX(), iteratingPoint.getY());
            iteratingPixel.printColour();
        }
    }
}