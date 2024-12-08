/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package práctica.pkg10;

import javax.swing.JOptionPane; 

/**
 *
 * @author amand
 */
public class Práctica10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Se pide el numero del mes que se quiere saber la estacion
        String estacion=JOptionPane.showInputDialog("Ingrese el numero del mes");
        
        
            try{
                int mes =Integer.parseInt(estacion);
                
                switch (mes){
                        
                    case 1:
                    case 2:
                    case 3:
                        JOptionPane.showMessageDialog(null,"Su estacion es Verano");
                        break;
                        
                    case 4:
                    case 5:
                    case 6:
                        JOptionPane.showMessageDialog(null,"Su estacion es Otoño");
                        break;
                        
                    case 7:
                    case 8:
                    case 9:
                        JOptionPane.showMessageDialog(null,"Su estacion es Invierno");
                        break;
                        
                    case 10:
                    case 11:
                    case 12:
                        JOptionPane.showMessageDialog(null, "Su estacion es Primavera");
                        
                        break;
                }
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Error:Ingrese un numero valido", "Error", JOptionPane.ERROR_MESSAGE);
                
            }
        }
}
