/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Statless;

import Entity.Cliente;
import java.util.Date;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 *
 * @author Altran
 */
@Stateless 
@TransactionManagement(TransactionManagementType.CONTAINER)
public class MinhaSessaoBean implements MinhaSessaoRemote {
@PersistenceContext
    private EntityManager em;

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Cliente obterNomeCliente(Cliente cliente) {
        //logAuditoria();
        return em.find(Entity.Cliente.class, cliente.getIdCliente());
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public long registarCliente(String nome, Date data, String distrito, String concelho, Integer telefone) {
        return 0L;
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void logAuditoria() {
       
    }
}
