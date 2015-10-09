/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavenda;

import dados.Cliente;
import java.util.ArrayList;
import telas.TelaPrincipal;

/**
 *
 * @author Thiago Luna
 */
public class SistemaVenda {
    
    public static ArrayList<Cliente> ListaClientes = new ArrayList<>();
    
    public static void main(String[] args) {
     
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        
    }
    
}
