

import br.com.energia.model.Imagem;
import br.com.energia.repository.ImagemDAO;

public class Teste {

	public static void main(String[] args) {


		
		ImagemDAO dao = new ImagemDAO();
		
		for(Imagem img : dao.consultarCadastros()){
			
			System.out.println(img.getCaminho());
			
		}
		
		
		
		

	}

}
