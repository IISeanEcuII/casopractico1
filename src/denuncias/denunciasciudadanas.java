package denuncias;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class denunciasciudadanas {

    ArrayList<persona> listapersonas;

    public static void main(String[] args) {
        int opcion;
        denunciasciudadanas denunciasciudadanas = new denunciasciudadanas();

        denunciasciudadanas.listapersonas = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("\nMenu");
            System.out.println("[1] REGISTRAR DENUNCIA");
            System.out.println("[2] BUSQUEDA DE DENUNCIA");
            System.out.println("[3] ELIMINAR DENUNCIA");
            System.out.println("[4] ORDENAR DENUNCIA");
            System.out.println("[5] LISTADO DE DENUNCIA");
            System.out.println("[6] SALIR\n");
            System.out.print("INGRESE OPCION");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    denunciasciudadanas.registrardenuncia();

                    break;
                case 2:
                    denunciasciudadanas.buscardenuncia();
                    break;
                case 3:
                    denunciasciudadanas.eliminardenuncia();
                    break;
                case 4:
                    denunciasciudadanas.ordenardenuncia();
                    break;
                case 5:
                    denunciasciudadanas.mostrardenuncia();
                    break;

                default:
                    throw new AssertionError();
            }
        } while (opcion != 6);
    }

    public void registrardenuncia() {
        String cedula, apellidos, nombre, sexo, denuncia;
        int edad;
        double peso;
        Scanner entrada = new Scanner(System.in);
        System.out.println("CEDULA:");
        cedula = entrada.next();
        System.out.println("NOMBRE: ");
        nombre = entrada.next();
        System.out.println("APELLIDOS");
        apellidos = entrada.next();
        System.out.println("SEXO: ");
        sexo = entrada.next();
        System.out.println("EDAD: ");
        edad = entrada.nextInt();
        System.out.println("PESO: ");
        peso = entrada.nextDouble();
        System.out.println("DENUNCIA");
        denuncia = entrada.next();

       persona persona = new persona(cedula,nombre,apellidos,sexo,edad,peso,denuncia);
       listapersonas.add(persona);

       
    }

    public void buscardenuncia() {
        String cedula;
        int indice;
        Scanner entrada = new Scanner(System.in);
        System.out.println("INTRODUSCA NUMERO DE CEDULA: ");
        cedula = entrada.next();

        persona persona = new persona(cedula);

        indice = listapersonas.indexOf(persona);

        if (indice != 1) {
            persona = listapersonas.get(indice);
            System.out.println(persona);

        } else {
            System.out.println("LA DENUNCIA NO SE ENCUENTRA");
        }

    }

    public void eliminardenuncia() {
        String cedula;

        int indice;

        Scanner entrada = new Scanner(System.in);
        System.out.println("INTRODUSCA LA DENUNCIA A ELIMINAR");
        cedula = entrada.next();

        persona persona = new persona(cedula);

        indice = listapersonas.lastIndexOf(persona);

        if (indice != 1) {
            persona = listapersonas.remove(indice);

            System.out.println("ELIMINAR REGISTRO: " + persona);
        } else {
            System.out.println("LA DENUNCIA NO SE ENCUENTRA");

        }

    }

    public void mostrardenuncia() {
        if (listapersonas.size() > 0) {
            for (persona persona : listapersonas) {
                System.out.println(persona);
            }
        } else {
            System.out.println("NO SE ENCUENTRA LA DENUNCIA");
        }
    }

    public void ordenardenuncia() {

        Collections.sort(listapersonas, (persona persona1, persona persona2)
        -> persona1.getApellido().compareTo(persona2.getApellido()));
        mostrardenuncia();

    }

}
