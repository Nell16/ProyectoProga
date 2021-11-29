/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JOptionPane;


public class ReservacionDeHospedaje 
{
    //Atributos - Objetos - Aca estan las variables que tendran un llamamiento en el main
    public int T_Esemana=40000;//Tarifa entre semana, posee un precio base de 40000$ pero se puede cambiar
    public int T_Fsemana=50000;//Tarifa de fin semana, posee un precio base de 50000$ pero se puede cambiar
    public int Lune=20;//Habitaciones disponibles del dia Lunes para los huespedes
    public int Marte=20;//Habitaciones disponibles del dia Martes para los huespedes
    public int Miercole=20;//Habitaciones disponibles del dia Miercoles para los huespedes
    public int Jueve=20;//Habitaciones disponibles del dia Jueves para los huespedes
    public int Vierne=20;//Habitaciones disponibles del dia Viernes para los huespedes
    public int Sabad=20;//Habitaciones disponibles del dia Sabado para los huespedes
    public int Doming=20;//Habitaciones disponibles del dia Domingo para los huespedes
    public int C_Hospe;//Reserva de hospedaje. Cantidad de clientes a hospedarse (Esta contratando el servicio del hotel)
    public int D_Hospe;//Reserva de hospedaje. Cantidad de dias a hospedarse (Esta contratando el servicio del hotel)
    public int Monto;//Monto calculando la tarifa dependiendo del dia escogido y multiplicado por los dias
    public int Iva;//Impuestos agregados al monto para el monto/precio final
    public int M_Total;//Monto final a pagar y se visualizara un mensaje como factura!
    
    //Metodos
    public void Reservacion()//Mensaje para visualizar la Disponibilidad de habitaciones en cada dia de la semana!
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
        JOptionPane.showMessageDialog(null,"Los datos se han ingresado exitosamente!\n"//Mensaje para confirmar la captura de los datos ingresados!
                +"=====================================\n"
                + "Tarifa de entre semana por persona: "+T_Esemana+"\n"
                + "Tarifa de fin de semana por persona : "+T_Fsemana+"\n"
                + "Clientes hospedados : "+C_Hospe+"\n"
                + "Dias hospedados: "+D_Hospe+"\n"
                + "=========Factura=========\n"//Mensaje para visualizar la factura con el monto calculando la cantidad de clientes, tarifa y dias!
                + "Monto : "+Monto+"\n"
                + "Iva : "+Iva+"\n"
                + "Monto total : "+M_Total);
    }
    
    public void DatosReservacion()//Mensaje para visualizar la tarifa que posee el hotel actualmente y los datos ingresados con anterioridad en el Hotel
    {
        JOptionPane.showMessageDialog(null,"La tarifa entre semana por persona es de "+T_Esemana+"$\n"
                + "La tarifa de fin de semana por persona es de "+T_Fsemana+"$");
                JOptionPane.showMessageDialog(null,"Disponibilidad hospedaje!\n"
                +"=====================================\n"
                + "1-Lunes: "+Lune+" Habitaciones\n"
                + "2-Martes: "+Marte+" Habitaciones\n"
                + "3-Miercoles: "+Miercole+" Habitaciones\n"
                + "4-Jueves: "+Jueve+" Habitaciones\n"
                + "5-Viernes: "+Vierne+" Habitaciones\n"
                + "6-Sabado: "+Sabad+" Habitaciones\n"
                + "7-Domingo: "+Doming+" Habitaciones");
    }
    
    public void DatosTarifas()/*Mensaje para visualizar el cambio de las tarifas que se llevan 
            a cabo en la ejecucion del codigo, tambien se visualizara la disponibilidad del hotel*/
    {
        JOptionPane.showMessageDialog(null,"La nueva tarifa entre semana por persona es de "+T_Esemana+"$\n"
                + "La nueva tarifa de fin de semana por persona es de "+T_Fsemana+"$");
        JOptionPane.showMessageDialog(null,"Disponibilidad hospedaje!\n"
                +"=====================================\n"
                + "1-Lunes: "+Lune+" Habitaciones\n"
                + "2-Martes: "+Marte+" Habitaciones\n"
                + "3-Miercoles: "+Miercole+" Habitaciones\n"
                + "4-Jueves: "+Jueve+" Habitaciones\n"
                + "5-Viernes: "+Vierne+" Habitaciones\n"
                + "6-Sabado: "+Sabad+" Habitaciones\n"
                + "7-Domingo: "+Doming+" Habitaciones");
    }
    
}
