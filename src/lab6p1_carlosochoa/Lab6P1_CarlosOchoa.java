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

            System.out.println("Main Menu");
            System.out.println("1. Drunk Dazed");
            System.out.println("2. SubArrays Manual");
            System.out.println("3. Busqueda Lineal");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            opcionMenu = scanner.nextLine();

            while (opcionMenu.equals("")) {
                System.out.print("No puede ingresar una opcion vacia. Ingrese una opcion: ");
                opcionMenu = scanner.nextLine();
            }
            switch (opcionMenu) {

                case "1":
                    DrunkDazed();
                    break;

                case "2":
                    
                    break;

                case "3":
                    
                    break;

                case "4":
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
                    break;
            }

            System.out.println("");
        }
    }//fin del main 
    
    public static void DrunkDazed(){
        
        int tamanoCamino = 11;
        char [] caminoPeaton = new char [tamanoCamino];
        
        int posPeaton = tamanoCamino / 2;
        int cantidadPasos = 0;
        String extremoSalida = "";
        
        for(int i = 0; i < tamanoCamino; i++){
            caminoPeaton[i] = '_';
        }
        caminoPeaton[posPeaton] = 'x';
        while(posPeaton >= 0 && posPeaton < tamanoCamino){
            int direccionPaso = random.nextInt(2);
            
            if(direccionPaso == 0){
                posPeaton--;
            }else{
                posPeaton++;
            }
            cantidadPasos++;
            
            if(posPeaton >= 0 && posPeaton < tamanoCamino){
                caminoPeaton[posPeaton] = 'x';
            }
            
        }
        if(posPeaton < 0){
            extremoSalida = "izquierda";
        }else{
            extremoSalida = "derecha";
        }
        
        System.out.println("");
        System.out.println("Camino Final:");
        imprimirArregloCaracteres(caminoPeaton);
        
        System.out.println("El peaton salio por el extremo: " + extremoSalida);
        System.out.println("Cantidad total de pasos: " + cantidadPasos);
           
    }
    public static void imprimirArregloCaracteres(char[]arregloCaracteres){
        for(int i = 0; i < arregloCaracteres.length; i++){
            System.out.print("[" + arregloCaracteres[i] + "}");
        }
        System.out.print("");
    }
    
}//fin de la clase
