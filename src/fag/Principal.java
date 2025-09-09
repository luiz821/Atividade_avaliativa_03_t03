package fag;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        double n1 =0, n2 =0 ,n3 =0;
        for(int i=1;i<=3;i++){
          Scanner ler=new Scanner(System.in);
          System.out.println("digite o nome do aluno");
          String nome = ler.nextline();
          System.out.println("Informe a primeira nota do aluno");
          n1 = ler.nextDouble();
          System.out.println("informe a segunda nota do aluno");
          n2 = ler.nextDouble();
          System.out.println("informe a terceira nota do aluno");
          n3 = ler.nextDouble();
          double mediad = media(n1,n2,n3);
          aprovacao(mediad);




        }
    
     
     }
 }
    public static double media(double n1,double n2, double n3){
      double media = (n1+n2+n3)/3;
      System.out.println("Sua media foi:"+media);
      return media;
    }
  }


  public static void aprovacao(double mediad){
    if(mediad>=7){
          System.out.println("Aprovado");

    } else{
      System.out.println("Reprovado");
    }
  }
}
    
  


	

