package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Aluno;

public class ControlAluno 
{
	ArrayList arAluno;
		
	public ControlAluno() 
	{
		arAluno = new ArrayList<>();
		
		adicionaAluno();
		visualizarData();
	}
	
	public void adicionaAluno()
	{
		for(int i = 0; i < 5; i++)
		{
			int numAluno = i + 1;
			
			System.out.println("Introduza os dados do Aluno#" + numAluno + ": ");
			System.out.println("Nome: ");
			String nome = (new Scanner(System.in)).nextLine();
			arAluno.add(nome);
			System.out.println("Nota: ");
			float nota = (new Scanner(System.in)).nextFloat();
			arAluno.add(nota);
			System.out.println("Contacto: ");
			int contacto = (new Scanner(System.in)).nextInt();
			arAluno.add(contacto);
		}
		
	}
	
	public void visualizarData()
	{
		for(int i = 0; i < arAluno.size(); i++)
		{
			System.out.println(arAluno.get(i));
		}
	}

}
