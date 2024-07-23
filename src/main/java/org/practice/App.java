package org.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.internal.AbstractServiceRegistryImpl;
import org.hibernate.service.spi.ServiceBinding;
import org.hibernate.service.spi.ServiceInitiator;
import org.practice.eintities.Employee;

public class App 
{
    public static void main( String[] args )
    {
        StandardServiceRegistry sr = new StandardServiceRegistryBuilder().configure().build();
        MetadataSources sources = new MetadataSources(sr);
        Metadata data = sources.getMetadataBuilder().build();
        SessionFactory sf = configuration.buildSessionFactory(serviceRegistry);
        Session s = sf.openSession();
        Transaction transaction = s.beginTransaction();
        

        transaction.commit();
        s.close();
    }
}
