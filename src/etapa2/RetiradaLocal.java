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
public class RetiradaLocal implements TipoPedido{

    private static RetiradaLocal retiradaLocal;
    
    public static synchronized RetiradaLocal getInstance() {
        if (retiradaLocal == null)
            retiradaLocal = new RetiradaLocal();
 
        return retiradaLocal;
    }
    
    @Override
    public double calcular(int pesoTotalPedido) {
        return 0.0;
    }
    
}
