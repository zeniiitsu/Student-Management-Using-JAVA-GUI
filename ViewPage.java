import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.io.*;
import java.util.*;

class ViewPage extends JFrame {
Container c;
TextArea StuData;
JButton btnBack;


ViewPage()
{

c = getContentPane();


Font f = new Font("Comic Sans MS",Font.BOLD, 25);
Font f1 = new Font(Font.SERIF, Font.PLAIN,  19);
Color  Tej   = new Color(157, 218, 240);

c.setLayout(new FlowLayout(FlowLayout.CENTER, 25, 20));

c.setBackground(Tej);

StuData = new TextArea(10, 50);



btnBack = new JButton("Back");

/*
btnAdd.setBounds(10, 20, 100, 20);
btnView.setBounds(10, 100, 100, 20);
btnUpdate.setBounds(100, 20, 100, 20);
btnDelete.setBounds(100, 100, 100, 20);
btnChart.setBounds(150, 75, 100, 20);*/

    
btnBack.setFont(f);



c.add(StuData);
c.add(btnBack);



ActionListener a2 = (ae) -> {MainPage a = new MainPage(); 
dispose(); };
btnBack.addActionListener(a2);

setTitle("View STUDENT");
setSize(450, 300);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}





/*class DeletePageTest {
public static void main(String args[]) {
DeletePage a = new DeletePage();
}
}*/

