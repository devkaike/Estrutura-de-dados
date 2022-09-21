public class Contato {
	private String nome, endereco;
	private long cpf;

	public Contato(String nome, String endereço, long cpf) {
		nome = nome;
		this.endereco = endereço; 
		cpf = cpf;
	}
	public String getContato() {
		String ctt = nome +"  "+endereco+"  "+ String.valueOf(cpf);
		return ctt;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
}