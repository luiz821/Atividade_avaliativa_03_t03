package fag;

public class Principal {

	public static void main(String[] args) {
	
         
      Scanner scanner = new Scanner(System.in);
      System.out.print("Qual o seu nome? ");
      String nome = scanner.nextLine();
      System.out.print("Qual a sua idade? ");
      int idade = scanner.nextInt();
      scanner.nextLine();
      System.out.print("Qual o seu cpf? ");
      String cpf = scanner.nextLine();
       

      System.out.println("Olá " + nome + "!");
      System.out.println("Você tem " + idade + " anos");
      System.out.println("Seu cpf é " + cpf + "!");
      
      scanner.close();
 
    }
  
}

	}

}
