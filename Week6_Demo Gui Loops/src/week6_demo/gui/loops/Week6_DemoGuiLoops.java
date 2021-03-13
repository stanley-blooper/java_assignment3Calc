/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6_demo.gui.loops;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
 import javafx.scene.shape.*;
import javafx.stage.Stage;

/**
 *
 * @author sjean
 */
public class Week6_DemoGuiLoops extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     launch(args);   // TODO code application logic here
    }

    @Override
    public void start(Stage s) throws Exception {
        
       
        Line line1 = new Line(200,200,200,400);//left side
        Line line2 = new Line(400,400,200,400);//bottom line
        Line line3 = new Line(400,400,400,200);//left side
        Line line4 = new Line(250,300,250,400);//left door side
        Line line5 = new Line(350,400,350,300);//rifgght door side
        Line line6 = new Line(250,300,350,300);//rifgght door side


  
        
        
        
        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(new Double[]{
            500.0, 200.0,
            300.0, 100.0,
            100.0, 200.0
        });

Circle circle = new Circle();
circle.setCenterX(270.0f);
circle.setCenterY(370.0f);
circle.setRadius(5.0f);

        
        
        Group gp = new Group(line1,line2,polygon,line3,line4,line5,line6,circle);
    
        Scene sn = new Scene(gp,600,400);
        
        s.setScene(sn);
        s.show();
    
    }
    
}
