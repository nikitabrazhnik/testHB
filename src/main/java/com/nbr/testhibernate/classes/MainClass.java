/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nbr.testhibernate.classes;

import com.nbr.testhibernate.controller.DAOclass;
import com.nbr.testhibernate.model.User;
import java.util.Random;
import org.hibernate.Session;

/**
 *
 * @author brazhnik
 */
public class MainClass {

    public static void main(String[] args) {
        //MainFrame mf = new MainFrame();

        //  mf.setVisible(true);
        //System.out.println("Start...");
        Random rnd = new Random();

        Session sf = DAOclass.getSessionFactory().getCurrentSession();
        sf.beginTransaction();

        for (int i = 0; i < 10; i++) {
            User usr = new User();
            usr.setLogin(Integer.toString(i));
            usr.setEmail("nikita.brazhnik@gmail.com");
            usr.setLoginType("1");
            usr.setName(Long.toString(rnd.nextLong()));
            sf.save(usr);
            sf.getTransaction().commit();

        }
    }
}
