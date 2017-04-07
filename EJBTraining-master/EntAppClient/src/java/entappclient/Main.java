/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entappclient;

    
import java.util.Date;
import javax.ejb.EJB;

/**
 *
 * @author Altran
 */
public class Main {

    @EJB
    private static  minhaSessao;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String destrito = "Setubal";
        String concelho = "Almada";
        String nome = "Hugo";
        Cliente cli = new Cliente();
        cli.setNome(nome);
        cli.setDistrito(destrito);
        cli.setConcelho(concelho);
        // TODO code application logic here
        System.err.println("result = " + minhaSessao.obterNomeCliente(cli));
        System.err.println("result = " + minhaSessao.registarCliente(nome, new Date(), destrito, concelho, 0));
    } 
}
