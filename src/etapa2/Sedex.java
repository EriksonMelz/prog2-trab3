/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etapa1;

/**
 *
 * @author laschwab
 */
public class Sedex implements TipoPedido{

    @Override
    public double calcular(int pesoTotalPedido) {
        if (pesoTotalPedido <= 500) {
            return 12.5;
        } else if (pesoTotalPedido <= 750) {
            return 20.0;
        } else if (pesoTotalPedido <= 1200) {
            return 30.0;
        } else if (pesoTotalPedido <= 2000) {
            return 45.0;
        } else {
            return calculaexcessopeso(pesoTotalPedido);
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
