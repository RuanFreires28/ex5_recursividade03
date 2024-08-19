package controller;

public class Controller5 
{

	public Controller5()
	{
		super();
	}
	
	public int Fibo (int[] vet, int n, int cont)
	{
		
		if (cont == n)
		{
			return vet[n-1];
		}
		else
		{
			
			if (cont <= 1)
			{
				vet [cont] = 1; 
			}
			else
			{	
				vet [cont] = vet [cont - 2] + vet [cont - 1];
			}
			
			return 	Fibo (vet, n, (cont + 1));
	
		}
	}
}
