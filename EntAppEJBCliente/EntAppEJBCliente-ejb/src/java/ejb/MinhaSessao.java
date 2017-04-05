/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.Date;
import javax.ejb.Stateless;

/**
 *
 * @author Altran
 */
@Stateless
public class MinhaSessao implements MinhaSessaoRemote {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")


    @Override
    public String obterNomeCliente(Integer numeroCliente) {
        return "Nome Cliente";
    }

    @Override
    public long registarCliente(String nome, Date data, String distrito, String concelho, Integer telefone) {
        return 0L;
    }
}
