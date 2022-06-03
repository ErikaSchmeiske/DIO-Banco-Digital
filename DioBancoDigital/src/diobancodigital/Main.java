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
public class Main {
    
    public static void main (String[] args) {
        Conta cc = new contaCorrente();
        Conta poupanca = new contaPoupanca();
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
    
}
