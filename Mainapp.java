package edu.com;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Mainapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EduStudent sob=new EduStudent();
sob.setSid(2);
sob.setName("Neha");

Configuration con=new Configuration().configure().addAnnotatedClass(EduStudent.class);
ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

SessionFactory sf = con.buildSessionFactory(reg); 
Session session = sf.openSession();
Transaction tx=session.beginTransaction();
session.save(sob);


tx.commit();
System.out.println("Record saved");



	}

}
