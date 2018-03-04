package empresa;

public class SplitString {

	private String frase;
	
	public String setFrase(String f) {
		return this.frase=f;
	}
	
	
	public void getFrase() {
		String[] dividido =  this.frase.split(" ");
		for(int i=dividido.length-1;i>=0;i--) {
			System.out.print(dividido[i]+" ");
		}
	
	}
	
}
