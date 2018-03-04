
public class Porta {
	protected boolean open;
	Porta(){
		open = true;
	}
	public void abrePorta() {
		this.open = true;
	}
	public void fechaPorta() {
		this.open = false;
	}
	public boolean estaAberta() {
		return this.open;
	}
}
