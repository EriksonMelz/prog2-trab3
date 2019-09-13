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
public class EncomendaPAC implements TipoPedido {

    private static EncomendaPAC encomendaPAC;
    
    public static synchronized EncomendaPAC getInstance() {
        if (encomendaPAC == null)
            encomendaPAC = new EncomendaPAC();
 
        return encomendaPAC;
    }
    
    @Override
    public double calcular(Pedido pedido) {
        if (pedido.getPesoTotal() <= 1000) {
            return 10.0;
        } else if (pedido.getPesoTotal() <= 2000) {
            return 15.0;
        } else if (pedido.getPesoTotal() <= 3000) {
            return 20.0;
        } else if (pedido.getPesoTotal() <= 5000) {
            return 30.0;
        }
        
        throw new IllegalArgumentException("não aceita este tipo de entrega");
    }

}
