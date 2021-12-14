package fami41;

import java.util.Scanner;

public class vetorpar {

	public static void main(String[] args) {
		
// TODO Auto-generated method stub
   int [] numero = new int [6];
   int  somapar = 0, somaimp=0, qtdpar=0 , qtdimp=0;
   int x;
   
   Scanner leia = new Scanner (System.in);
		   
	for (x=0; x<6; x++)
	{
		System.out.printf("\nEntre com o número: ");
        numero[x] = leia.nextInt();  
		
	if ( numero[x] % 2 == 0 )
	{
		somapar += numero [x];
		qtdpar++;
	}
	else
	{
		somaimp+=numero[x];
		qtdimp++;
	}
	
	}
	  
	
    for(x=0; x<5 ;x++)  
    {  
        if(numero[x] % 2 == 0)
        {
        	System.out.println("Os numeros pares são: "+numero[x]);
        }
        else 
        {
       
        System.out.println("Os numero impares são: " +numero[x]) ;  
        
        	
        }
        
    }
   
    System.out.println("\nA soma dos números pares é: "+somapar);
	System.out.println("\nA quatidade de números pares digitados é de:"+qtdpar); 
	System.out.println("\nA soma dos impares é: "+somaimp);
	System.out.println("\nA quantidade de impares é: "+qtdimp);
    
      
      
	}

}
