package ro.sci.dao;

import ro.sci.meniu.Stoc;

import java.util.Collection;

/**
 * Created by Skipy on 07/06/2017.
 */
public interface StocDAO extends BaseDAO<Stoc> {
    Collection<Stoc> listAll();

}
