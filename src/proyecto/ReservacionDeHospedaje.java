/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JOptionPane;


public class ReservacionDeHospedaje 
{
    //Atributos
    public int T_Esemana;
    public int T_Fsemana;
    public int Lune;
    public int Marte;
    public int Miercole;
    public int Jueve;
    public int Vierne;
    public int Sabad;
    public int Doming;
    public int C_Hospe;
    public int D_Hospe;
    public int Monto;
    public int Iva;
    public int M_Total;
    
    //Metodos
    public void Reservacion()
    {
        JOptionPane.showMessageDialog(null,"Disponibilidad hospedaje!\n"
                +"=====================================\n"
                + "1-Lunes: "+Lune+" Habitaciones\n"
                + "2-Martes: "+Marte+" Habitaciones\n"
                + "3-Miercoles: "+Miercole+" Habitaciones\n"
                + "4-Jueves: "+Jueve+" Habitaciones\n"
                + "5-Viernes: "+Vierne+" Habitaciones\n"
                + "6-Sabado: "+Sabad+" Habitaciones\n"
                + "7-Domingo: "+Doming+" Habitaciones");
        JOptionPane.showMessageDialog(null,"Los datos se han ingresado exitosamente!\n"
                +"=====================================\n"
                + "Tarifa de entre semana por persona: "+T_Esemana+"\n"
                + "Tarifa de fin de semana por persona : "+T_Fsemana+"\n"
                + "Clientes hospedados : "+C_Hospe+"\n"
                + "Dias hospedados: "+D_Hospe+"\n"
                + "=========Factura=========\n"
                + "Monto : "+Monto+"\n"
                + "Iva : "+Iva+"\n"
                + "Monto total : "+M_Total);
    }
    
    public void DatosReservacion()
    {
        JOptionPane.showMessageDialog(null,"Se leera la tarifa entre semana y fin de semana\n"
                + "Se leera la Disponibilidad por dias de la semana");
    }
    
    public void DatosTarifas()
    {
        JOptionPane.showMessageDialog(null,"Se leera la tarifa entre semana y fin de semana recien cambiada!\n"
                + "Se leera la Disponibilidad por dias de la semana");
    }
    
}
