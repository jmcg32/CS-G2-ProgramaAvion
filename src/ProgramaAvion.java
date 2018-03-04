package programaavion;

import java.util.Scanner;

public class ProgramaAvion {
    
    static double vtiquetes(double c, double p){
     
        double V=0;
        
        if (c==1)V=p*500000;
        
        if (c==2)V=p*200000;
        
        if (c==3)V=p*125000;
        
        return V;
        
    }
       
    public static void main(String[] args) {
        
        
       double c1;
       double c2;
       double c3;
       double p1;
       double p2;
       double p3;
       
       Scanner Teclado= new Scanner (System.in);
        
       
       System.out.println("digite el número de clase: ");
       c1 = Teclado.nextFloat();
       System.out.println("No pasajeros: ");
       p1 = Teclado.nextFloat();
       
       double R1=vtiquetes(c1,p1);
       
       System.out.println("digite el número de clase: ");
       c2 = Teclado.nextFloat();
       System.out.println("No pasajeros: ");
       p2 = Teclado.nextFloat();
       
       double R2=vtiquetes(c2,p2);
       
       System.out.println("digite el número de clase: ");
       c3 = Teclado.nextFloat();
       System.out.println("No pasajeros: ");
       p3 = Teclado.nextFloat();
       
       double R3=vtiquetes(c3,p3);
       
       double R=R1+R2+R3;
       System.out.println("Valor total : " +R);
    }  

    
}
