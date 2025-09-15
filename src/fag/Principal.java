package fag;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
		
		double[] notas = new double[5];
		double soma =0;
		
		for(int i=0;i<notas.length;i++) {
			System.out.println("entre com a nota do aluno " + (i+1) + ":" );
			notas[i] = scanner.nextDouble();
			soma += notas[i];
			
			
			
			
		}
		
		double media = soma/notas.length;
		System.out.println(" a media das notas e: " + media);
		
		int acimadamedia =0;
		double maior = 0 ;
		double menor = 0 ;
		for(double nota : notas) {
			if(nota > media) {
				acimadamedia++;
			}
			
				if(nota > maior) {
					maior = nota;
				} else {
					if(nota<maior) {
						menor = nota;
					}
				}
				
			
			}
		System.out.println("a maior nota foi: " + maior);
		System.out.println("a menor nota foi: " + menor);
		System.out.println("acima da media" + acimadamedia);
			
			scanner.close();
		}
		

	



}       
  

    
  


	

