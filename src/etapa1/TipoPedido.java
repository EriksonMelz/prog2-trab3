/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etapa1;

import javax.xml.bind.annotation.XmlElement;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author eamelz
 */
public class TipoPedido {

    private int tipo;
    private Pedido pedido;

    public double calculaValor() {
        switch (tipo) {
            case 0:
                return 0.00;
            case 1:
                return valorPac();
            case 2:
                return valorSedex();
            default:
                return 0.00;
        }
    }

    private double valorPac() {
        
        return 0.00;
    }

    private double valorSedex() {
        return 0.00;
    }
}
