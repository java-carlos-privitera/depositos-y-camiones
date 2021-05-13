package app;

import java.util.Scanner;

/**
Leer la consigna: escribir un algoritmo que permita almacenar las cargas transportadas por camiones en el depósito más adecuado.

Una empresa tiene tres depósitos: uno grande de 30 toneladas, uno mediano de 20 toneladas y uno chico de 15 toneladas. 
Sus camiones soportan distintas capacidades en toneladas y no siempre están cargados totalmente. 
Cada vez que llega un camión hay que pesarlo y dirigirlo al depósito adecuado. 
La balanza tiene un límite de 30 toneladas, es el tope máximo de carga permitido.

 Si un depósito recibió una carga debe cerrarse.
 Informar la carga ociosa de los depósitos.

*/
public class Sistema {
    public Sistema() {
        super();
    }
  
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        
        Scanner entradaTeclado = new Scanner(System.in);
        
        int nDepositos = 3;
        
        Integer depositos[] = new Integer[nDepositos];
        
        depositos[0] = new Integer(30);
        depositos[1] = new Integer(20);
        
        depositos[2] = 15;  //funciona?
        
        Integer entrada = null;
        
        try {
            
          System.out.print("Entrar la carga en toneladas => ");
          entrada = entradaTeclado.nextInt();
          if(entrada.compareTo(31) < 0) { 
              //if(entrada.intValue() <= 30){ }
             
            int xDeposito = xDepositoSeleccionado(depositos, entrada);
            
            System.out.println("El depósito quedó con una capacidad ociosa de " + (depositos[xDeposito] - entrada));
            
            depositos[xDeposito] = 0; //Depósito cerrado
            
            if( xDeposito >= 0 ) {
              System.out.println("En el depósito " + xDeposito + " caben las " + entrada.intValue() + " toneladas");
            }else{
              System.out.println("No hay depósito para ese peso en toneladas  " + entrada.intValue());  
            }          
          }else{
            System.out.println("La entrada debe ser menor o igual a 30 ");
          }            
        }catch(Exception err) {
            System.out.println("Error: Se espera una entrada numérica");
        }
    }
    
    private static int xDepositoSeleccionado(Integer[] deposito, Integer entrada) {
        
            int xDeposito=-1; //depósito seleccionado 
            int min = 999;
            int xOciosa = 0;
            for(int i = 0; i < deposito.length; i++){
                xOciosa = deposito[i].intValue() - entrada.intValue();
                if((min > xOciosa) && (xOciosa >= 0)) {
                    min = xOciosa;
                    xDeposito = i;
                }
            }
            return xDeposito;
    }
}
