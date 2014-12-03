/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import org.gdal.gdal.gdal;

/**
 *
 * @author Gropu-8
 */
public class Test {

    
    public static void main(String[] args) {
        
        
         gdal.AllRegister();
      
        SatImage s= new SatImage();
        s.openImage();
        
        ImageFilter f= new ImageFilter();
        f.edgeDectector_Diagonal();
        f.edgeEnhancement_Laplace();
        f.edgeDectector_Vertical();
        
      
                  
                }
            }
        
       
        
       
        // TODO code application logic here
    

