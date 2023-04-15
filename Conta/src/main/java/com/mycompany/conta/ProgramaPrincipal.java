package com.mycompany.conta;

public class ProgramaPrincipal {
    
    public static void main (String[]args){
           //classe objeto     classe utilizada   
            Conta MinhaConta = new Conta();
        //instaciação da conta
        
        MinhaConta.dono = "Duke";
        MinhaConta.saldo = 1000.0;
        
        System.out.println( MinhaConta.dono +" seu saldo é de " +MinhaConta.saldo);
           // usamos o "." para acessar algo dentro do objeto MinhaConta
           
           
           //alterando os valores da conta
           
           MinhaConta.dono = "Duke";
           MinhaConta.saldo = 1000;
           
           //saca 200 reais
           
           MinhaConta.saca(200);
           
           //deposita 500 reais
           MinhaConta.deposita(500);
           System.out.println(MinhaConta.saldo);
        
    
    }
}
