
public class ItemCompra {
	private String descricao;
	private int qde;
	private double preco;
	
	
	public String getItemCompra() {
		return "ItemCompra [descricao=" + descricao + ", qde=" + qde + ", preco=" + preco + "]";
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean setQde(int qde) {
		if(qde >= 0) {
			this.qde = qde;
			return true;
		}else {
			return false;
		}
		
	}
	public boolean setPreco(double preco) {
		if(preco >= 0) {
			this.preco = preco;
			return true;
		}else {
			return false;
		}
	}
	
}
