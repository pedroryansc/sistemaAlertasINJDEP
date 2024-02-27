package injecaoHeranca;

public class NotificacaoWhatsApp extends Notificacao { // Utilizando generalização (herança)

	public String enviar() {
		return "Mensagem enviada com sucesso.";
	}
	
}
