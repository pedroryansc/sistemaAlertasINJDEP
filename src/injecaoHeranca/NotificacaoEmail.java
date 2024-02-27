package injecaoHeranca;

public class NotificacaoEmail extends Notificacao { // Utilizando generalização (herança)

	public String enviar() {
		return "E-mail enviado com sucesso.";
	}
	
}
