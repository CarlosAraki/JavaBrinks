import java.io.File;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {
		//primeiro pego a path padrão de aonde está o documento
		String path = new File(".").getCanonicalPath();
		String path2 = path+"/texto.txt";
		ConfDocumento d = new ConfDocumento(path2);	
		d.setHashInicial(); 
		d.salvaHash();
		new CriaJanela(d);		
	}

}
