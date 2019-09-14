/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etapa2;

import java.util.Date;

/**
 *
 * @author laschwab
 */
public class Principal {
    
    public static void main(String[] args) {
        Pedido pedido = new Pedido();     
        
        pedido.setNumero(1);
        pedido.setNomeCliente("João");
        pedido.setEndereco("Antonio da Veiga");
        pedido.setData(new Date(System.currentTimeMillis()));
        
        pedido.incluirItem(new Produto("Arroz", 12.0,20), 2);
        pedido.incluirItem(new Produto("Feijão", 10.0,10), 1);
        
        pedido.setTipoPedido(new Sedex());
        
        System.out.println("Quantidade produtos: " + Integer.toString(pedido.getQuantidadeItensPedido()));        
        
        System.out.println("Valor total: " + Double.toString(pedido.getValorEntrega()));        
    }
    
}
