import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.energia.model.Imagem;
import br.com.energia.repository.ImagemDAO;


public class ImagemDAOTest {

	
	ImagemDAO dao;
	List<Imagem> img;
	
	
	
	@Before
	public void setUp() throws Exception {
		
		dao = new ImagemDAO();
		img = new ArrayList<>();
	}


	@Test
	public void testConsultarCadastros() {
		assertArrayEquals(img, dao.consultarCadastros());
		
	}


	private void assertArrayEquals(List<Imagem> img2, List<Imagem> consultarCadastros) {
		// TODO Auto-generated method stub
		
	}

}
