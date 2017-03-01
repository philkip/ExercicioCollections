package controller;

import java.util.ArrayList;
import java.util.Scanner;

public class ControlEx1 
{
	ArrayList arEx1;
	
	public ControlEx1()
	{
		arEx1 = new ArrayList <>();
		
		loadMockupData();
		visualizarData();
		AdicionaArray();
	}
	
	public void loadMockupData()
	{
		arEx1.add('b');
		arEx1.add(3);
		arEx1.add("Carruagens");
		arEx1.add(8.56f);
		arEx1.add("caixas de armazenamento");
		
		
	}
	
	public void visualizarData()
	{
		for(int i = 0; i < arEx1.size(); i++)
		{
			System.out.println(arEx1.get(i));
		}
	}
	
	public void AdicionaArray()
	{
		System.out.println("Introduza um valor: ");
		String userInput = (new Scanner(System.in)).nextLine();
		
		arEx1.add(userInput);
		
		for(int i = 0; i < arEx1.size(); i++)
		{
			System.out.println(arEx1.get(i));
		}
		
	}

}
