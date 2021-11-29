/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JOptionPane;


public class CheckIn_Out 
{
    //Atributos - Objetos - Aca estan las variables que tendran un llamamiento en el main
    private int P_IN;
    private int P_OUT;
    //Espacios
    private int E_INT1=20;//Estos atributos/objetos son para definir los espacios en el servicio de ingreso y salida!
    private int E_INT2=20;
    private int E_INT3=20;
    private int E_INT4=20;
    private int E_INT5=20;
    private int E_INT6=20;
    private int E_OUT1=20;
    private int E_OUT2=20;
    private int E_OUT3=20;
    private int E_OUT4=20;
    private int E_OUT5=20;
    private int E_OUT6=20;
    //Horarios
    private String H_INT1;//Estos atributos/objetos son para definir los horarios en extractos de 30 min!
    private String H_INT2;
    private String H_INT3;
    private String H_INT4;
    private String H_INT5;
    private String H_INT6;
    private String H_OUT1;
    private String H_OUT2;
    private String H_OUT3;
    private String H_OUT4;
    private String H_OUT5;
    private String H_OUT6;
    //Constructor vacio
    public CheckIn_Out()
    {
        
    }
    //Get and Set

    public int getP_IN() {
        return P_IN;
    }

    public void setP_IN(int P_IN) {
        this.P_IN = P_IN;
    }

    public int getP_OUT() {
        return P_OUT;
    }

    public void setP_OUT(int P_OUT) {
        this.P_OUT = P_OUT;
    }

    public int getE_INT1() {
        return E_INT1;
    }

    public void setE_INT1(int E_INT1) {
        this.E_INT1 = E_INT1;
    }

    public int getE_INT2() {
        return E_INT2;
    }

    public void setE_INT2(int E_INT2) {
        this.E_INT2 = E_INT2;
    }

    public int getE_INT3() {
        return E_INT3;
    }

    public void setE_INT3(int E_INT3) {
        this.E_INT3 = E_INT3;
    }

    public int getE_INT4() {
        return E_INT4;
    }

    public void setE_INT4(int E_INT4) {
        this.E_INT4 = E_INT4;
    }

    public int getE_INT5() {
        return E_INT5;
    }

    public void setE_INT5(int E_INT5) {
        this.E_INT5 = E_INT5;
    }

    public int getE_INT6() {
        return E_INT6;
    }

    public void setE_INT6(int E_INT6) {
        this.E_INT6 = E_INT6;
    }

    public int getE_OUT1() {
        return E_OUT1;
    }

    public void setE_OUT1(int E_OUT1) {
        this.E_OUT1 = E_OUT1;
    }

    public int getE_OUT2() {
        return E_OUT2;
    }

    public void setE_OUT2(int E_OUT2) {
        this.E_OUT2 = E_OUT2;
    }

    public int getE_OUT3() {
        return E_OUT3;
    }

    public void setE_OUT3(int E_OUT3) {
        this.E_OUT3 = E_OUT3;
    }

    public int getE_OUT4() {
        return E_OUT4;
    }

    public void setE_OUT4(int E_OUT4) {
        this.E_OUT4 = E_OUT4;
    }

    public int getE_OUT5() {
        return E_OUT5;
    }

    public void setE_OUT5(int E_OUT5) {
        this.E_OUT5 = E_OUT5;
    }

    public int getE_OUT6() {
        return E_OUT6;
    }

    public void setE_OUT6(int E_OUT6) {
        this.E_OUT6 = E_OUT6;
    }

    public String getH_INT1() {
        return H_INT1;
    }

    public void setH_INT1(String H_INT1) {
        this.H_INT1 = H_INT1;
    }

    public String getH_INT2() {
        return H_INT2;
    }

    public void setH_INT2(String H_INT2) {
        this.H_INT2 = H_INT2;
    }

    public String getH_INT3() {
        return H_INT3;
    }

    public void setH_INT3(String H_INT3) {
        this.H_INT3 = H_INT3;
    }

    public String getH_INT4() {
        return H_INT4;
    }

    public void setH_INT4(String H_INT4) {
        this.H_INT4 = H_INT4;
    }

    public String getH_INT5() {
        return H_INT5;
    }

    public void setH_INT5(String H_INT5) {
        this.H_INT5 = H_INT5;
    }

    public String getH_INT6() {
        return H_INT6;
    }

    public void setH_INT6(String H_INT6) {
        this.H_INT6 = H_INT6;
    }

    public String getH_OUT1() {
        return H_OUT1;
    }

    public void setH_OUT1(String H_OUT1) {
        this.H_OUT1 = H_OUT1;
    }

    public String getH_OUT2() {
        return H_OUT2;
    }

    public void setH_OUT2(String H_OUT2) {
        this.H_OUT2 = H_OUT2;
    }

    public String getH_OUT3() {
        return H_OUT3;
    }

    public void setH_OUT3(String H_OUT3) {
        this.H_OUT3 = H_OUT3;
    }

    public String getH_OUT4() {
        return H_OUT4;
    }

    public void setH_OUT4(String H_OUT4) {
        this.H_OUT4 = H_OUT4;
    }

    public String getH_OUT5() {
        return H_OUT5;
    }

    public void setH_OUT5(String H_OUT5) {
        this.H_OUT5 = H_OUT5;
    }

    public String getH_OUT6() {
        return H_OUT6;
    }

    public void setH_OUT6(String H_OUT6) {
        this.H_OUT6 = H_OUT6;
    }
    
    //Metodos
    public void PersonasTiempoCheck()//Mensaje para visualizar Las personas atendidas en un cierto tiempo
    {
        JOptionPane.showMessageDialog(null,"");
    }
    
    public void HorariosINT()//Mensaje para visualizar los horarios que posee el checkIn
    {
        JOptionPane.showMessageDialog(null,"");
    }
    
    public void HorariosOUT()//Mensaje para visualizar los horarios que posee el checkOut
    {
        JOptionPane.showMessageDialog(null,"");
    }
    
    public void CheckFinal()//Mensaje para visualizar todos los datos cambiados en la clase CheckIn/Out - Datos recopilados
    {
        JOptionPane.showMessageDialog(null,"Se leeran datos ingresados anteriormente");
    }
}
