/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p1_carlosochoa;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Carlos Antonio
 */
public class Lab6P1_CarlosOchoa {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        // TODO code application logic here

        String opcionMenu = "";

        while (!opcionMenu.equals("4")) {
            System.out.println("");
            System.out.println("====Menu====");
            System.out.println("1.Drunk Dazed");
            System.out.println("2.SubArrays Manual");
            System.out.println("3.Busqueda Lineal");
            System.out.println("4.Salir");
            System.out.print("Ingrese una opcion: ");
            opcionMenu = scanner.nextLine();

            while (opcionMenu.equals("")) {
                System.out.print("No puede ingresar una opcion vacia, Ingrese una opcion: ");
                opcionMenu = scanner.nextLine();
            }
            switch (opcionMenu) {

                case "1":
                    DrunkDazed();
                    break;

                case "2":
                    subArraysManual();

                    break;

                case "3":
                    busquedaLineal();

                    break;

                case "4":
                    System.out.println("Saliendo del programa... :v");
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }

            System.out.println("");
        }
    }//fin del main 

    public static void DrunkDazed() {

        int tamanoCamino = 11;
        char[] caminoPeaton = new char[tamanoCamino];

        int posPeaton = tamanoCamino / 2;
        int cantidadPasos = 0;
        String extremoSalida = "";

        for (int i = 0; i < tamanoCamino; i++) {
            caminoPeaton[i] = '_';
        }
        caminoPeaton[posPeaton] = 'x';
        while (posPeaton >= 0 && posPeaton < tamanoCamino) {
            int direccionPaso = random.nextInt(2);

            if (direccionPaso == 0) {
                posPeaton--;
            } else {
                posPeaton++;
            }
            cantidadPasos++;

            if (posPeaton >= 0 && posPeaton < tamanoCamino) {
                caminoPeaton[posPeaton] = 'x';
            }

        }
        if (posPeaton < 0) {
            extremoSalida = "izquierda";
        } else {
            extremoSalida = "derecha";
        }

        System.out.println("");
        System.out.println("Camino Final:");

        imprimirArregloCaracteres(caminoPeaton);
        System.out.println("");

        System.out.println("El peaton salio por el extremo: " + extremoSalida);
        System.out.println("Cantidad total de pasos: " + cantidadPasos);

    }

    public static void subArraysManual() {
        int tamanoArregloOriginal = 20;
        int[] arregloOriginal = new int[tamanoArregloOriginal];

        for (int i = 0; i < tamanoArregloOriginal; i++) {
            arregloOriginal[i] = random.nextInt(50) + 1;
        }

        System.out.println("");
        System.out.println("Arreglo Original:");
        imprimirArregloEnteros(arregloOriginal);

        System.out.println("Ingrese el indice desde: ");
        int indiceDesde = scanner.nextInt();

        System.out.println("Ingrese el indice hasta: ");
        int indiceHasta = scanner.nextInt();

        int[] subArregloGenerado = generarSubArreglo(arregloOriginal, indiceDesde, indiceHasta);

        System.out.println("");
        System.out.println("SubArreglo generado:");
        imprimirArregloEnteros(subArregloGenerado);

    }

    public static int[] generarSubArreglo(int[] arregloOriginal, int indiceDesde, int indiceHasta) {

        int tamanioSubArreglo = indiceHasta - indiceDesde;
        int[] subArreglo = new int[tamanioSubArreglo];

        int contadorSubArreglo = 0;

        for (int i = indiceDesde; i < indiceHasta; i++) {
            subArreglo[contadorSubArreglo] = arregloOriginal[i];
            contadorSubArreglo++;
        }

        return subArreglo;
    }

    public static void busquedaLineal() {
        int tamanoArreglo = 10;
        int[] arregloGenerado = new int[tamanoArreglo];

        for (int i = 0; i < tamanoArreglo; i++) {
            arregloGenerado[i] = random.nextInt(50) + 1;
        }
        System.out.println("");
        System.out.println("Arreglo generado:");
        imprimirArregloEnteros(arregloGenerado);

        System.out.println("Ingrese un numero a buscar: ");
        int numeroBuscar = scanner.nextInt();
        scanner.nextLine();

        int primerPosicionEncontrada = -1;
        int cantidadApariciones = 0;

        for (int i = 0; i < tamanoArreglo; i++) {

            if (arregloGenerado[i] == numeroBuscar) {

                cantidadApariciones++;

                if (primerPosicionEncontrada == -1) {
                    primerPosicionEncontrada = i;
                }
            }
        }
        
        

    }

    public static void imprimirArregloCaracteres(char[] arregloCaracteres) {
        for (int i = 0; i < arregloCaracteres.length; i++) {
            System.out.print("[" + arregloCaracteres[i] + "}");
        }
        System.out.print("");
    }

    public static void imprimirArregloEnteros(int[] arregloNumeros) {

        for (int i = 0; i < arregloNumeros.length; i++) {
            System.out.print("[" + arregloNumeros[i] + "] ");
        }

        System.out.println("");
    }
    // Joana acordate del 0.5 porfaaaaaaaa
}//fin de la clase
