/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etapa2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author eamelz
 */
public class Pedido {
    
    private int numero;
    private String nomeCliente;
    private Date data;    
    private String endereco;
    private ArrayList<ItemPedido>itensPedido;
    private TipoPedido tipoPedido;
    
    public void setTipoPedido(){
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
        
    public double getValorPedido(){
        double valorTotal = 0.0;
        for (ItemPedido itemPedido : itensPedido) {
            valorTotal += itemPedido.getValorItem();
        }
        return valorTotal;
    }
    
    public void incluirItem(Produto p, int qtd){
        ItemPedido itemNovo = new ItemPedido(p, qtd);
        itensPedido.add(itemNovo);
    }
    
    public int getPesoTotal(){
        int pesoTotal = 0;
        for (ItemPedido itemPedido : itensPedido) {
            pesoTotal += itemPedido.getProduto().getPeso();
        }
        return pesoTotal;
    }
        
    public double getValorEntrega(){
        return getValorPedido() + tipoPedido.calcular(getPesoTotal());
    }    
}
