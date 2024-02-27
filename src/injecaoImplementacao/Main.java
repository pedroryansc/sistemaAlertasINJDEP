package injecaoImplementacao;

public class Main {
	public static void main(String[] args) {
		
		Notificacao n = new NotificacaoEmail();
		Alerta a = new Alerta(n);
		System.out.println(a.dispararAlerta());
		
		n = new NotificacaoSMS();
		a = new Alerta(n);
		System.out.println(a.dispararAlerta());
		
		n = new NotificacaoWhatsApp();
		a = new Alerta(n);
		System.out.println(a.dispararAlerta());
	}
}