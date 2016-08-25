package com.pvt.hibernateApp.dao;

import com.pvt.hibernateApp.pojos.Person;
import org.apache.log4j.Logger;

/**
 * Realization
 *
 * @author Nicolas Asinovich.
 */
public class PersonDao extends BaseDao<Person>{

    private static Logger log = Logger.getLogger(PersonDao.class);



//    public void flush(Integer id, String newName) throws DaoException {
//        try {
//            Session session = util.getSession();
//            Person d = (Person)session.get(Person.class, id);
//            System.out.println(d);
//            d.setName(newName);
//            System.out.println(d);
//            session.flush();
//            System.out.println(d);
//        } catch (HibernateException e) {
//            log.error("Error Flush person" + e);
//            throw new DaoException(e);
//        }
//    }

}
