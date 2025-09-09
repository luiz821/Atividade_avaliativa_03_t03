package fag;

public class Principal {

	public static void main(String[] args) {
	
       Scanner scanner = new Scanner(System.in);
      System.out.println( "valor de a");
      long a = scanner.nextLong();
      scanner.nextLine();
      System.out.println( " Valor de b");
      long b = scanner.nextLong();
      scanner.nextLine();
      System.out.println( "selecione o operador");
      String operador = scanner.nextLine();
      
     if(operador.equals("+")){ 
         System.out.println("Seu resultado é "+(a+b));
    }
    
   else if (operador.equals("-")){
       System.out.println("Seu resultado é "+ (a-b));
   }
   
   else if (operador.equals("*")){
       System.out.println("Seu resultado é "+ (a*b));
   }
   
   else if(operador.equals("/")){
      System.out.println("Seu resultado é "+(a/b));
   }
   

    scanner.close();
     
     }
 }
 
    }
  
}

	}

}
