package br.com.energia.mb;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class OlaMundoBean {
	
	public String getHorario() {
	    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
	    return "Atualizado em " + sdf.format(new Date(0));
	  }
}
