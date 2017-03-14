package br.com.energia.mb;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
 
import org.primefaces.event.CloseEvent;
import org.primefaces.event.ToggleEvent;

import br.com.energia.model.Imagem;
import br.com.energia.repository.ImagemDAO;
 
@ManagedBean
public class PanelView {
	
	List<Imagem> img = new ArrayList<>();
	ImagemDAO dao = new ImagemDAO();
	
	
	
	public List<Imagem> getRetornarImg(){
		
		
		return dao.consultarCadastros();
		
	}
     
    public void onClose(CloseEvent event) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Panel Closed", "Closed panel id:'" + event.getComponent().getId() + "'");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
     
    public void onToggle(ToggleEvent event) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, event.getComponent().getId() + " toggled", "Status:" + event.getVisibility().name());
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}