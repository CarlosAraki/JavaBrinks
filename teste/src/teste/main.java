package teste;

class exe1{
	public static void main(String[] args) {
		Conta c1 = new Conta("Carlos","7111111");
		Conta c2 = new Conta("Gabriel","333333");
		c1.setNumeroAgenciaSaldo(1234,"do Muleke",5000.00);
		c1.setData(01,05,2001);
		c2.setNumeroAgenciaSaldo(1234,"do Muleke",100.00);
		c2.setData(01,05,2201);
		c1.setSaca(500);
		c1.setDeposita(895);
		c1.setTranferencia(c2,200);
		System.out.println(c1.getRecuperandoDados());
		System.out.println(c2.getRecuperandoDados());
		int conta = Conta.getQuantidadeContas();
		System.out.println(conta);
	}
}