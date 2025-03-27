package org.gerdoc.vista;

import org.gerdoc.model.Domicilio;
import org.gerdoc.model.Vivienda;

public class Menu
{
    public static void principal( )
    {
        System.out.println("WELCOME");
        System.out.println("PROGRAMA DE VIVIENDAS");
        System.out.println("SELECCIONA UNA OPCION");
        System.out.println("1.- ESTADO");
        System.out.println("2.- MUNICIPIO");
        System.out.println("3.- COLONIA");
        System.out.println("4.- Salir");
    }

    public static void principal2( )
    {
        System.out.println("WELCOME");
        System.out.println("t/ PROGRAMA DE VIVIENDAS");
        System.out.println("SELECCIONA UNA OPCION");
        System.out.println("1.- Consola");
        System.out.println("2.- Ventana");
        System.out.println("3.- Salir");
    }

    public static void opcionInvalida( )
    {
        System.out.println("La opción no es correcta");
    }

    public static void seleccionaOpcion( )
    {
        System.out.println("Dame una opción");
    }

    public static void errorDato( )
    {
        System.out.println("No es un dato valido");
    }


}