/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JOptionPane;
public class Salir 
{
    //Atributos - Objetos - Aca estan las variables que tendran un llamamiento en el main
    private int S_alida=1;
    //Constructor vacio
    public Salir()
    {
       
    }
    //Get and Set

    public int getS_alida() {
        return S_alida;
    }

    public void setS_alida(int S_alida) {
        this.S_alida = S_alida;
    }
    
    //Metodos
    public void Salida()//Mensaje para visualizar que la salida del codigo fue exitosa!
    {
        JOptionPane.showMessageDialog(null,"Ha salido del sistema..!");
    }
    public void NoSalir()//Mensaje para visualizar Las personas atendidas en todos los horarios!
    {
        JOptionPane.showMessageDialog(null,"Se le redirigira al sistema otravez!\n"
                + "Procesando...");
    }
}
