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
public class EncomendaPAC implements TipoPedido {

    @Override
    public double calcular(int pesoTotalPedido) {
        if (pesoTotalPedido <= 1000) {
            return 10.0;
        } else if (pesoTotalPedido <= 2000) {
            return 15.0;
        } else if (pesoTotalPedido <= 3000) {
            return 20.0;
        } else if (pesoTotalPedido <= 5000) {
            return 30.0;
        }
        
        throw new IllegalArgumentException("não aceita este tipo de entrega");
    }

}
