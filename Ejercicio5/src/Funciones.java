import java.util.Scanner;

public class Funciones 
{
	
	public static void pPedirMatriz(int matriz[][])
	{
		int i, j;
		Scanner entrada = new Scanner(System.in);
		
		for(i=0; i<matriz.length; i++)
		{
			for(j=0; j<matriz[i].length;j++)
			{
				System.out.println("Inserte el elemento(" + (i+1) + "," + (j+1) + "):");
				
				matriz[i][j] = entrada.nextInt();
			}
		}
	}
	
	
	public static void pMostrarMatriz(int matriz[][])
	{
		int i, j;
		
		for(i=0; i<matriz.length;i++)
		{
			for(j=0; j<matriz[i].length;j++)
			{
				System.out.printf("%d ", matriz[i][j]);
		
			}
			System.out.println();
		}
	}
	
	public static void pPedirMatriz(float matriz[][])
	{
		int i, j;
		Scanner entrada = new Scanner(System.in);
		
		for(i=0; i<matriz.length; i++)
		{
			for(j=0; j<matriz[i].length;j++)
			{
				System.out.println("Inserte el elemento(" + (i+1) + "," + (j+1) + "):");
				
				matriz[i][j] = entrada.nextFloat();
			}
		}
	}
	
	public static void pMostrarMatriz(float matriz[][])
	{
		int i, j;
		
		for(i=0; i<matriz.length;i++)
		{
			for(j=0; j<matriz[i].length;j++)
			{
				System.out.printf("%2f ", matriz[i][j]);
		
			}
			System.out.println();
		}
	}
	

}
