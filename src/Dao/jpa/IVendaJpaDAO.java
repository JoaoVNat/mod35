package Dao.jpa;

import Dao.generic.IGenericJapDAO;
import Main.VendaJpa;
import exceptions.DAOException;
import exceptions.TipoChaveNaoEncontradaException;

public interface IVendaJpaDAO extends IGenericJapDAO<VendaJpa, Long> {

    public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;


    public VendaJpa consultarComCollection(Long id);

}