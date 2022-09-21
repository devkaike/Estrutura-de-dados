import java.util.Scanner;

public class TestaLista {
	private static Lista objLista[];
	public static Contato criaContato() {
		Scanner dado = new Scanner(System.in);
		long c;
		String n, e;
		System.out.print("CPF: ");
		c = dado.nextLong();
		System.out.print("NOME: ");
		n = dado.next();
		System.out.print("ENDEREÇO: ");
		e = dado.next();
		Contato aux = new Contato(n,e,c);
		return aux;
	}
	
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		int op;
		Contato aux = null;
		int i = 0;
		Contato contato= new Contato("","",0);
		System.out.print("Tamanho da lista: ");
		op = dado.nextInt();
		Lista f = new Lista();
		f.setMaxTam(op);
        do{
            System.out.println("Digite: ");
            System.out.println("< 1 > Adicionar um cliente na fila");
            System.out.println("< 2 > Retirar um cliente na fila");
            System.out.println("< 3 > finalizar");
            op = dado.nextInt();
            switch(op){
                case 1:
                	aux = criaContato();
                	f.InsereFinal(aux);
                	break;
                case 2:
                    System.out.print("Digite o CPF a ser retirado: ");
                    long aux1= dado.nextLong();
                    contato.setCpf(aux1);
                    aux = f.rertira(contato);
                    System.out.println(.getCpf());
                    break;
                case 3:
                    System.out.println("Encerrando...");
            }
        }while(op != 3);
	}
}
