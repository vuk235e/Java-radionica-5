/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jr05;

import javax.swing.JDialog;
import jr05.form.CityForm;

/**
 *
 * @author student2
 */
public class JR05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JDialog cf = new CityForm(null, true);
        //prikazi formu
        cf.setVisible(true);
    }
    
}
