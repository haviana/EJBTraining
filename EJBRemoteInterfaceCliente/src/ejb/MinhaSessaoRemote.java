/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.Date;
import javax.ejb.Remote;

/**
 *
 * @author Altran
 */
@Remote
public interface MinhaSessaoRemote {


    public long registarCliente(String nome, Date data, String distrito, String concelho, Integer telefone);

    public String obterNomeCliente(Integer numeroCliente);

    
}
