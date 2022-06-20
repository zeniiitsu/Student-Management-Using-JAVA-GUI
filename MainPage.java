import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.io.*;

class MainPage extends JFrame {
Container c;
JButton btnAdd, btnView, btnUpdate, btnDelete, btnChart;


MainPage()
{

c = getContentPane();
Font f = new Font("Comic Sans MS",Font.BOLD, 25);
FlowLayout f1 = new FlowLayout(FlowLayout.CENTER, 50, 40);
c.setLayout(f1);
Color  Tej   = new Color(157, 218, 240);
c.setBackground(Tej);

btnAdd = new JButton("Add");
btnView = new JButton("view");
btnUpdate = new JButton("Update");
btnDelete = new JButton("Delete");
btnChart = new JButton("Chart");

/*
btnAdd.setBounds(10, 20, 100, 20);
btnView.setBounds(10, 100, 100, 20);
btnUpdate.setBounds(100, 20, 100, 20);
btnDelete.setBounds(100, 100, 100, 20);
btnChart.setBounds(150, 75, 100, 20);*/


btnAdd.setFont(f);
btnView.setFont(f);
btnUpdate.setFont(f);
btnDelete.setFont(f);
btnChart.setFont(f);

c.add(btnAdd);
c.add(btnView);
c.add(btnUpdate);
c.add(btnDelete);
c.add(btnChart);


ActionListener a1 = (ae) -> {AddPage a = new AddPage(); dispose(); };
btnAdd.addActionListener(a1);

ActionListener a2 = (ae) -> {ViewPage a = new ViewPage(); 
dispose(); };
btnView.addActionListener(a2);

ActionListener a3 = (ae) -> {UpdatePage a = new UpdatePage(); dispose(); };
btnUpdate.addActionListener(a3);

ActionListener a4 = (ae) -> {DeletePage a = new DeletePage(); dispose(); };
btnDelete.addActionListener(a4);

ActionListener a5 = (ae) -> {ChartPage a = new ChartPage();};
btnChart.addActionListener(a5);



setTitle("S.M.S");
setSize(350, 300);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}



/*class A1Test {
public static void main(String args[]) {
A1 a = new A1();
}
}
*/

