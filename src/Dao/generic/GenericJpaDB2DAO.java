package Dao.generic;

import Dao.Persistente;
import Dao.generic.GenericJpaDAO;

import java.io.Serializable;

public class GenericJpaDB2DAO<T extends Persistente, E extends Serializable>
        extends GenericJpaDAO<T,E> {

    public GenericJpaDB2DAO(Class<T> persistenteClass) {
        super(persistenteClass, "Postgre2");
    }

}