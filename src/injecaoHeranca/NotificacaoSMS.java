package injecaoHeranca;

public class NotificacaoSMS extends Notificacao { // Utilizando generalização (herança)

	public String enviar() {
		return "SMS enviado com sucesso.";
	}
	
}
