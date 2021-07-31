
import java.util.Arrays;
import java.util.Scanner;


public class Main {	
	


public static void main(String[] args) {
    // TODO Auto-generated method stub

	Scanner s = new Scanner(System.in);
	
	int nextnome = 10;
	int nextproduto = 10;
	int quantidadeproduto ;
	
	//Variaveis que guardam numeros inteiros para a execuçao do codigo
	int choice;//escolhe opção do menu
	int qc;//Guarda quantidade de clientes
	int ad;//int que decide se vai alterar os dados ou não
	int qpc;//quantidade produtos cadastrados
	int parada1 = 1;//Variavel que para o loop do case 5 apos uma execuçao
	
	//Strings do tipo array
	String nome[] = new String[50];
	String endereco[] = new String[50];
	int telefone[] = new int[50];
	String nomeproduto[] = new String[50];
	String descricaoproduto[] = new String[50];
	
	//Inteiros do tipo array
	int valorcompra[] = new int[50];
	int porcentagemlucro[] = new int[50];
	int quantidadeestoque[] = new int[50];
	int quantidadecomprada[] = new int[50];
	
	//strings
	String clientecadastrado;
	String produtocadastrado;
	String ec;//escolha cliente
	String ep;//escolha prdouto
	
	//Pré carregados para o teste
	
	nome [0] = "Junior";
	nome [1] = "Maria";
	nome [2] = "Roberto";
	nome [3] = "Gustavo";
	nome [4] = "Marcio";
	nome [5] = "Joao";
	nome [6] = "Marcelo";
	nome [7] = "Maycon";
	nome [8] = "Vinicius";
	nome [9] = "Carol";
	
	endereco [15] = "Quadra 13 conjunto 15 casa 16 Gama DF";
	endereco [16] = "Quadra 10 conjunto 10 casa 12 Gama DF";
	endereco [17] = "Quadra 13 conjunto 15 casa 16 Gama DF";
	endereco [18] = "Quadra 13 conjunto 15 casa 16 Gama DF";
	endereco [19] = "Quadra 13 conjunto 15 casa 16 Gama DF";
	endereco [20] = "Quadra 13 conjunto 15 casa 16 Gama DF";
	endereco [21] = "Quadra 13 conjunto 15 casa 16 Gama DF";
	endereco [22] = "Quadra 13 conjunto 15 casa 16 Gama DF";
	endereco [23] = "Quadra 13 conjunto 15 casa 16 Gama DF";
	endereco [24] = "Quadra 13 conjunto 15 casa 16 Gama DF";
	
	telefone [15] = 44821456;
	telefone [16] = 44156791;
	telefone [17] = 11569834;
	telefone [18] = 77091462;
	telefone [19] = 56712453;
	telefone [20] = 19237512;
	telefone [21] = 15712543;
	telefone [22] = 14627093;
	telefone [23] = 15837426;
	telefone [24] = 81297603;
	
	
	nomeproduto [0] = "mouse";
	nomeproduto [1] = "Teclado";
	nomeproduto [2] = "Controle";
	nomeproduto [3] = "Monitor";
	nomeproduto [4] = "Fone";
	nomeproduto [5] = "Notebook";
	nomeproduto [6] = "Computador";
	nomeproduto [7] = "Mousepad";
	nomeproduto [8] = "Camera";
	nomeproduto [9] = "Drone";
	
	//loop do menu
    while(true){
    	System.out.print("Escolha um dos numeros abaixo\n"
    			+ "1.Cadastro de novo cliente.\n"
    			+ "2.Busca por cliente.\n"
    			+ "3.Cadastro de novo produto.\n"
    			+ "4.Busca por produto.\n"
    			+ "5.Cadastro de venda.\n"
    			+ "6.Mostrar produtos em estoque\n"
    			+ "7.Sair\n");
    	choice = s.nextInt();



    //seleciona as opçoes do menu
    switch(choice){
    
    case 1 :
    	System.out.print("Qual a quantidade de clientes a ser cadastrada?\n");
    	qc = s.nextInt();//qc guarda a quantidade de clientes
    	
    	for( int i = nextnome; i <(nextnome + qc); i++) {
    		
    		System.out.print("Nome do cliente\n");
    		
    		nome[i] = s.next();//guarda o nome do cliente
    		s.nextLine();
    		
    		System.out.print("endereço do cliente\n");
    		
    		endereco[i] = s.next();//guarda o endereço do cliente
    		s.nextLine();
    		
    		System.out.print("Telefone do cliente\n");
    		
    		telefone[i] = s.nextInt();//guarda o telefone do cliente
    		s.nextLine();
    		}
    	nextnome += qc;
    	break;
    case 2 :
    		System.out.println("Digite o cliente cadastrado");
    		clientecadastrado = s.next();
    		

    		for (int k =0;k<nextnome;k++) {
    			
    			
    			
    			if(clientecadastrado.equalsIgnoreCase(nome[k])) {
    				System.out.println("Nome: "+nome[k]);
    				System.out.println("Endereço: "+endereco[k]);
    				System.out.println("Telefone: "+telefone[k]);
    				
    				System.out.print("Gostaria de alterar os dados se sim digite 1 se não digite 2 ?");
    				ad = s.nextInt();
    				
    				if (ad == 1) {
    					for( int i = 1; i <= 1; i++) {
    			    		
    			    		System.out.print("Nome do cliente\n");
    			    		
    			    		nome[i] = s.next();
    			    		s.nextLine();
    			    		
    			    		System.out.print("endereço do cliente\n");
    			    		
    			    		endereco[i] = s.next();
    			    		s.nextLine();
    			    		
    			    		System.out.print("Telefone do cliente\n");
    			    		
    			    		telefone[i] = s.nextInt();
    			    		s.nextLine();
    			    		}}
    				if(ad == 2) {break;}
    				}
}break;
    case 3 :
    	System.out.print("Qual a quantidade de produtos a ser cadastrado?\n");
		qpc = s.nextInt();
		
		for(int i = nextproduto; i < nextproduto + qpc; i++) {

			System.out.print("Nome produto\n");
			nomeproduto[i] = s.next();
			s.nextLine();// limpa as informaçoes evitando que a string seja pulada.
			
			System.out.print("descrição do produto\n");
			descricaoproduto[i] = s.next();
			s.nextLine();
			
			System.out.print("valor de compra R$\n");
			valorcompra[i] = s.nextInt();
			s.nextLine();
			
			System.out.print("Qual a porcentagem de lucro % ?\n");
			porcentagemlucro[i] = s.nextInt();
			s.nextLine();

			
			System.out.print("Qual a quantidade em estoque do produto ?\n");
			quantidadeestoque[i] = s.nextInt();
			s.nextLine();
			
			
		}
		nextproduto += qpc;
		break;
		
    case 4 :
    	System.out.println("Digite o produto cadastrado");
		produtocadastrado = s.next();
		
		for (int k =0;k<nextproduto;k++) {
			if(produtocadastrado.equalsIgnoreCase(nomeproduto[k])) {
				System.out.println("Nome: "+nomeproduto[k]);
				System.out.println("descrição: "+descricaoproduto[k]);
				System.out.println("Valor de compra: "+valorcompra[k]);
				System.out.println("Porcentagem de lucro: "+porcentagemlucro[k]);
				System.out.println("Quantidade em estoque: "+quantidadeestoque[k]);
				
				System.out.print("Gostaria de alterar os dados se sim digite 1 se não digite 2 ?");
				ad = s.nextInt();
				
				if (ad == 1) {
					for( int i = 1; i <= 1; i++) {
			    		
						System.out.print("Nome produto\n");
						nomeproduto[i] = s.next();
						s.nextLine();
						
						System.out.print("descrição do produto\n");
						descricaoproduto[i] = s.next();
						s.nextLine();
						
						System.out.print("valor de compra R$\n");
						valorcompra[i] = s.nextInt();
						s.nextLine();
						
						System.out.print("Qual a porcentagem de lucro % ?\n");
						porcentagemlucro[i] = s.nextInt();
						s.nextLine();

						
						System.out.print("Qual a quantidade em estoque do produto ?\n");
						quantidadeestoque[i] = s.nextInt();
						s.nextLine();
						break;}
					
					}if (ad == 2) {break;}
					}}
	break;	
	case 5 :
		//Imprime os nomes dos clientes retirando o print das posiçoes nulas "null"

		while(true){for(int i = 1; i < nextproduto; i++) {
			
			System.out.println(nome[i]);}
		
		for(int i=0;i<nome.length;i++)
		{	
		   if (nome[i]!=null) {
		     System.out.println(nome[i]);
		     
		   }
		}      
		
	System.out.println("Escolha um dos clientes");
	ec = s.next();
	s.nextLine();


	
	for(int i=0;i<nomeproduto.length;i++)
	{	
	   if (nomeproduto[i]!=null) {
	     System.out.println(nomeproduto[i]);
	     
	   }
	}      

	System.out.println("Escolha um dos produtos");
	ep = s.next();
	s.nextLine();
	
	
	
	for(int i = 1; i < nextproduto; i++) {
		if(ep.equalsIgnoreCase(nomeproduto[i])) {
			System.out.println("Qual a quantidade desejada para compra?");
			quantidadeproduto = s.nextInt();
			
			quantidadeestoque[i] -= quantidadeproduto;
	
		}
		}
	System.out.println("Digite 1 para ficar e 2 para voltar ao menu");
	 ad = s.nextInt();
	 
	 if(ad == 1) {}
	 if(ad==2) {break;}
		}break;

    case 6 :
    	for(int i=0;i<nomeproduto.length;i++)
        {	
    		if (nomeproduto[i]!=null) {
            
    		System.out.println(nomeproduto[i]);
            System.out.println("Quantidade em estoque: "+quantidadeestoque[i]);}

        }break;
    case 7 :  
    	System. exit(0);//Encerra o codigo
}
}    
}
}