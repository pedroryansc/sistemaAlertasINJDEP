package injecaoHeranca;

public class Main { // Aspectos comportamentais
	public static void main(String[] args) {
	
		Notificacao n = new NotificacaoEmail();
		Alerta alerta = new Alerta(n);
		System.out.println(alerta.dispararAlerta());
		
		n = new NotificacaoSMS();
		alerta = new Alerta(n);
		System.out.println(alerta.dispararAlerta());
		
		n = new NotificacaoWhatsApp();
		alerta = new Alerta(n);
		System.out.println(alerta.dispararAlerta());
	}
}