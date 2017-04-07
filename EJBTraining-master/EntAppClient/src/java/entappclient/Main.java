/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entappclient;

    
import Entity.Cliente;
import Statless.MinhaSessaoRemote;
import java.util.Date;
import javax.ejb.EJB;

/**
 *
 * @author Altran
 */
public class Main {

    @EJB
    private static MinhaSessaoRemote minhaSessao;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String distrito = "Setubal";
        String concelho = "Almada";
        String nome = "Hugo Viana";
        long id =1;
        Cliente cli = new Cliente();
        cli.setIdCliente(id);
        cli.setNome(nome);
        cli.setDistrito(distrito);
        cli.setConcelho(concelho);
        // TODO code application logic here
        System.out.println("Hello World");
        System.err.println("result = " + minhaSessao.obterNomeCliente(cli));
        System.err.println("result = " + minhaSessao.registarCliente(nome, new Date(), distrito, concelho, 0));
    } 
}
