/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JOptionPane;


public class ReservacionDeRestaurante 
{
    //Atributos - Objetos - Aca estan las variables que tendran un llamamiento en el main
    private int R_Dias;//En este atributo 
    private int R_Aforo=30;//El aforo permitido dentro del restaurante en cada temporada
    private int R_Clientes;//En este atributo se capturara la cantidad de reservaciones que tendran los clientes
    private int E_Desa1=30;//Espacios disponibles en el Desayuno#1
    private int E_Desa2=30;//Espacios disponibles en el Desayuno#2
    private int E_Desa3=30;//Espacios disponibles en el Desayuno#3
    private int E_Alm1=30;//Espacios disponibles en el Almuerzo#1
    private int E_Alm2=30;//Espacios disponibles en el Almuerzo#2
    private int E_Alm3=30;//Espacios disponibles en el Almuerzo#3
    private int E_Cen1=30;//Espacios disponibles en la Cena#1
    private int E_Cen2=30;//Espacios disponibles en la Cena#2
    private int E_Cen3=30;//Espacios disponibles en la Cena#3
    private int H_Desa;//Horario del Desayuno
    private int H_Alm;//Horario del Almuerzo
    private int H_Cen;//Horario de la Cena
    //Constructor vacio
    public ReservacionDeRestaurante()//Esto es para poder Accesar con los objetos en el main 
    {
        this.R_Dias=R_Dias;
        this.R_Aforo=R_Aforo;
        this.R_Clientes=R_Clientes;
        this.E_Desa1=E_Desa1;
        this.E_Desa2=E_Desa2;
        this.E_Desa3=E_Desa3;
        this.E_Alm1=E_Alm1;
        this.E_Alm2=E_Alm2;
        this.E_Alm3=E_Alm3;
        this.E_Cen1=E_Cen1;
        this.E_Cen2=E_Cen2;
        this.E_Cen3=E_Cen3;
        this.H_Desa=H_Desa;
        this.H_Alm=H_Alm;
        this.H_Cen=H_Cen;
    }
    //Get and Set
    public int getR_Dias() {
        return R_Dias;
    }

    public void setR_Dias(int R_Dias) {
        this.R_Dias = R_Dias;
    }

    public int getR_Aforo() {
        return R_Aforo;
    }

    public void setR_Aforo(int R_Aforo) {
        this.R_Aforo = R_Aforo;
    }

    public int getR_Clientes() {
        return R_Clientes;
    }

    public void setR_Clientes(int R_Clientes) {
        this.R_Clientes = R_Clientes;
    }

    public int getE_Desa1() {
        return E_Desa1;
    }

    public void setE_Desa1(int E_Desa1) {
        this.E_Desa1 = E_Desa1;
    }

    public int getE_Desa2() {
        return E_Desa2;
    }

    public void setE_Desa2(int E_Desa2) {
        this.E_Desa2 = E_Desa2;
    }

    public int getE_Desa3() {
        return E_Desa3;
    }

    public void setE_Desa3(int E_Desa3) {
        this.E_Desa3 = E_Desa3;
    }

    public int getE_Alm1() {
        return E_Alm1;
    }

    public void setE_Alm1(int E_Alm1) {
        this.E_Alm1 = E_Alm1;
    }

    public int getE_Alm2() {
        return E_Alm2;
    }

    public void setE_Alm2(int E_Alm2) {
        this.E_Alm2 = E_Alm2;
    }

    public int getE_Alm3() {
        return E_Alm3;
    }

    public void setE_Alm3(int E_Alm3) {
        this.E_Alm3 = E_Alm3;
    }

    public int getE_Cen1() {
        return E_Cen1;
    }

    public void setE_Cen1(int E_Cen1) {
        this.E_Cen1 = E_Cen1;
    }

    public int getE_Cen2() {
        return E_Cen2;
    }

    public void setE_Cen2(int E_Cen2) {
        this.E_Cen2 = E_Cen2;
    }

    public int getE_Cen3() {
        return E_Cen3;
    }

    public void setE_Cen3(int E_Cen3) {
        this.E_Cen3 = E_Cen3;
    }

    public int getH_Desa() {
        return H_Desa;
    }

    public void setH_Desa(int H_Desa) {
        this.H_Desa = H_Desa;
    }

    public int getH_Alm() {
        return H_Alm;
    }

    public void setH_Alm(int H_Alm) {
        this.H_Alm = H_Alm;
    }

    public int getH_Cen() {
        return H_Cen;
    }

    public void setH_Cen(int H_Cen) {
        this.H_Cen = H_Cen;
    }
    //Metodos
    public void TiemposDisponibles()/*Mensaje para visualizar el mensaje final que despliega
            los espacios disponibles de todos los horarios del Restaurante!*/
    {
        JOptionPane.showMessageDialog(null,"Espacios Disponibles (Darle un vistazo antes de continuar)!\n"
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
    
    public void AforoRestaurante()//Mensaje para visualizar el aforo que se encuentra actualmente en el Restaurante!
    {
        JOptionPane.showMessageDialog(null,"Actualmente el aforo aprobado es de "+R_Aforo+" personas!");
    }
    
    public void ReservaRestaurante()/*Mensaje para visualizar el mensaje final que de desplegara al completar la reserva
            del restaurante! Todo esto lo podremos visualizar ejecutando el codigo en el main!*/
    {
        JOptionPane.showMessageDialog(null,"");
    }
}
