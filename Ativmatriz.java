package fami41;

import java.util.Scanner;

public class Ativmatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]valor = new int[3][3];
		int x, y, qntMaior10=0;

		Scanner leia = new Scanner(System.in);

		for(x=0;x<3;x++)
		{
			for(y=0;y<3;y++)
			{
				System.out.println("\nInforme os valores da Matriz: ");
				valor[x][y]= leia.nextInt();
				if (valor[x][y]>10)
				{
					qntMaior10++;
				}
			}
		}


		System.out.println("A quantidade de numeros maiores que 10 é de: "+qntMaior10);
		}
	}
