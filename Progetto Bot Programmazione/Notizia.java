package application;

import java.time.LocalDateTime;

public class Notizia {

	private String Titolo;
	private String Descrizione;
	private LocalDateTime OraGiorno;
	private String Autore;
	private String Fonte;

	Notizia(String titolo, String descrizione, LocalDateTime oragiorno, String autore, String fonte) {
		Titolo = titolo;
		Descrizione = descrizione;
		OraGiorno = oragiorno;
		Autore = autore;
		Fonte = fonte;

	}

	public String getTitolo() {
		return Titolo;
	}

	public void setTitolo(String titolo) {
		Titolo = titolo;
	}

	public String getDescrizione() {
		return Descrizione;
	}

	public void setDescrizione(String descrizione) {
		Descrizione = descrizione;
	}

	public LocalDateTime getOraGiorno() {
		return OraGiorno;
	}

	public void setOraGiorno(LocalDateTime oraGiorno) {
		OraGiorno = oraGiorno;
	}

	public String getAutore() {
		return Autore;
	}

	public void setAutore(String autore) {
		Autore = autore;
	}

	public String getFonte() {
		return Fonte;
	}

	public void setFonte(String fonte) {
		Fonte = fonte;
	}

}
