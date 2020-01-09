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
public class PointerGet {
    private Point b;
    
    public PointerGet(){
        PointerInfo a = MouseInfo.getPointerInfo();
        b = a.getLocation();
    }
    
    public void printX(){
        System.out.println(this.b.getX());
    }
    
    public void printY(){
        System.out.println(this.b.getY());
    }
}
