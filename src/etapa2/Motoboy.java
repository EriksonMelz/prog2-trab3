/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etapa2;

/**
 *
 * @author laschwab
 */
public class Motoboy implements TipoPedido{
    
    private static Motoboy motoboy;
    
    public static synchronized Motoboy getInstance() {
        if (motoboy == null)
            motoboy = new Motoboy();
 
        return motoboy;
    }

    @Override
    public double calcular(Pedido pedido) {
        if(pedido.getQuantidadeItensPedido() <= 30 && pedido.getPesoTotal() < 25000)
            return 7.0;
        
        throw new IllegalArgumentException("A quantidade de itens do pedido e superior a 30 ou o peso é maior que 25kg!");
    }
    
}
