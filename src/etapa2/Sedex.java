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
public class Sedex implements TipoPedido{

    private static Sedex sedex;
    
    public static synchronized Sedex getInstance() {
        if (sedex == null)
            sedex = new Sedex();
 
        return sedex;
    }
    
    @Override
    public double calcular(Pedido pedido) {
        if (pedido.getPesoTotal() <= 500) {
            return 12.5;
        } else if (pedido.getPesoTotal() <= 750) {
            return 20.0;
        } else if (pedido.getPesoTotal() <= 1200) {
            return 30.0;
        } else if (pedido.getPesoTotal() <= 2000) {
            return 45.0;
        } else {
            return calculaexcessopeso(pedido.getPesoTotal());
        }
    }
    
    private double calculaexcessopeso(int pesoTotalPedido){
        pesoTotalPedido = pesoTotalPedido - 2000;
        double retorno = 45.0;
        while(pesoTotalPedido > 100){
            retorno += 1.50;
            pesoTotalPedido -= 100;
        }
        return retorno + 1.50;
    }
}
