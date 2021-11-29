/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JOptionPane;


public class RegistroDeCliente 
{
    //Atributos - Objetos - Aca estan las variables que tendran un llamamiento en el main
    private String N_Cliente;//Atributo/Objeto para definir el nombre del cliente a registrar
    private int N_Identificacion;//Atributo/Objeto para definir la Identificacion del cliente
    private String Pais;//Atributo/Objeto para definir el pais de donde proviene el cliente
    private String Provincia;//Atributo/Objeto para definir la provincia de donde proviene el cliente
    private String Canton;//Atributo/Objeto para definir el canton de donde proviene el cliente
    private String Distrito;//Atributo/Objeto para definir el distrito de donde proviene el cliente
    private int Edad;//Atributo/Objeto para definir la edad del cliente
    private String Forma_Pago;//Atributo/Objeto para definir la forma de pago a utilizar en el registro
    private int N_Acompanantes;//Atributo/Objeto El numero de acompañantes total que traera el registro del cliente
    //Get and Set

    public String getN_Cliente() {
        return N_Cliente;
    }

    public void setN_Cliente(String N_Cliente) {
        this.N_Cliente = N_Cliente;
    }

    public int getN_Identificacion() {
        return N_Identificacion;
    }

    public void setN_Identificacion(int N_Identificacion) {
        this.N_Identificacion = N_Identificacion;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public String getCanton() {
        return Canton;
    }

    public void setCanton(String Canton) {
        this.Canton = Canton;
    }

    public String getDistrito() {
        return Distrito;
    }

    public void setDistrito(String Distrito) {
        this.Distrito = Distrito;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getForma_Pago() {
        return Forma_Pago;
    }

    public void setForma_Pago(String Forma_Pago) {
        this.Forma_Pago = Forma_Pago;
    }

    public int getN_Acompanantes() {
        return N_Acompanantes;
    }

    public void setN_Acompanantes(int N_Acompanantes) {
        this.N_Acompanantes = N_Acompanantes;
    }
    
   
    //Metodos
    public void RegistroCliente()//Mensaje para visualizar el Registro del cliente con todos los datos recopilados!
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
    
    public void DatosCliente()//Mensaje para visualizar los registros que habian anteriormente en el hotel
    {
        JOptionPane.showMessageDialog(null,"Se leeran datos ingresados anteriormente!");
    }
}
