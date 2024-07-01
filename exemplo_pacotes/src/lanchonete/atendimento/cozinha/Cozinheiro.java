package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
	public void adicionarLancheNoBalcao() {
		System.out.println("Adicionando lanche natural hamburguer no balcao");
	}
	public void adicionarSucoNoBalcao() {
		System.out.println("Adicionando suco no balcao");
	}
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	private void prepararLanche() {
		System.out.println("Preparando lanche tipo hamburguer");
	}
	private void prepararVitamina() {
		System.out.println("Preparando suco");
	}
	private void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	private void selecionarIngredientesLanche() {
		System.out.println("Selecionado o pão, ovo e carne");
	}
	private void selecionarIngredientesVitamina() {
		System.out.println("Selecionado fruta, leite e suco");
	}
	private void lavarIngredientes() {
		System.out.println("Lavando ingredientes");
	}
	private void baterVitaminaLiquidificador() {
		System.out.println("Batendo vitamina liquidificador");
	}
	private void fritarIngredienteslanche() {
		System.out.println("fritando a carne e o ovo para o hamburguer");
	}
	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	public void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
	
}
