package view;

import javax.swing.JOptionPane;

import controller.Controller5;

public class Main5 
{

	public static void main(String[] args) 
	{
		Controller5 c = new Controller5();
		
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("DIGITE N: "));;
		
		
		while ( n > 20 || n < 0)
		{
			n = Integer.parseInt(JOptionPane.showInputDialog("DIGITE N: "));
		}
		
		
		int cont = 0;
		int [] vet = new int[n];
		
		int resultado = c.Fibo(vet, n, cont);
		
		System.out.println(n + " na serie fibonacci é: " + resultado);
		
		
	}
	
}
