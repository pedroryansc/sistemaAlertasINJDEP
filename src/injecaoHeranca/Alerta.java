package injecaoHeranca;

public class Alerta { // Classe com injeção de dependência
	
	protected Notificacao notificacao; //"Protected" faz com que não precise de get e set em objetos, mas poderia ser "private"
	
	public Alerta(Notificacao notificacao) {
		this.notificacao = notificacao;
	}
	
	public String dispararAlerta() {
		return this.notificacao.enviar();
	}
	
}