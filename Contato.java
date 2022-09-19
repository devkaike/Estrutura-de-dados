
public class Contato {
	private String nome, endereco;
	private long cpf;
	
	public void contato(String n, String e, long c) {
		nome = n;
		endereco = e; 
		cpf = c;
	}
	public String getContato() {
		String ctt = nome +"  "+endereco+"  "+ String.valueOf(cpf);
		return ctt;
	}
}
