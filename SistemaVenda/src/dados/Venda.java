/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author Thiago Luna
 */
public class Venda {
    
    int codigo;
    int quantidade;
    Funcionario funcionario;
    Cliente cliente;
    String data;    
    
    private static int codigoContador;

    public Venda(int quantidade, Funcionario funcionario, Cliente cliente, String data) {
        this.quantidade = quantidade;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.data = data;
        
        codigo = codigoContador;
        codigoContador++;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    

    
    
    
   
    
    
}

