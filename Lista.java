public class Lista {
	private int ultimo, maxTam;
	private Contato vetor[];

	public int getMaxTam() {
		return maxTam;
	}
	public boolean setMaxTam(int maxTam) {
		if(maxTam < 2) return false;
		else{
			maxTam = maxTam;
			return true;
		}
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

	public Contato rertira(Contato x) {
		if(ListaVazia()) return null;
		long aux = x.getCpf();
		long a=0;
		String b="",c="";
		Contato xxxx = new Contato(b,c,a);
		int k=maxTam, i;
		for(i = 0; i < maxTam; i++) {
			if(aux == vetor[i].getCpf()) {
				xxxx = vetor[i];
				vetor[i] = null;
				k = i;
				break;
			}
		}
		if(i == maxTam) return null;
		for(i = k+1; i<maxTam;i++) {
			vetor[i -1] = vetor[i];
		}
		maxTam--;
		return xxxx;
	}
}	