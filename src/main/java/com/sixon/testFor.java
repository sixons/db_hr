package com.sixon;

import com.sanqing.po.TestUser;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.junit.Test;

/**
 *
 */
public class testFor {
    @Test
    public void test1(){
        Configuration configuration=new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        TestUser testUser = new TestUser();
        testUser.setName("ÕÅÈý"); //Error:Caused by: java.sql.SQLException: Incorrect string value:
        session.save(testUser);
        transaction.commit();
        sessionFactory.close();
    }
}
