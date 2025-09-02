/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package raymundoquintanilla_01092025;

/**
 *
 * @author UFG
 */

import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        matriz();
    }
    
    public static void matriz(){
     //se instancia el scanner para lectura de teclado   
     Scanner scanner = new Scanner(System.in);
     //se instancia la matriz de tipo integer
     int[][] matriz = new int[3][3];
        int suma = 0;//variable oara suma de valores digitados
        int total_elementos = 0;//contador de elementos de la matriz
        double promedio = 0d;//calculo del promedio de edades digitadas
        
        //salida al usuario para indicar que debe ingresar datos
        System.out.println("INgrese los valores para una matriz 3 x 3");
        
        //se recorre primero las filas con una estructura de contral iterativa
        //de tipo for
        for (int i = 0; i<matriz.length; i++){
            
            
            //en cada iteracion se debera obtener la cantidad de elementos
            //que existe en el arreglo (cantidad de columnas)
            total_elementos +=matriz[i].length;
            
            ////se recorre las columnas de la matriz con una estructura de control 
            //iterativa de tipo for
            //debido a que debemos obtener el valor de cada celda (fila y columna)
            for (int j = 0; j < matriz[i].length; j++){
                
                //se vuelve un array-----
                //se imprime la peticion al usuario para el ingreso de datos
              System.out.println("Elemento [" +i+ " ][" +j+ "]");
              
              //se hace lectura de teclado 
              matriz[i][j] = scanner.nextInt();
              
                
            }//se cierra el for para obtener columnas
        }//cuerre del for para obtener filas
        
        
        //salida de valores para el usuario
        System.out.println("matriz ingresada: ");
        
        //se recorren las filas de la matriz
        for(int x = 0; x < matriz.length; x++){
            
            //se recorren las columnas de la matriz
            for(int y=0; y < matriz[x].length; y++){
                
                //se vuelve un array----
                //se imprime el valor de cada celda de la matriz (fila, columna)
                //fila: x columna:y
                System.out.print(matriz[x][y]+" ");
                
                
                //se suman los valores digitados de cada celda
                suma += matriz[x][y];
            }
            //se imprime un salto de linea
            System.out.println();
        }
        
        //calculo de los valores
        promedio = suma/total_elementos;
        System.out.println(suma+"es la sumatoria total de elementos, la cantidad de elementos digitados es de : "+total_elementos);
        System.out.println("El promedio de edad es: "+promedio);
        
        
        //se cierra el uso de la clase Scanner
        scanner.close();
    }
    
    
    
    
    
    
    
}
