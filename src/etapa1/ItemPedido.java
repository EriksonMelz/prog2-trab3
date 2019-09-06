/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etapa1;

/**
 *
 * @author eamelz
 */
public class ItemPedido {
    private Produto produto;
    private int quantidade;

    protected ItemPedido(Produto produto, int quantidade) {
        this.setProduto(produto);
        this.setQuantidade(quantidade);
    }    

    protected Produto getProduto() {
        return produto;
    }

    protected void setProduto(Produto produto) {
        this.produto = produto;
    }

    protected int getQuantidade() {
        return quantidade;
    }

    protected void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    protected double getValorItem(){
        return 0.0;
    }    
}
