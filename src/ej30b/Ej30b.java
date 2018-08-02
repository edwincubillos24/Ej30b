/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej30b;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author edwin
 */
public class Ej30b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int contador = 0;
        ArrayList<String> nombre = new ArrayList<String>();
        ArrayList<String> telefono = new ArrayList<String>();
        ArrayList<String> celular = new ArrayList<String>();
        ArrayList<String> nacim = new ArrayList<String>();
        //String[] nombre = new String[15];
        //   String[] telefono = new String[15];
        //  String[] celular = new String[15];
        //   String[] nacim = new String[15];
        String name;
        int opcion;
        boolean encontrado = false;

        do {
            System.out.println("AGENDA\n"
                    + "1. Agregar Contacto\n"
                    + "2. Buscar Contacto\n"
                    + "3. Ver Contactos\n"
                    + "4. Eliminar Contacto\n"
                    + "5. Salir\n"
                    + "Digite una opcion");
            opcion = lector.nextInt();

            switch (opcion) {
                case 1: //Agregar
                    System.out.println("Digite nombre: ");
                    nombre.add(lector.next());
                    //    nombre[contador] = lector.next();
                    System.out.println("Digite telefono: ");
                    telefono.add(lector.next());
                    //    telefono[contador] = lector.next();                    
                    System.out.println("Digite celular: ");
                    celular.add(lector.next());
                    //celular[contador] = lector.next();
                    System.out.println("Digite fecha de nacimiento: ");
                    nacim.add(lector.next());
                    //nacim[contador] = lector.next();
                    // contador++;
                    System.out.println("\nContacto Agregado Exitosamente!\n");
                    break;
                case 2: //Buscar
                    System.out.println("\nDigite nombre a buscar: ");
                    name = lector.next();
                    for (int i = 0; i < nombre.size(); i++) {
                        if (nombre.get(i).equals(name)) {
                            System.out.println("Nombre: " + nombre.get(i));
                            System.out.println("Telefono: " + telefono.get(i));
                            System.out.println("Celular: " + celular.get(i));
                            System.out.println("Fecha de nacimiento: " + nacim.get(i) + "\n");
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("\nContacto no encontrado\n");
                        encontrado = false;
                    }
                    break;
                case 3: //Ver
                    for (int i = 0; i < nombre.size(); i++) {
                        System.out.println("\nContacto " + i + "\n");
                        System.out.println("Nombre: " + nombre.get(i));
                        System.out.println("Telefono: " + telefono.get(i));
                        System.out.println("Celular: " + celular.get(i));
                        System.out.println("Fecha de nacimiento: " + nacim.get(i) + "\n");
                    }
                    break;
                case 4: //Eliminar
                    System.out.println("\nDigite nombre a buscar: ");
                    name = lector.next();
                    for (int i = 0; i < nombre.size(); i++) {
                        if (nombre.get(i).equals(name)) {
                            nombre.remove(i);
                            telefono.remove(i);
                            celular.remove(i);
                            nacim.remove(i);                        
                            encontrado = true;
                        }
                    }
                    if (encontrado) {
                        System.out.println("\nContato eliminado");
                        encontrado = false;
                    } else {
                        System.out.println("\nContato no encontrado");
                    }
                    break;
                case 5: //Salir
                    System.out.println("\nHasta luego\n");
                    break;
                default:
                    System.out.println("\nERROR: Opcion invalida\n");
                    break;
            }
        } while (opcion != 5);
    }
}
