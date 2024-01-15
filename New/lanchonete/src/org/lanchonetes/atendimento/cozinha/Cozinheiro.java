package org.lanchonetes.atendimento.cozinha;

import org.lanchonetes.atendimento.Atendente;

public class Cozinheiro {

    public void adicionarLancheNoBalcao() {
        System.out.println("ADICIONADO LANCHE");
    }

    public void adicionarSucoNoBalcao() {
        System.out.println("ADICIONAR SUCO NO BALCAO");
    }

    public void adicionarComboBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }

    private void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    private void fritarIngredientesLanche() {
        System.out.println("FRITANDO A CARNE E OVO PARA O HAMBURGUER");
    }

    private void selecionarIngredientesVitamina() {
        System.out.println("SELCIONADO FRUTA, LEITE E SUCO");
    }

    private void selecionarIngredientesLanche() {
        System.out.println("SELECIONADO O PAO, SALADA, OVO E CARNE");
    }

    private void prepararCombo() {
        prepararLanche();
        preparaVitamina();
    }

    private void prepararVitamina() {
        System.out.println("PREPARANDO SUCO");
    }

    private void prepararLanche() {
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
    }

    private void lavarIngredientes() {
    }

    private void baterVitaminaLiquidificador() {
    }

}
