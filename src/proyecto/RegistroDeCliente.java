/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JOptionPane;


public class RegistroDeCliente 
{
    //Atributos
    public String N_Cliente;
    public int N_Identificacion;
    public String Pais;
    public String Provincia;
    public String Canton;
    public String Distrito;
    public int Edad;
    public String Forma_Pago;
    public int N_Acompanantes;
   
    //Metodos
    public void RegistroCliente()
    {
        JOptionPane.showMessageDialog(null,"Los datos se han guardado exitosamente!\n"
                +"=====================================\n"
                + "Nombre del cliente: "+N_Cliente+"\n"
                + "Identificacion : "+N_Identificacion+"\n"
                + "N. Acompañantes : "+N_Acompanantes+"\n"
                + "Pais - Provincia - Canton: "+Pais+" - "+Provincia+" - "+Canton+"\n"
                + "Edad: "+Edad+"\n"
                + "Forma de pago: "+Forma_Pago);
    }
    
    public void DatosCliente()
    {
        JOptionPane.showMessageDialog(null,"Se leeran datos ingresados anteriormente!");
    }
}
