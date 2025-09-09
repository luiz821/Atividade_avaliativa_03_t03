package fag;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
	       int escolha = 0;
	       int i = 0;
	       double deposito;
	       double saldo = 0.0; 
	       double valdep; //valor depositado
	       double sacar =  0.0;
	       int senha = 1234;
	       int sair;
	      
	      while(i<3) {
	    	
	      System.out.println("qual sua senha?");
	      senha = scanner.nextInt();
	      if(senha==1234)
	      {
	    	i=4;  
	      }
	      else {
	      i++;
	      }
	      
	      if(i==3) {
	    	  System.out.println("tente novamente mais tarde");
	    	  return;
	      }
	      
	      }
	      
	      
	      
	       while(escolha<4) {
	       System.out.println("MENU");
	       System.out.println("1:DEPOSITAR");
	       System.out.println("2:CONSULTAR SALDO");
	       System.out.println("3:SACAR DINHEIRO");
	       System.out.println("4:SAIR");
	       System.out.println("Digite o numero que voce deseja ir:");
	       escolha = scanner.nextInt();
	   
	       
	       switch(escolha) {
		     case 1:
		         System.out.println("Digite o valor que deseja depositar: ");
		         valdep = scanner.nextDouble();
		         saldo = saldo + valdep;
		         System.out.printf("Seu saldo é R$ %.2f%n", saldo);
		         break;
		         
		     case 2:
		         System.out.printf("Seu saldo é R$ %.2f%n", saldo);
		         break;
		     case 3:
		         System.out.println("Digite o valor que deseja retirar: ");
		         sacar = scanner.nextDouble();
		         if (sacar > saldo) {
		             System.out.println("Seu saldo não é suficiente para esta retirada.\n");
		         } else {
		             saldo -= sacar;
		             System.out.printf("Seu saldo é R$ %.2f%n", saldo);
		         }
		         break;
		     case 4:
		         System.out.println("tchau.\n");
		         break;   
		   
		         
	       }
	       }
		}
	       
  }

    
  


	

