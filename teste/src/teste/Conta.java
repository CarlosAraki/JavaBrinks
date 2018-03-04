package teste;

class Conta{
	private static int quantidadeContas;
	private String cpf;
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private Data data = new Data();
	Conta(String nome,String cpf){
		this.setNome(nome);
		this.setCriaCPF(cpf);
		Conta.quantidadeContas++; 
	}
	public static int getQuantidadeContas(){
		return Conta.quantidadeContas;
	}
	private void setCriaCPF(String cpf){
		this.cpf = cpf;
	}
	private void setNome(String nome){
		this.titular = nome;
	}
	public String getCPF(){
		return this.cpf;
	}
	public String getNome(){
		return this.titular;
	}
	public void setNumeroAgenciaSaldo(int numero,String agencia,double saldo){
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	public void setData(int dia,int mes,int ano){
		this.data.setData(dia,mes,ano); 
	}
	public boolean setSaca(int quantidade){
		if(this.saldo < quantidade){
			return false;
		}
		else{
			this.saldo-=quantidade;
			return true;
		}
	}
	public void setDeposita(int quantidade){
		this.saldo+=quantidade;
	}
	public boolean setTranferencia(Conta recebe,int quantidade){
		if (this.saldo < quantidade) {
			return false;
		}
		else{
			recebe.saldo += quantidade;
			this.saldo -= quantidade;
			return true;
		}
	}
	public String getRecuperandoDados(){
		String dados = this.getNome()+"\n"+this.getCPF()+"\n"+this.numero +"\n"+this.agencia+"\n"+this.saldo+"\n"+this.data.getDataFormatada()+"\n";
		return dados;
	}
}