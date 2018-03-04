package array;

public abstract class Pokemon {

	protected String type;
	protected String name;
	protected double HP;
	protected double velocity;
	public abstract double ataque(int escolha);
	public double tomouataque(double dano) {
		this.HP = this.HP - dano;
		return dano;
	}
	public boolean tavivo() {
		if(this.HP < 1) {
			return false;
		}
		else {
			return true;
		}
	}
	@Override
	public String toString() {
		return this.name +" ";
	}
}
