
package cuentas_clase7;

import java.util.Scanner;


public class Cuentas_clase7 {

  
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta ("cuenta1 ", 0);
        Cuenta cuenta2 = new Cuenta ("cuenta2 ", 0); 
        
        Scanner sp = new Scanner (System.in); 
        int opcion;
        
        do{        
        
        System.out.println("======================");
        System.out.println("      BIENVENIDO      ");
        System.out.println("1. Mostrar Saldos:    ");
        System.out.println("2. Abonar  Saldo:     ");
        System.out.println("3. Debitar Saldo:     ");
        System.out.println("0. Salida             ");
        System.out.println(" Ingrese una opción   ");
        System.out.println("======================");
        
        opcion = sp.nextInt(); 
        
        if (opcion==1){
            System.out.println("Saldo " +cuenta1.getNombre()+": "+cuenta1.getSaldo());
            System.out.println("Saldo " +cuenta2.getNombre()+": "+cuenta2.getSaldo());
        }
        
        if (opcion==2){
            
        System.out.println("======================");
        System.out.println("1. Abonar a cuenta 1: ");
        System.out.println("2. Abonar a cuenta 2: ");
        System.out.println("  Ingrese una opcion  ");
        System.out.println("======================");
        
        int opcionabono = sp.nextInt();
        
        if (opcionabono==1){
            System.out.println("Ingrese saldo a abonar a cuenta 1");
            double saldocuenta1 = sp.nextDouble();
            saldocuenta1=saldocuenta1+cuenta1.getSaldo();
            cuenta1.setSaldo(saldocuenta1);
            
        }
        
        if (opcionabono==2){
            System.out.println("Ingrese saldo a abonar a cuenta 2");
            double saldocuenta2 = sp.nextDouble();
            saldocuenta2=saldocuenta2+cuenta2.getSaldo();
            cuenta2.setSaldo(saldocuenta2);
         
        }
        
        }
        
        if (opcion==3){
            
        System.out.println("=======================");
        System.out.println("1. Debitar a cuenta 1: ");
        System.out.println("2. Debitar a cuenta 2: ");
        System.out.println("   Ingrese una opcion  ");
        System.out.println("=======================");
        
        int opciondebito = sp.nextInt();
        
            if (opciondebito==1){
            System.out.println("Ingrese saldo a debitar a cuenta 1");
            double saldocuenta1 = sp.nextDouble();
            saldocuenta1=cuenta1.getSaldo()-saldocuenta1;
            cuenta1.setSaldo(saldocuenta1);
            
        }
        
            if (opciondebito==2){
            System.out.println("Ingrese saldo a debitar a cuenta 2");
            double saldocuenta2 = sp.nextDouble();
            saldocuenta2=cuenta2.getSaldo()-saldocuenta2;
            cuenta2.setSaldo(saldocuenta2);
         
        }
            
        }
        
        
        }while(opcion!=0);


    }
    
}
