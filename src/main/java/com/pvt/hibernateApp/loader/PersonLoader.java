package com.pvt.hibernateApp.loader;

import com.pvt.hibernateApp.util.HibernateUtil;
import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Locale;

import static com.pvt.hibernateApp.loader.MenuLoader.menu;

public class PersonLoader {
    private static Logger log = Logger.getLogger(PersonLoader.class);
    public static HibernateUtil util = null;

    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        util = HibernateUtil.getHibernateUtil();
        System.out.println("Start Menu");
        SimpleDateFormat sdfout = new SimpleDateFormat("yyyy.MM.dd");
        String date = "2012.12.20";
        java.sql.Date sqlDate = new java.sql.Date(sdfout.parse(date).getTime());

        menu();
    }

}


