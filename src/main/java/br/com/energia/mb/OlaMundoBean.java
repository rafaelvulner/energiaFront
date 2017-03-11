package br.com.energia.mb;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class OlaMundoBean {

	private String nome;
	private String mensagem = "Olá quem é você";

	public String getNome() {
		return nome;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String nomeFoiDigitado() {
	    return "O nome do maluco é "+getNome();
	  }

	public String getHorario() {
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		return "Atualizado em " + sdf.format(new Date(0));
	}
}
