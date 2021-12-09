/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JOptionPane;


public class RegistroDelHotel 
{
    //Atributos - Objetos - Aca estan las variables que tendran un llamamiento en el main
    private String Hotel; //Puntarenas - San Carlos - Guanacaste
    private int C_Total;//Cantidad total de personas admitidas en el hotel
    private int C_Habitaciones;//Cantidad de habitaciones que dispondra el hotel
    private int Aforo;//Aforo permitido en su respectiva temporada (Ejemplo: 50 Huespedes en Navidad)
    private int H_Disponibles;//Cantidad de habitaciones disponibles en el hotel segun su aforo
    //Constructor vacio
    public RegistroDelHotel()//Esto le otorga acceso al main y poder interactuar con los objetos.
    {
        this.Hotel=Hotel;
        this.C_Total=C_Total;
        this.C_Habitaciones=C_Habitaciones;
        this.Aforo=Aforo;
        this.H_Disponibles=H_Disponibles;
    }
    //Get and Set

    public String getHotel() {
        return Hotel;
    }

    public void setHotel(String Hotel) {
        this.Hotel = Hotel;
    }

    public int getC_Total() {
        return C_Total;
    }

    public void setC_Total(int C_Total) {
        this.C_Total = C_Total;
    }

    public int getC_Habitaciones() {
        return C_Habitaciones;
    }

    public void setC_Habitaciones(int C_Habitaciones) {
        this.C_Habitaciones = C_Habitaciones;
    }

    public int getAforo() {
        return Aforo;
    }

    public void setAforo(int Aforo) {
        this.Aforo = Aforo;
    }

    public int getH_Disponibles() {
        return H_Disponibles;
    }

    public void setH_Disponibles(int H_Disponibles) {
        this.H_Disponibles = H_Disponibles;
    }
    //Metodos
    public void RegistroFinal()/* Mensaje del "RegistroFinal" donde podremos visualizar el mensaje con todos los
            datos recien almacenados al ejecutar el codigo*/
    {
        JOptionPane.showMessageDialog(null,"Los datos se han guardado exitosamente!\n"
                +"=====================================\n"
                + "Nombre del Hotel: "+Hotel+"\n"
                + "Cantidad total del hotel: "+C_Total+"\n"
                + "Cantidad de Habitaciones: "+C_Habitaciones+"\n"
                + "Aforo aprobado: "+Aforo+"\n"
                + "Habitaciones disponibles por dia: "+H_Disponibles+"\n"
                + "");
        RegistroDatos();
    }
    
    public void RegistroDatos()/*Mensaje del "RegistroDatos" donde podremos visualizar el mensaje con todos los
            datos anteriormente ingresados en el Registro*/
    {
        JOptionPane.showMessageDialog(null,"Datos almacenados en el sistema!");
        JOptionPane.showMessageDialog(null,"Nombre del Hotel: Puntarenas \n"
        + "Cantidad total del hotel: 100 \n"
        + "Cantidad de Habitaciones: 40 \n"
        + "Aforo aprobado: 80\n"
        + "Habitaciones disponibles por dia: 12");
        JOptionPane.showMessageDialog(null,"Nombre del Hotel: San Carlos \n"
        + "Cantidad total del hotel: 70 \n"
        + "Cantidad de Habitaciones: 35 \n"
        + "Aforo aprobado: 65\n"
        + "Habitaciones disponibles por dia: 8");

    }
    
}
