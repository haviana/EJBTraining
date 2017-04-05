/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.Date;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 *
 * @author Altran
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class MinhaSessao implements MinhaSessaoRemote {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")


    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public String obterNomeCliente(Integer numeroCliente) {
        return "Nome Cliente";
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public long registarCliente(String nome, Date data, String distrito, String concelho, Integer telefone) {
        return 0L;
    }
}
