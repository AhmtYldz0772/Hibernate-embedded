package com.yildiz;

import com.yildiz.entity_models.Address;
import com.yildiz.entity_models.Customer;
import com.yildiz.entity_models.Worker;
import com.yildiz.util.HibernateUtil;
import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class AppMain {
    public static void main(String[] args) {
        Customer customer2 = new Customer(2,"Ahmet","Yıldız");
        //customer2.setAdress("kadiköy/istanbul");
        customer2.setCreateDate(new Date());
        Customer customer = new Customer();
        //customer.setAdress("ankara");
        customer.setId(1);
        customer.setFirstName("sena");
        customer.setLastName("yıldız");
        customer.setCreateDate(new Date());

        Worker worker = new Worker();
        worker.setFirstName("sena");
        worker.setLastName("yıldız");
        worker.setAge("25");
        worker.setCreateDate(new Date());
        worker.setEmail("sena@yildiz.com");
        worker.setPhone(null);


        System.out.println(customer);
        System.out.println(customer2);
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(customer2);
            session.save(customer);
            tx.commit();
        }catch (HibernateError e) {
            System.out.println("HibernateError" + e.getMessage());
        }finally {
            session.close();
        }


    }
}