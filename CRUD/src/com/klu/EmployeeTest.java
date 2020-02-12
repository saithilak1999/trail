package com.klu;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
public class EmployeeTest {
public static void main(String[] args) {
//To store object...In hibernate.cfg.xml we should specify create command for hbm2ddl property.
Employee e=new Employee();
 // e.setId(1);
  //e.setName("sai");
  //e.setDept("cse");
 
 
 Configuration cfg=new Configuration();
 cfg.configure();
 SessionFactory sf=cfg.buildSessionFactory();
 Session s=sf.openSession();
// TO INSERT
 //s.save(e);
 // TO UPDATE
 //e.setId(1);
 //e.setName("ram");
 //e.setDept("CSE");
 //s.update(e);
 //TO DELETE
 //e.setId(1);
 //s.delete(e);
 //TO RETRIVE
 Object o=s.get(Employee.class, 12);
 //Employee e1=(Employee)o;
 System.out.println(e.getId());
 System.out.println(e.getId()+e.getName()+e.getDept());
 s.beginTransaction().commit();
}
}