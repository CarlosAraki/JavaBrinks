package teste;

public class Data{
	private int dia;
	private int mes;
	private int ano;
	public String getDataFormatada(){
		String formatada = dia+"/"+mes+"/"+ano;
		return formatada;
	}
	public void setData(int dia,int mes,int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
}