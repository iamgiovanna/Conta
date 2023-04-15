package com.mycompany.conta;

public class Conta {

//declarando variáveis no escopo da classe sem o método main

    int numero;
    String dono;
    double saldo;
    double limite;
    double salario;
    //atributos da minha conta
    
    //método de saque
    
    public void saca(double quantidade){
        
        double novoSalario = this.saldo - quantidade;
        this.saldo = novoSalario;
    
    }
    
    //método de deposito
    
    void deposita(double quantidade){
    
        this.saldo += quantidade;
        
    }
    
}
