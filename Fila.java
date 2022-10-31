
public class Fila {
	public class No{
		private ItemCompra dados;
		private No proximo;
		
		public No(ItemCompra x) {
			dados = x;
			proximo = null;
		}
	}
	private No primeiro;
	private int qtd;
	
	public void inserirInicio(ItemCompra aux) {
		No x = new No(aux);
		x.proximo = primeiro;
		primeiro = x;
		qtd++;
	}
	
	/*public ItemCompra retira(ItemCompra teste) {
		if(vazia()) return null;
		for(int i = 0; i < qtd && teste.getDescricao() != )
		
	}*/
	public boolean vazia() {
		return primeiro == null;
	}
}
