/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diobancodigital;

/**
 *
 * @author Erika-Engest
 */
public abstract class imprimirInfosComuns extends Conta {

    public imprimirInfosComuns(nomeCliente cliente) {
        super(cliente);
    }
    
    /**
     *
     */
    @Override
     public void imprimirExtrato() {
        System.out.println("**** Extrato Conta Corrente");
        System.out.println(String.format("Agencia: %d", super.agencia));
        System.out.println(String.format("Número: %d", super.numero));
        System.out.println(String.format("Saldo: %.2f", super.saldo));
    }
    
}
