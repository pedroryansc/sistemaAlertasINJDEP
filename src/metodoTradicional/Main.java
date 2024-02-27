package metodoTradicional;

public class Main {
	public static void main(String[] args) {
		
		Notificacao n = new Notificacao();
		Alerta alerta = new Alerta(n);
		
		System.out.println(alerta.dispararAlerta());
		
	}
}