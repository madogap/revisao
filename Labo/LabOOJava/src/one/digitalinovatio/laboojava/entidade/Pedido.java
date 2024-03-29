package one.digitalinovatio.laboojava.entidade;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa a entidade pedido, qual é a compra dos produtos por um
 * cliente.
 * 
 * @author thiago leite
 */
public class Pedido {

    // TODO Preencher esta classe

    // codigo
    // cliente
    // produtos
    // total
    private String codigo;
    private Cliente cliente;
    private List<Produto> produtos;
    private double total;

    public Pedido() {
        this.produtos = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public double getTotal() {
        return total;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    private String getProdutosComprados() {
        StringBuilder produtos = new StringBuilder();
        produtos.append("[");
        for (Produto produto : getProdutos()) {
            produtos.append(produto.toString());
            produtos.append("QTD:");
            produtos.append(produto.getQuantidade());
            produtos.append(" ");
        }
        produtos.append("]");
        return produtos.toString();

    }

    @Override
    public String toString() {
        return "Pedido{" + "Codigo=' " + codigo + '\'' +
                ", cliente=" + cliente + ", produtos=" + getProdutosComprados() +
                ", total=" + total + '}';
    }
}