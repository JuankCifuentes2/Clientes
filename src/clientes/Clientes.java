/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Clientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
         int a= 3;
            
            Scanner sc = new Scanner(System.in);
            int[] numCuenta = new int[a];
            String[] tipoCuenta = new String[a];
            String[] nombre = new String[a];
            int[]saldo  = new int[a];
            
            
            for (int i=0; i<numCuenta.length;i++){
                
                System.out.println("Ingresa el numero de cuenta"+ (i+1));
                numCuenta[i] = sc.nextInt();
                String saltoDeLinea = sc.nextLine();
                System.out.println("Ingresa el tipo de cuenta"+ (i+1));
                tipoCuenta[i] = sc.nextLine();
                System.out.println("Ingresa el nombre"+ (i+1));
                nombre[i] = sc.nextLine();
                System.out.println("Ingresa el saldo"+ (i+1));
                saldo[i] = sc.nextInt();
            }
                     
      
        saldos(nombre,saldo);
        totalcuentas(saldo);
        
    }
    
    
      //Ordenar el que mas dinero tiene
  public static void saldos (String[] nombre,int []saldo){
      
            for (int i=0; i<saldo.length;i++){
            
            for (int j=i+1;j<saldo.length;j++){
                if (saldo[i]>saldo[j]){
                    int aux = saldo[i];
                    saldo[i]=saldo[j];
                    saldo[j]=aux;
                    String aux2 = nombre[i];
                    nombre[i]=nombre[j];
                    nombre[j]=aux2;

                }   
                
                
        
                
            }   
        }

  System.out.println("El que mas dinero tiene es "+ nombre[(saldo.length)-1] + " y tiene " + saldo[(saldo.length)-1]);
  System.out.println("El que menos dinero tiene es "+ nombre[0] + " y tiene " + saldo[0]);
  
        }

  
public static void totalcuentas (int []saldo){
    
     int totalSaldo = 0;
    
    for (int i=0; i<saldo.length;i++){
    
        totalSaldo = totalSaldo  + saldo[i];
   
}
    
   System.out.println("El saldo total de cuentas es "+ totalSaldo); 
}
}
        
        
        
        // TODO code application logic here
    
    

