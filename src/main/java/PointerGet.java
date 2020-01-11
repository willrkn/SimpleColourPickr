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
    
    //gets point value 
    public PointerGet(){
        PointerInfo a = MouseInfo.getPointerInfo();
        b = a.getLocation();
    }
    
    // returns vals of last time PointerGet was ran
    public int getX(){
       double x = this.b.getX();
       return (int) x;
    }
    public int getY(){
       double y = this.b.getY();
       return (int) y;
    }
}
