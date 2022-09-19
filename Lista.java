
public class Lista {
	private int ultimo, maxTam;
	private Contato vetor[];
	
	public int getMaxTam() {
		return maxTam;
	}
	public boolean setMaxTam(int maxTam) {
		if(maxTam < 2) return false;
		else return true;
	}
	
	public void Lista(){
		this.maxTam = 1;
		this.ultimo = 0;
	}
	
	public boolean ListaVazia() {
		if(ultimo != 0) return false;
		else return true;
	}
	
	public boolean ListaCheia() {
		if(ultimo == maxTam) return true;
		else return false;
	}
	
	public boolean InsereFinal(Contato aux) {
		if(ListaCheia()) return false;
		else {
			vetor[ultimo] = aux;
			ultimo++;
			return true;
		}
	}
	
	public Contato rertira() {
		
	}
	
}
