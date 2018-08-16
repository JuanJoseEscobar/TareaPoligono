/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallercg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.PathTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import javax.swing.JOptionPane;

/**
 *
 * @author sebastian.carmona
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private Color color;
    @FXML
    private Label Label;
    
    @FXML
    private Canvas canvas;
    @FXML
    private GraphicsContext lienzo;
    @FXML
    private String tipo="nada";
    @FXML
    Button circulo,triangulo,cuadrado;
    @FXML
    private ColorPicker colorclicker;
   // @FXML
   // private Polygon figura12,figura13,figura14;
    
    
    
           
    @FXML
    private void Label(MouseEvent event) 
    {
       Label.setText("X= "+event.getX()+" , Y= "+event.getY());         
    }
    @FXML
    private void GenerarCuadrado(ActionEvent event)
    {
        lienzo.clearRect(0, 0, 600, 600);
        generarColor(event);
        lienzo = canvas.getGraphicsContext2D();
        lienzo.setLineWidth(1);
        double x[] = {326,225,415,159,450,159,159,415,225,326,326};
        double y[] = {152,430,204,351,300,249,249,396,170,448,152};
        
        lienzo.strokePolyline(x, y, x.length);
        
        
    }
    
    @FXML
    private void LimpiarCanvas(ActionEvent event){
        double w = canvas.getWidth();
        double h = canvas.getHeight();
        lienzo.clearRect(0, 0, w, h);
        lienzo.setStroke(Color.BLACK);
        lienzo.strokeRect(0, 0, w, h);
    }
    
    @FXML
    private void Ccolor(ActionEvent event){
        GenerarCuadrado(event);
    }
    
    @FXML
    private void generarColor(ActionEvent event)
    {
       color = colorclicker.getValue();
       
       lienzo.setStroke(color);
       
    }
    
     
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        lienzo = canvas.getGraphicsContext2D();
        double w = canvas.getWidth();
        double h = canvas.getHeight();
        lienzo = canvas.getGraphicsContext2D();
        lienzo.clearRect(0, 0, w, h);
        lienzo.setStroke(Color.BLUE);
        lienzo.strokeRect(0, 0, w, h);
    }    
    
}
