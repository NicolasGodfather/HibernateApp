/*
 * Copyright (c) 2012 by VeriFone, Inc.
 * All Rights Reserved.
 *
 * THIS FILE CONTAINS PROPRIETARY AND CONFIDENTIAL INFORMATION
 * AND REMAINS THE UNPUBLISHED PROPERTY OF VERIFONE, INC.
 *
 * Use, disclosure, or reproduction is prohibited
 * without prior written approval from VeriFone, Inc.
 */
package com.pvt.hibernateApp.loader;

import com.pvt.hibernateApp.dao.DeveloperDao;
import com.pvt.hibernateApp.dao.exceptions.DaoException;
import com.pvt.hibernateApp.pojos.Developer;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class MenuLoader {
    private static Logger log = Logger.getLogger(MenuLoader.class);
    public static Boolean needMenu = true;
    private static DeveloperDao developerDao = null;

    public static void menu() throws DaoException {
        Developer developer = null;
        while (needMenu) {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0); break;
                case 1:
                    // Perform "original number" case.
                    break;
                case 2:
                    developer = findDeveloper();
                    break;
                case 3:
                    developer = createPerson(developer);
                    getDeveloperDao().saveOrUpdate(developer);
                    break;
                default:
                    needMenu = true;
                    break;
            }
            needMenu = true;
        }
    }

    private static void printMenu() {
        System.out.println(" Options:");
        System.out.println("        0. Exit");
        System.out.println("        1. Delete developer");
        System.out.println("        2. Get Developer");
        System.out.println("        3. Save or Update Developer");
    }

    public static Developer createPerson(Developer developer) {
        System.out.println("Please enter developer description:");
        System.out.print("Name - ");

        if(developer == null) {
            developer = new Developer();}
        Scanner scanner = new Scanner(System.in);
        String parameter = scanner.nextLine();
        developer.setName(parameter);
        System.out.print("Surname - ");
        parameter = scanner.nextLine();
        developer.setSurname(parameter);
        System.out.print("Age - ");
        developer.setAge(scanner.nextInt());
//        developer.setPersonAddress(new Address());
//        developer.getPersonAddress().setCity("Minsk");
//        developer.getPersonAddress().setStreet("Gaya");
        return developer;
    }

    public static Developer findDeveloper() {
        System.out.println("Get by Id. Please enter developer id:");
        System.out.print("Id - ");

        Scanner scanner = new Scanner(System.in);
        Developer developer = null;
        Integer id = scanner.nextInt();
        try {
            developer = getDeveloperDao().get(id);
        } catch (DaoException e) {
            log.error(e, e);
        } catch (NullPointerException e) {
            log.error("Unable find developer:", e);
        }
        System.out.print(developer);
        return developer;
    }

    public static Developer loadDeveloper() {
        System.out.println("Loag by Id. Please enter developer id:");
        System.out.print("Id - ");

        Scanner scanner = new Scanner(System.in);
        Developer developer = null;
        Integer id = scanner.nextInt();
        try {
            developer = getDeveloperDao().get(id);
        } catch (DaoException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (NullPointerException e) {
            log.error("Unable find developer:", e);
        }
        System.out.print(developer);
        return developer;
    }

    public static void flushSession() {
        System.out.println("Please enter developer id:");
        System.out.print("Id - ");
        Scanner scanner = new Scanner(System.in);
        Developer developer = null;
        Integer id = scanner.nextInt();
        System.out.println("Please enter new Name:");
        System.out.print("New Name - ");
        scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        try {
            getDeveloperDao().flush(id, name);
        } catch (DaoException e) {
            log.error("Unable run flush example");
        }
    }

    public static DeveloperDao getDeveloperDao () {
        if (developerDao == null) {
            developerDao = new DeveloperDao();
        }
        return developerDao;
    }
}
