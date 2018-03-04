package array;
import java.util.Random;
public class main {

	public static void main(String[] args) {
		Random gerador = new Random();
		int time1,time2;
		int batalhas =1500,contc=0,contt=0,mortost=0,mortosc=0;
		while(batalhas>0) {
			time1 = gerador.nextInt(5)+1;
			time2 = gerador.nextInt(5)+1;
			Totodile[] tototime = new Totodile[time1];
			System.out.println(time1+" totodiles");
			System.out.println(time2+" Cyndaquils");
			for(int h = 0;h<time1;h++) {
				Totodile t =  new Totodile("Toto");
				tototime[h] = t;
			}
			Cyndaquil[] cyndatime = new Cyndaquil[time2];
			for(int h = 0;h<time2;h++) {
				Cyndaquil t =  new Cyndaquil("Cynda");
				cyndatime[h] = t;
			}
			
			Batalha B1 = new Batalha();
			boolean flag = true;
			boolean atktorc = true;//quem ataca primeiro cyndaquil ou toto;
			int i,j;
		
			while(flag) {
				if(atktorc == true) {//cyndatime ataca
					i = B1.indice(cyndatime);
					j = B1.indice(tototime);
					System.out.println("Totodile "+j+" HP:"+tototime[j].HP+" Toma:"+
					tototime[j].tomouataque(cyndatime[i].ataque(gerador.nextInt(5)))+" de Dano do Cyndaquil "+i);
					if(B1.morreu(tototime, j)==-1) {
						mortost++;
						flag = false;
						System.out.println("Cynda time ganhou");
						break;
					}
					mortost+=B1.morreu(tototime, j);
					atktorc = false;
				}
				else { //tototime ataca
					i = B1.indice(tototime);
					j = B1.indice(cyndatime);
					System.out.println("Cyndaquil "+j+" HP:"+cyndatime[j].HP+" Toma:"+
					cyndatime[j].tomouataque(tototime[i].ataque(gerador.nextInt(5)))+" de Dano do Totodile "+i);
					if(B1.morreu(cyndatime, j)==-1) {
						mortosc++;
						flag = false;
						System.out.println("Toto time ganhou");
						break;
					}
					mortosc+=B1.morreu(cyndatime, j);
					atktorc = true;
				}
			}
			if(atktorc) {
				contc++;
			}
			else {
				contt++;
			}
			batalhas--;
		}
		System.out.println("Tototime venceu:"+contt+"\n"+"Cyndatime venceu:"+contc+
				"\nTotodiles mortos:"+mortost+" Cyndaquils mortos:"+mortosc);
		}
	}

