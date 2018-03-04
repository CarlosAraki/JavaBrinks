
public class Dado {
	protected String tciclo;
	protected String tbloqueio;
	protected String tpausa;
	protected String PresInj;
	protected String VelInj;
	
	public void setDados(String[] strdados) {
		this.tciclo = strdados[0];
		this.tbloqueio = strdados[1];
		this.tpausa = strdados[2];
		this.PresInj = strdados[3];
		this.VelInj = strdados[4];
	}

	public String toString() {
		return tciclo+"\n"+tbloqueio+"\n"+tpausa+"\n"+PresInj+"\n"+VelInj;
	}
}
