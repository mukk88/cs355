/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import cs355.GUIFunctions;

import java.awt.Color;
import java.awt.event.MouseListener;

/**
 *
 * @author mark woo
 */
public class CS355lab1 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    	DrawingController myController = new DrawingController();
    	
        GUIFunctions.createCS355Frame(myController,new View(),new DrawingMouseListener(),new DrawingMouseMotionListener());
        GUIFunctions.refresh();
        GUIFunctions.changeSelectedColor(Color.WHITE);
        GUIFunctions.setHScrollBarMin(0);
        GUIFunctions.setVScrollBarMin(0);
        GUIFunctions.setHScrollBarMax(512);
        GUIFunctions.setVScrollBarMax(512);
        GUIFunctions.setHScrollBarKnob(256);
        GUIFunctions.setVScrollBarKnob(256);
    }
}