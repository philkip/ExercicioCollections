package controller;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import model.Aluno;

public class ControlAluno 
{
	ArrayList<Aluno> arAluno;
			
	public ControlAluno() 
	{
		arAluno = new ArrayList<>();
		
		adicionaAluno();
		stackAlunos();
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
	
	private ArrayList<Integer> sortArray(ArrayList<Integer> desordenados)
	{
		ArrayList<Integer> ordenado = new ArrayList(desordenados.size());
		
		int oMaior = 0;
		
		ArrayList<Integer> artmp = new ArrayList(desordenados);
		
		while(ordenado.size() < desordenados.size())
		{
			int aRemover = 0;
			
			for(int i = 0; i < artmp.size(); i++)
			{
				if(artmp.get(i) >= oMaior)
				{
					oMaior = artmp.get(i);
					aRemover = i;
				}
			}
			
			ordenado.add(oMaior);
			artmp.remove(aRemover);
		}
		return ordenado;
	}
}
