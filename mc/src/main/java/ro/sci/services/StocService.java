package ro.sci.services;

import ro.sci.dao.StocDAO;
import ro.sci.meniu.Stoc;

import java.util.Collection;


/**
 * Created by Skipy on 08/06/2017.
 */
public class StocService {
    private StocDAO stocDAO;

    public Collection<Stoc> listAll() {
        return stocDAO.listAll();
    }

    public void setStocDAO(StocDAO stocDAO) {
        this.stocDAO = stocDAO;
    }
}
