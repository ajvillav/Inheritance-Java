package test;

import domain.Client;
import domain.Employe;
import java.util.Date;

public class InheritanceTest {

    public static void main(String[] args) {
        Employe empleado1 = new Employe("Andy", 999999999.99);        
        System.out.println("empleado1 = " + empleado1);
        //Usamos el metodo de la clase persona con un objeto creado en Employe
        
        Client client1 = new Client("Andy", true);
        client1.setGenero('M');
        client1.setEdad(22);
        System.out.println("client1 = " + client1);
        
        Client client2 = new Client("Manela", true);
        System.out.println("client2 = " + client2);
        
        Client client3 = new Client(true, new Date(), "Andres", 'M', 22, "No Limits");
        System.out.println("client3 = " + client3);
        
    }
}
