/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
U.Fidelitas
Introduccion a la Programacion.
Grupo#8
Programa: PROYECTO!
 */
package proyecto;

import javax.swing.JOptionPane;
public class PROYECTO {

    
    public static void main(String[] args) 
    {
        int Menu=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la opcion que desea ingresar:\n"
        +"HOTELES EL DESCANSO\n"
        +"===================\n"       
        +"1. Registro del hotel \n"
        +"2. Registro de cliente\n"
        +"3. Reservacion de hospedaje\n"
        +"4. Reservacion de restaurante\n"
        +"5. Horarios de check in y check out\n"
        +"6. Salir"));
        
        //Estructura Decision
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (Menu==1)// REGISTRO DEL HOTEL
        {
            RegistroDelHotel FIDE= new RegistroDelHotel();
            String resp = JOptionPane.showInputDialog("Desea agregar nuevos datos del hotel?");
            if ("si".equals(resp))
            {
                String N_Hotel = JOptionPane.showInputDialog("A que hotel se ingresara\n(Puntarenas, San Carlos o Guanacaste)..: ");
                int CTotal=Integer.parseInt(JOptionPane.showInputDialog(null,"La cantidad total de huespedes en el hotel..: "));
                int CHabi=Integer.parseInt(JOptionPane.showInputDialog(null,"La cantidad total de habitaciones en el hotel..: "));
                int Afor=Integer.parseInt(JOptionPane.showInputDialog(null,"El aforo aprobado de la temporada..: "));
                int HDis=Integer.parseInt(JOptionPane.showInputDialog(null,"La cantidad de habitaciones disponibles por dia..: "));
                FIDE.Hotel=N_Hotel;
                FIDE.C_Habitaciones=CHabi;
                FIDE.C_Total=CTotal;
                FIDE.Aforo=Afor;
                FIDE.H_Disponibles=HDis;
                FIDE.RegistroFinal();
            }
            else
            {
                FIDE.RegistroDatos();
            }              
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        else if (Menu==2)// REGISTRO DEL CLIENTE
        {
            RegistroDeCliente FIDE= new RegistroDeCliente();
            String resp2 = JOptionPane.showInputDialog("Desea registrar datos nuevos de cliente?");
            if ("si".equals(resp2))
            {
                String NCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente..: ");
                int Iden=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la identificacion del cliente..: "));
                String P_ais = JOptionPane.showInputDialog("Ingrese el pais del cliente..: ");
                String Provin = JOptionPane.showInputDialog("Provincia..: ");
                String C_anton = JOptionPane.showInputDialog("Canton..: ");
                String Dist = JOptionPane.showInputDialog("Distrito..: ");
                int E_dad=Integer.parseInt(JOptionPane.showInputDialog(null,"Edad del cliente..: "));
                int Acompa=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de Acompañantes..: "));
                String Pago = JOptionPane.showInputDialog("Forma de pago a utilizar\n(Efectivo - Transferencia - Tarjeta de credito)..: ");
                FIDE.N_Cliente=NCliente;
                FIDE.N_Identificacion=Iden;
                FIDE.Pais=P_ais;
                FIDE.Provincia=Provin;
                FIDE.Canton=C_anton;
                FIDE.Distrito=Dist;
                FIDE.Edad=E_dad;
                FIDE.Forma_Pago=Pago;
                FIDE.N_Acompanantes=Acompa;
                FIDE.RegistroCliente();
            }
            else
            {
                FIDE.DatosCliente();
            } 
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        else if (Menu==3)// RESERVACION DE HOSPEDAJE
        {
            ReservacionDeHospedaje FIDE= new ReservacionDeHospedaje();
            String resp3 = JOptionPane.showInputDialog("Desea cambiar las tarifas de fin y entre semana?");
            if ("si".equals(resp3))
            {
                int Tentre=Integer.parseInt(JOptionPane.showInputDialog(null,"Tarifa de entre semana por persona..: "));
                int Tfin=Integer.parseInt(JOptionPane.showInputDialog(null,"Tarifa de fin de semana por persona..: "));
                FIDE.T_Esemana=Tentre;
                FIDE.T_Fsemana=Tfin;
                String resp3_1 = JOptionPane.showInputDialog("Desea hacer una reservacion?");
                if ("si".equals(resp3_1))
                {
                    JOptionPane.showMessageDialog(null,"El sistema debe asignar la disponibilidad de habitaciones por dia!");
                    int Lunes=Integer.parseInt(JOptionPane.showInputDialog(null,"H. disponibles / Lunes..: "));
                    int Martes=Integer.parseInt(JOptionPane.showInputDialog(null,"H. disponibles / Martes..: "));
                    int Miercoles=Integer.parseInt(JOptionPane.showInputDialog(null,"H. disponibles / Miercoles..: "));
                    int Jueves=Integer.parseInt(JOptionPane.showInputDialog(null,"H. disponibles / Jueves..: "));
                    int Viernes=Integer.parseInt(JOptionPane.showInputDialog(null,"H. disponibles / Viernes..: "));
                    int Sabado=Integer.parseInt(JOptionPane.showInputDialog(null,"H. disponibles / Sabado..: "));
                    int Domingo=Integer.parseInt(JOptionPane.showInputDialog(null,"H. disponibles / Domingo..: "));
                    JOptionPane.showMessageDialog(null,"Datos almacenados, a continuacion se reanudara el registro de la reserva!");
                    int ClientesHospe=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de clientes que se hospedaran..: "));
                    int DiasHospe=Integer.parseInt(JOptionPane.showInputDialog(null,"Dias que reservaran los clientes..: "));
                    JOptionPane.showMessageDialog(null,"Elija y escriba el numero del dia que desea reservar!\n"
                                +"=====================================\n"
                                + "1 = Lunes \n"
                                + "2 = Martes \n"
                                + "3 = Miercoles \n"
                                + "4 = Jueves \n"
                                + "5 = Viernes \n"
                                + "6 = Sabado \n"
                                + "7 = Domingo");
                    int SumaMonto=0;
                    int SumaContador=0;
                    for (int i = 1; i <= DiasHospe; i++)
                    {
                        int DiasReser=Integer.parseInt(JOptionPane.showInputDialog(null,"Dia#"+i+"\n"
                                + "Ingrese el numero del dia:..: "));
                        if (DiasReser==1 || DiasReser==2 || DiasReser==3 || DiasReser==4 || DiasReser==5)
                        {
                            SumaContador=Tentre*ClientesHospe;
                            SumaMonto+=SumaContador;  
                        }
                        else if (DiasReser==6 || DiasReser==7)
                        {
                            SumaContador=Tfin*ClientesHospe;
                            SumaMonto+=SumaContador;
                        }
                    }
                    FIDE.Lune=Lunes;
                    FIDE.Marte=Martes;
                    FIDE.Miercole=Miercoles;
                    FIDE.Jueve=Jueves;
                    FIDE.Vierne=Viernes;
                    FIDE.Sabad=Sabado;
                    FIDE.Doming=Domingo;
                    FIDE.C_Hospe=ClientesHospe;
                    FIDE.D_Hospe=DiasHospe;
                    FIDE.Monto=SumaMonto;
                    int I_va=(int) (SumaMonto*0.13);
                    FIDE.Iva=I_va;
                    FIDE.M_Total=SumaMonto+I_va;
                    FIDE.Reservacion();
                }
                else
                {
                    FIDE.DatosTarifas();
                }
            }
            else
            {
                FIDE.DatosReservacion();
            }
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        else if (Menu==4)// RESERVACION DE RESTAURANTE
        {
            ReservacionDeRestaurante FIDE= new ReservacionDeRestaurante();
            String resp4 = JOptionPane.showInputDialog("Bienvenido a la reservacion de restaurante!\n"
                    + "Desea cambiar la cantidad de aforo del restaurante?");
            if ("si".equals(resp4))
            {
                int AforoRes=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad del aforo aprobado en el restaurante..: "));
                FIDE.R_Aforo=AforoRes;
                FIDE.AforoRestaurante();
                int DiasRes=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos dias reservara el cliente para el restaurante..: "));
                FIDE.R_Dias=DiasRes;
                int ClientesRes=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos clientes utilizaran el servicio del restaurante..: "));
                FIDE.R_Clientes=ClientesRes;
                JOptionPane.showMessageDialog(null,"Procesando...");
                String resp4_1 = JOptionPane.showInputDialog("Desea cambiar los espacios disponibles de los tiempos de comida?");
                if ("si".equals(resp4_1))
                {
                    JOptionPane.showMessageDialog(null,"Desayuno!");
                    int desa1=Integer.parseInt(JOptionPane.showInputDialog(null,"Espacios disponibles a las 7:00am..: "));
                    int desa2=Integer.parseInt(JOptionPane.showInputDialog(null,"Espacios disponibles a las 8:00am..: "));
                    int desa3=Integer.parseInt(JOptionPane.showInputDialog(null,"Espacios disponibles a las 9:00am..: "));
                    JOptionPane.showMessageDialog(null,"Almuerzo!");
                    int alm1=Integer.parseInt(JOptionPane.showInputDialog(null,"Espacios disponibles a las 12:00md..: "));
                    int alm2=Integer.parseInt(JOptionPane.showInputDialog(null,"Espacios disponibles a las 1:00pm..: "));
                    int alm3=Integer.parseInt(JOptionPane.showInputDialog(null,"Espacios disponibles a las 2:00pm..: "));
                    JOptionPane.showMessageDialog(null,"Cena!");
                    int cen1=Integer.parseInt(JOptionPane.showInputDialog(null,"Espacios disponibles a las 7:00pm..: "));
                    int cen2=Integer.parseInt(JOptionPane.showInputDialog(null,"Espacios disponibles a las 8:00pm..: "));
                    int cen3=Integer.parseInt(JOptionPane.showInputDialog(null,"Espacios disponibles a las 9:00pm..: "));
                    JOptionPane.showMessageDialog(null,"Los espacios disponibles se han almacenado correctamente, sigamos con la reserva!");
                    FIDE.E_Desa1=desa1;
                    FIDE.E_Desa2=desa2;
                    FIDE.E_Desa3=desa3;
                    FIDE.E_Alm1=alm1;
                    FIDE.E_Alm2=alm2;
                    FIDE.E_Alm3=alm3;
                    FIDE.E_Cen1=cen1;
                    FIDE.E_Cen2=cen2;
                    FIDE.E_Cen3=cen3;
                    FIDE.TiemposDisponibles();
                    for (int i = 1; i <= DiasRes; i++)
                    {
                        //ARCHIVOS TXT //LUEGO SE COLOCARA LA RESERVA DEL RESTAURANTE AL TENER LOS ARCHIVOS TXT
                        
                        int HDesa=Integer.parseInt(JOptionPane.showInputDialog(null,"Dia#"+i+"\n"
                                + "Seleccione la hora de desea desayunar (Ejemplo: 8)..: "));
                        int HAlm=Integer.parseInt(JOptionPane.showInputDialog(null,"Dia#"+i+"\n"
                                + "Seleccione la hora de desea almorzar (Ejemplo: 12)..: "));
                        int HCen=Integer.parseInt(JOptionPane.showInputDialog(null,"Dia#"+i+"\n"
                                + "Seleccione la hora de desea cenar (Ejemplo: 9)..: "));                       
                    }    
                }
                else
                {
                    FIDE.TiemposDisponibles();
                    for (int i = 1; i <= DiasRes; i++)
                    {
                        //ARCHIVOS TXT //LUEGO SE COLOCARA LA RESERVA DEL RESTAURANTE AL TENER LOS ARCHIVOS TXT
                        
                        int HDesa=Integer.parseInt(JOptionPane.showInputDialog(null,"Dia#"+i+"\n"
                                + "Seleccione la hora de desea desayunar (Ejemplo: 8)..: "));
                        int HAlm=Integer.parseInt(JOptionPane.showInputDialog(null,"Dia#"+i+"\n"
                                + "Seleccione la hora de desea almorzar (Ejemplo: 12)..: "));
                        int HCen=Integer.parseInt(JOptionPane.showInputDialog(null,"Dia#"+i+"\n"
                                + "Seleccione la hora de desea cenar (Ejemplo: 9)..: "));  
                    }
                }      
            }
            else
            {
                FIDE.AforoRestaurante();
                int DiasRes=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos dias reservara el cliente para el restaurante..: "));
                FIDE.R_Dias=DiasRes;
                int ClientesRes=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos clientes utilizaran el servicio del restaurante..: "));
                FIDE.R_Clientes=ClientesRes;
                JOptionPane.showMessageDialog(null,"Procesando...");
                String resp4_1 = JOptionPane.showInputDialog("Desea cambiar los espacios disponibles de los tiempos de comida?");
                if ("si".equals(resp4_1))
                {
                    JOptionPane.showMessageDialog(null,"Desayuno!");
                    int desa1=Integer.parseInt(JOptionPane.showInputDialog(null,"Espacios disponibles a las 7:00am..: "));
                    int desa2=Integer.parseInt(JOptionPane.showInputDialog(null,"Espacios disponibles a las 8:00am..: "));
                    int desa3=Integer.parseInt(JOptionPane.showInputDialog(null,"Espacios disponibles a las 9:00am..: "));
                    JOptionPane.showMessageDialog(null,"Almuerzo!");
                    int alm1=Integer.parseInt(JOptionPane.showInputDialog(null,"Espacios disponibles a las 12:00md..: "));
                    int alm2=Integer.parseInt(JOptionPane.showInputDialog(null,"Espacios disponibles a las 1:00pm..: "));
                    int alm3=Integer.parseInt(JOptionPane.showInputDialog(null,"Espacios disponibles a las 2:00pm..: "));
                    JOptionPane.showMessageDialog(null,"Cena!");
                    int cen1=Integer.parseInt(JOptionPane.showInputDialog(null,"Espacios disponibles a las 7:00pm..: "));
                    int cen2=Integer.parseInt(JOptionPane.showInputDialog(null,"Espacios disponibles a las 8:00pm..: "));
                    int cen3=Integer.parseInt(JOptionPane.showInputDialog(null,"Espacios disponibles a las 9:00pm..: "));
                    JOptionPane.showMessageDialog(null,"Los espacios disponibles se han almacenado correctamente, sigamos con la reserva!");
                    FIDE.E_Desa1=desa1;
                    FIDE.E_Desa2=desa2;
                    FIDE.E_Desa3=desa3;
                    FIDE.E_Alm1=alm1;
                    FIDE.E_Alm2=alm2;
                    FIDE.E_Alm3=alm3;
                    FIDE.E_Cen1=cen1;
                    FIDE.E_Cen2=cen2;
                    FIDE.E_Cen3=cen3;
                    FIDE.TiemposDisponibles();
                    for (int i = 1; i <= DiasRes; i++)
                    {
                        //ARCHIVOS TXT //LUEGO SE COLOCARA LA RESERVA DEL RESTAURANTE AL TENER LOS ARCHIVOS TXT
                        
                        int HDesa=Integer.parseInt(JOptionPane.showInputDialog(null,"Dia#"+i+"\n"
                                + "Seleccione la hora de desea desayunar (Ejemplo: 8)..: "));
                        int HAlm=Integer.parseInt(JOptionPane.showInputDialog(null,"Dia#"+i+"\n"
                                + "Seleccione la hora de desea almorzar (Ejemplo: 12)..: "));
                        int HCen=Integer.parseInt(JOptionPane.showInputDialog(null,"Dia#"+i+"\n"
                                + "Seleccione la hora de desea cenar (Ejemplo: 9)..: "));  
                    }    
                }
                else
                {
                    FIDE.TiemposDisponibles();
                    for (int i = 1; i <= DiasRes; i++)
                    {
                        //ARCHIVOS TXT //LUEGO SE COLOCARA LA RESERVA DEL RESTAURANTE AL TENER LOS ARCHIVOS TXT
                        
                        int HDesa=Integer.parseInt(JOptionPane.showInputDialog(null,"Dia#"+i+"\n"
                                + "Seleccione la hora de desea desayunar (Ejemplo: 8)..: "));
                        int HAlm=Integer.parseInt(JOptionPane.showInputDialog(null,"Dia#"+i+"\n"
                                + "Seleccione la hora de desea almorzar (Ejemplo: 12)..: "));
                        int HCen=Integer.parseInt(JOptionPane.showInputDialog(null,"Dia#"+i+"\n"
                                + "Seleccione la hora de desea cenar (Ejemplo: 9)..: "));  
                    }
                }    
            }
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        else if (Menu==5)// CHECK IN Y CHECK OUT
        {
            CheckIn_Out FIDE= new CheckIn_Out();
            String resp5 = JOptionPane.showInputDialog("Bienvenido a la asignacion de horarios de check in y check out!\n"
                    + "Desea cambiar la cantidad de personas que pueden hacer el check in y check out al mismo tiempo?");
            if ("si".equals(resp5))
            {
                
            }
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        else if (Menu==6)// SALIR O CONTINUAR!
        {
            
        }
    }
    
}