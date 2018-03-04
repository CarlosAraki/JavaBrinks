package array;

public class Totodile extends Pokemon{

	Totodile(String name){
		if(name == null) {
			this.name = "Totodile";
		}
		else {
			this.name = name;
		}
		this.type = "water";
		this.HP = 50;
		this.velocity = 43;
		
	}
	@Override
	public double ataque(int escolha) {
		switch(escolha) {
		case 1:
			return 10;
		case 2:
			return 20;
		case 3:
			return 30;
		case 4:
			return 40;
		default:
			return 0;
		}
	}

}
