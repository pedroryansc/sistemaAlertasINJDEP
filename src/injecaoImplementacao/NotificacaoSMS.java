package injecaoImplementacao;

public class NotificacaoSMS implements Notificacao{

	public String enviar() {
		return "SMS enviado com sucesso.";
	}
	
}