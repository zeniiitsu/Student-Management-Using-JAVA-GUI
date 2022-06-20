import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.io.*;

class DeletePage extends JFrame {
Container c;
JButton btnDelete, btnBack;
JLabel lblRno;
JTextField txtRno;


DeletePage()
{

c = getContentPane();


Font f = new Font("Comic Sans MS",Font.BOLD, 25);
Font f1 = new Font(Font.SERIF, Font.PLAIN,  19);
Color  Tej   = new Color(157, 218, 240);

c.setLayout(new FlowLayout(FlowLayout.CENTER, 25, 20));

c.setBackground(Tej);

lblRno = new JLabel("Enter Roll number");
txtRno = new JTextField(30);
btnDelete = new JButton("Delete");
btnBack = new JButton("Back");

/*
btnAdd.setBounds(10, 20, 100, 20);
btnView.setBounds(10, 100, 100, 20);
btnUpdate.setBounds(100, 20, 100, 20);
btnDelete.setBounds(100, 100, 100, 20);
btnChart.setBounds(150, 75, 100, 20);*/

lblRno.setFont(f);
txtRno.setFont(f1);
btnDelete.setFont(f);
btnBack.setFont(f);

txtRno.setHorizontalAlignment(JTextField.CENTER);

c.add(lblRno);
c.add(txtRno);
c.add(btnDelete);
c.add(btnBack);


ActionListener a1 = (ae) -> {

if (txtRno.getText().isEmpty())
{

JOptionPane.showMessageDialog(new JDialog(), "Rno should not be empty");

}

else {

int rno = Integer.parseInt(txtRno.getText());
NewDbHandler.deleteStudent(rno);

}

};
btnDelete.addActionListener(a1);

ActionListener a2 = (ae) -> { MainPage a = new MainPage(); dispose(); };
btnBack.addActionListener(a2);

setTitle("Delete STUDENT");
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

