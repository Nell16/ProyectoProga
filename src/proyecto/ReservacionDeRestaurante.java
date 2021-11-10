/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JOptionPane;


public class ReservacionDeRestaurante 
{
    //Atributos
    public int R_Dias;
    public int R_Aforo=30;
    public int R_Clientes;
    public int E_Desa1=30;
    public int E_Desa2=30;
    public int E_Desa3=30;
    public int E_Alm1=30;
    public int E_Alm2=30;
    public int E_Alm3=30;
    public int E_Cen1=30;
    public int E_Cen2=30;
    public int E_Cen3=30;
    public int H_Desa;
    public int H_Alm;
    public int H_Cen;
    
    //Metodos
    public void TiemposDisponibles()
    {
        JOptionPane.showMessageDialog(null,"Espacios Disponibles (Darle un vistazo antes de contunuar)!\n"
        + "Desayuno\n"
        + "7:00 am = "+E_Desa1+" espacio/s\n"
        + "8:00 am = "+E_Desa2+" espacio/s\n"
        + "9:00 am = "+E_Desa3+" espacio/s\n"
        + "=============================\n"
        + "Almuerzo\n"
        + "12:00 md = "+E_Alm1+" espacio/s\n"
        + "1:00 pm = "+E_Alm2+" espacio/s\n"
        + "2:00 pm = "+E_Alm3+" espacio/s\n"
        + "=============================\n"
        + "Cena\n"
        + "7:00 pm = "+E_Cen1+" espacio/s\n"
        + "8:00 pm = "+E_Cen2+" espacio/s\n"
        + "9:00 pm = "+E_Cen3+" espacio/s");
    }
    
    public void AforoRestaurante()
    {
        JOptionPane.showMessageDialog(null,"Actualmente el aforo aprobado es de "+R_Aforo+" personas!");
    }
    
    public void ReservaRestaurante()
    {
        JOptionPane.showMessageDialog(null,"");
    }
}
