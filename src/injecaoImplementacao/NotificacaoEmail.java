package injecaoImplementacao;

public class NotificacaoEmail implements Notificacao {

	public String enviar() {
		return "E-mail enviado com sucesso.";
	}
	
}