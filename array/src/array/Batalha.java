package array;

public class Batalha {
	
	public int indice(Pokemon[] time) {
		for(int i=0;i<time.length;i++) {
			if(time[i].tavivo()) {
				return i;
			}
		}
		return -1;
	}	
	public int morreu(Pokemon[] time,int indAnt) {
		for(int i=0;i<time.length;i++) {
			if(time[i].tavivo()) {
				if(i == indAnt) {
					return 0;
				}
				return 1;
			}
		}
		return -1;
	}
}
