/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bytestream1;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class LAB2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "Hello World";
        byte[] b = s.getBytes();
        try {
            FileOutputStream output = new FileOutputStream("data.dat");
            try {
                output.write(1);
                output.write(2);
                output.write(3);
                output.write(4);
                output.write(5);
                output.close();
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }
             } catch (IOException ex) {
                Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        try {
            FileInputStream input = new FileInputStream("data.dat");
            int ch;
            while ((ch=input.read())!=-1){
                System.out.println((char)ch);
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
