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
public class contaPoupanca extends imprimirInfosComuns {

    public contaPoupanca(nomeCliente cliente) {
        super(cliente);
    }

    contaPoupanca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     */
    @Override
     public void imprimirExtrato() {
        System.out.println("**** Extrato Conta Corrente");
        
    } 
            
}
