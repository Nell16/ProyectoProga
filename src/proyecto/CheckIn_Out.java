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
    private int []E_IN=new int[6];//ARREGLOS PARA ASIGNAR LOS ESPACIOS EN CADA EXTRACTO DE 30 MIN!
    private int []E_OUT=new int[6];
    //Horarios
    private String []H_IN=new String[6];//ARREGLOS PARA ASIGNAR LOS HORARIOS EN EXTRACTOS DE 30 MIN!
    private String []H_OUT=new String[6];
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

    public int[] getE_IN() {
        return E_IN;
    }

    public void setE_IN(int[] E_IN) {
        this.E_IN = E_IN;
    }

    public int[] getE_OUT() {
        return E_OUT;
    }

    public void setE_OUT(int[] E_OUT) {
        this.E_OUT = E_OUT;
    }

    public String[] getH_IN() {
        return H_IN;
    }

    public void setH_IN(String[] H_IN) {
        this.H_IN = H_IN;
    }

    public String[] getH_OUT() {
        return H_OUT;
    }

    public void setH_OUT(String[] H_OUT) {
        this.H_OUT = H_OUT;
    }

    
    //Metodos
    public void PersonasTiempoCheck()//Mensaje para visualizar Las personas atendidas en todos los horarios!
    {
        JOptionPane.showMessageDialog(null,"Numero de personas que pueden hacer el Check In / Ingreso al mismo tiempo : "+P_IN+"\n"
        + "Numero de personas que pueden hacer el Check Out / Salida al mismo tiempo : "+P_OUT);
    }
    //////////////////////////
    public void HorariosINT()//Mensaje para visualizar los horarios que posee el checkIn
    {
        JOptionPane.showMessageDialog(null,"Procesando...");
        JOptionPane.showMessageDialog(null,"Se requiere ingresar los horarios disponible de los servicios Check In / Check Out!\n"
                + "Nota: Tienen que ir en extractos de 30 min! / Ejemplo#1: 9:00 am - Ejemplo#2: 9:30 am!");
                JOptionPane.showMessageDialog(null,"Horarios de Ingreso / Check In!");
                for (int X=0;X<6;X++)
                {
                   String HIN= JOptionPane.showInputDialog("Horario#"+(X+1)+"..:");
                   H_IN[X]=HIN;
                }   
    }
    //////////////////////////
    public void Leer_IN()//Mensaje para visualizar los datos del arreglo H_IN! corresponde a los horarios
    {
        JOptionPane.showMessageDialog(null,"Horarios de Ingreso / Check In\n"
        + "El horario de Check In esta dividio en extractos de 30 minutos!\n"
        + "\n");
        for (int X=0;X<6;X++)
        {
            JOptionPane.showMessageDialog(null,(X+1)+"- Horario de "+H_IN[X]+" : "+E_IN[X]);
        }
    }
    //////////////////////////
    public void Leer_INFIJO()//Mensaje para visualizar los datos del arreglo H_IN! corresponde a los horarios
    {
        JOptionPane.showMessageDialog(null,"Horarios de Ingreso / Check In\n"
        + "\n");
        for (int X=0;X<6;X++)
        {
            JOptionPane.showMessageDialog(null,(X+1)+"- Horario de "+H_IN[X]+" : "+P_IN);
        }
    }
    //////////////////////////
    public void Leer_OUTFIJO()//Mensaje para visualizar los datos del arreglo H_OUT! corresponde a los horarios
    {
        JOptionPane.showMessageDialog(null,"Horarios de Salida / Check Out\n"
        + "\n");
        for (int X=0;X<6;X++)
        {
            JOptionPane.showMessageDialog(null,(X+1)+"- Horario de "+H_OUT[X]+" : "+P_OUT);
        }
    }
    //////////////////////////
    public void HorariosOUT()//Mensaje para visualizar los horarios que posee el checkOut
    {
        JOptionPane.showMessageDialog(null,"Procesando...");
        JOptionPane.showMessageDialog(null,"Se requiere ingresar los horarios disponible de los servicios Check In / Check Out!\n"
                + "Nota: Tienen que ir en extractos de 30 min! / Ejemplo#1: 9:00 am - Ejemplo#2: 9:30 am!");
                JOptionPane.showMessageDialog(null,"Horarios de Salida / Check Out!");
                for (int X=0;X<6;X++)
                {
                   String HOUT= JOptionPane.showInputDialog("Horario#"+(X+1)+"..:");
                   H_OUT[X]=HOUT;
                }
    }
    //////////////////////////
    public void PersonasIn()//Mensaje para visualizar la cantidad de personas que pueden tramitar en un cierto horario
    {
        JOptionPane.showMessageDialog(null,"Procesando...");
        JOptionPane.showMessageDialog(null,"Cantidad de personas / Check In / Extractos de 30 min");
        for (int X=0;X<6;X++)
        {
            int PIN=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantas personas pueden hacer el Check in al mismo tiempo en el horario de las "+H_IN[X]+"..:"));
            E_IN[X]=PIN;
        }
        JOptionPane.showMessageDialog(null,"Datos almacenados correctamente!");
    }        
    //////////////////////////
    public void PersonasOut()//Mensaje para visualizar la cantidad de personas que pueden tramitar en un cierto horario
    {
        JOptionPane.showMessageDialog(null,"Procesando...");
        JOptionPane.showMessageDialog(null,"Cantidad de personas / Check Out / Extractos de 30 min");
        for (int X=0;X<6;X++)
        {
            int POUT=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantas personas pueden hacer el Check Out al mismo tiempo en el horario de las "+H_OUT[X]+"..:"));
            E_OUT[X]=POUT;
        }
        JOptionPane.showMessageDialog(null,"Datos almacenados correctamente!");
    }        
    //////////////////////////
    public void Leer_Out()//Mensaje para visualizar los datos del arreglo H_OUT! corresponde a los horarios
    {
        JOptionPane.showMessageDialog(null,"Horarios de Salida / Check Out\n"
        + "El horario de Check Out esta dividio en extractos de 30 minutos!\n"
        + "\n");
        for (int X=0;X<6;X++)
        {
            JOptionPane.showMessageDialog(null,(X+1)+"- Horario de "+H_OUT[X]+" : "+E_OUT[X]);
        }
    }
}
