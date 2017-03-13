package br.com.energia.mb;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.imageio.ImageIO;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import br.com.energia.model.Imagem;
import br.com.energia.repository.ImagemDAO;

@ManagedBean
public class FileUploadView implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static String caminho;
	private String regiao;
	private String categoria;
	
	
	public String getRegiao() {
		return regiao;
	}


	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public void uploadImg(FileUploadEvent event) throws IOException {

		UploadedFile arq = event.getFile();
		BufferedImage src = ImageIO.read(new BufferedInputStream(arq.getInputstream()));

		File file = new File("C:\\Users\\rafael\\workspace\\Energia\\WebContent\\resources\\imagens\\" + event.getFile().getFileName().replaceAll(" ", ""));
	
		caminho = "resources/imagens/" + event.getFile().getFileName().replaceAll(" ", "");		
		
		ImageIO.write(src, "jpg", file);

		FacesMessage message = new FacesMessage("Sucesso!", event.getFile().getFileName() + " foi salvo!.");
		FacesContext.getCurrentInstance().addMessage(null, message);		
	}
	
	
	public void salvar(){	
		
		Imagem img = new Imagem();
		ImagemDAO dao = new ImagemDAO();
		
		
		
		img.setCaminho(caminho);
		img.setRegiao(getRegiao());
		img.setCategoria(getCategoria());
		
		try {
			dao.salvar(img);
		} catch (Exception e) {
			FacesMessage message = new FacesMessage("Erro!", "Erro ao salvar no banco! "+e );
			FacesContext.getCurrentInstance().addMessage(null, message);
		}finally {
			FacesMessage message = new FacesMessage("Sucesso!", "Arquivo salvo com sucesso!");
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
		}
		
		


}