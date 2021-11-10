/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JOptionPane;


public class RegistroDelHotel 
{
    //Atributos
    public String Hotel;
    public int C_Total;
    public int C_Habitaciones;
    public int Aforo;
    public int H_Disponibles;
    
    //Metodos
    public void RegistroFinal()
    {
        JOptionPane.showMessageDialog(null,"Los datos se han guardado exitosamente!\n"
                +"=====================================\n"
                + "Nombre del Hotel: "+Hotel+"\n"
                + "Cantidad total del hotel: "+C_Total+"\n"
                + "Cantidad de Habitaciones: "+C_Habitaciones+"\n"
                + "Aforo aprobado: "+Aforo+"\n"
                + "Habitaciones disponibles por dia: "+H_Disponibles);
    }
    
    public void RegistroDatos()
    {
        JOptionPane.showMessageDialog(null,"Se leeran datos ingresados anteriormente");
    }
    
}
