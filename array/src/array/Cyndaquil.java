package array;

public class Cyndaquil extends Pokemon {

	Cyndaquil(String name){
		if(name == null) {
			this.name = "Cyndaquil";
		}
		else {
			this.name = name;
		}
		this.type = "fire";
		this.HP = 39;
		this.velocity = 65;
	}
	@Override
	public double ataque(int escolha) {
		switch(escolha) {
		case 1:
			return 20;
		case 2:
			return 0;
		case 3:
			return 40;
		case 4:
			return 49;
		default:
			return 0;
		}
	}

}
