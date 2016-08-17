package com.pvt.hibernateApp.dao;

import com.pvt.hibernateApp.dao.exceptions.DaoException;
import com.pvt.hibernateApp.pojos.Developer;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import static com.pvt.hibernateApp.loader.DeveloperLoader.util;

/**
 * Realization
 *
 * @author Nicolas Asinovich.
 */
public class DeveloperDao extends BaseDao<Developer>{

    private static Logger log = Logger.getLogger(DeveloperDao.class);

    public void flush(Integer id, String newName) throws DaoException {
        try {
            Session session = util.getSession();
            Developer d = (Developer)session.get(Developer.class, id);
            System.out.println(d);
            d.setName(newName);
            System.out.println(d);
            session.flush();
            System.out.println(d);
        } catch (HibernateException e) {
            log.error("Error Flush person" + e);
            throw new DaoException(e);
        }

    }

}
