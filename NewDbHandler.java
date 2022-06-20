import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.io.*;
import java.util.*;

class NewDbHandler {

public static void addStudent(int rno, String name, int marks1, int marks2, int marks3)
{
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session s = null;
Transaction t = null;

	try
	{
		s = sf.openSession();
		t = s.beginTransaction();
		Student stu = new Student(rno, name, marks1, marks2, marks3);
		s.save(stu);
		t.commit();
		JOptionPane.showMessageDialog(new JDialog(), "Record Added");
	}

	catch(Exception e) {
		JOptionPane.showMessageDialog(new JDialog(), "issue Invalid Input : \n " + e);
	}

	finally {
		s.close();
	}
	}



public static void updateStudent(int rno, String name, int marks1, int marks2, int marks3)
{
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session s = null;
Transaction t = null;
Student stu = null;

	try
	{
		s = sf.openSession();
		t = s.beginTransaction();
		stu = new Student(rno, name, marks1, marks2, marks3);
	        s.update(stu);
		t.commit();
		JOptionPane.showMessageDialog(new JDialog(), "Record Updated ");
	}

	catch(Exception e) {
		JOptionPane.showMessageDialog(new JDialog(), "Record does not exists \n " + e);
	}

	finally {
		s.close();
	}
	}




public static void deleteStudent(int rno)
{
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session s = null;
Transaction t = null;
Student stu = null;

	try
	{
		s = sf.openSession();
		t = s.beginTransaction();
		stu = s.get(Student.class, rno);
	        s.delete(stu);
		t.commit();
		JOptionPane.showMessageDialog(new JDialog(), " Record Deleted ");
	}

	catch(Exception e) {
		JOptionPane.showMessageDialog(new JDialog(), "Record does not exists \n" + e);
	}

	finally {
		s.close();
	}
	}


}

		











