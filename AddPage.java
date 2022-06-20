import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.io.*;


class AddPage extends JFrame {
Container c;
JButton btnSave, btnBack;
JLabel lblRno, lblName, lblMarks1, lblMarks2, lblMarks3;
JTextField txtRno, txtName, txtMarks1, txtMarks2, txtMarks3;

AddPage()
{

c = getContentPane();
Font f = new Font("Comic Sans MS",Font.BOLD, 25);
Font f1 = new Font(Font.SERIF, Font.PLAIN,  21);
Color  Tej   = new Color(157, 218, 240);

c.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));
c.setBackground(Tej);

lblRno = new JLabel("Enter Roll number");
txtRno = new JTextField(35);
txtRno.requestFocus(true);
lblName = new JLabel("Enter Name");
txtName = new JTextField(35);
lblMarks1 = new JLabel("Enter Sub Marks 1");
txtMarks1 = new JTextField(35);
lblMarks2 = new JLabel("Enter Sub Marks 2");
txtMarks2 = new JTextField(35);
lblMarks3 = new JLabel("Enter Sub Marks 3");
txtMarks3 = new JTextField(35);
btnSave = new JButton("Save");
btnBack = new JButton("Back");


lblRno.setFont(f);
lblName.setFont(f);
lblMarks1.setFont(f);
lblMarks2.setFont(f);
lblMarks3.setFont(f);
txtRno.setFont(f1);
txtName.setFont(f1);
txtMarks1.setFont(f1);
txtMarks2.setFont(f1);
txtMarks3.setFont(f1);
btnSave.setFont(f);
btnBack.setFont(f);

txtRno.setHorizontalAlignment(JTextField.CENTER);
txtName.setHorizontalAlignment(JTextField.CENTER);
txtMarks1.setHorizontalAlignment(JTextField.CENTER);
txtMarks2.setHorizontalAlignment(JTextField.CENTER);
txtMarks3.setHorizontalAlignment(JTextField.CENTER);


/*
btnAdd.setBounds(10, 20, 100, 20);
btnView.setBounds(10, 100, 100, 20);
btnUpdate.setBounds(100, 20, 100, 20);
btnDelete.setBounds(100, 100, 100, 20);
btnChart.setBounds(150, 75, 100, 20);*/


c.add(lblRno);
c.add(txtRno);
c.add(lblName);
c.add(txtName);
c.add(lblMarks1);
c.add(txtMarks1);
c.add(lblMarks2);
c.add(txtMarks2);
c.add(lblMarks3);
c.add(txtMarks3);
c.add(btnSave);
c.add(btnBack);




ActionListener a1 = (ae) -> {

if(txtRno.getText().isEmpty()) {

JOptionPane.showMessageDialog(new JDialog(), "Rno should not be empty");

}

else if(Integer.parseInt(txtRno.getText()) < 1 ) {

JOptionPane.showMessageDialog(new JDialog(), "Rno should be greater than zero"); }

else if(txtName.getText().isEmpty()) {

JOptionPane.showMessageDialog(new JDialog(), "Name should not be empty"); 

}

else if((txtName.getText().length()) < 2 ) {

JOptionPane.showMessageDialog(new JDialog(), "Name should be of two or more than two letters");

}

else if(txtMarks1.getText().isEmpty()) {

JOptionPane.showMessageDialog(new JDialog(), "Marks 1 should not be empty");

 }

else if (Integer.parseInt(txtMarks1.getText()) < 0 | Integer.parseInt(txtMarks1.getText())  > 100 ) {

JOptionPane.showMessageDialog(new JDialog(), "Marks 1 should be in range of 0 to 100");

}

else if(txtMarks2.getText().isEmpty()) {

JOptionPane.showMessageDialog(new JDialog(), "Marks 2 should not be empty");

 }

else if (Integer.parseInt(txtMarks2.getText()) < 0 | Integer.parseInt(txtMarks2.getText())  > 100 ) {

JOptionPane.showMessageDialog(new JDialog(), "Marks 2 should be in range of 0 to 100");

}

else if(txtMarks3.getText().isEmpty()) {

JOptionPane.showMessageDialog(new JDialog(), "Marks 3 should not be empty");

 }

else if (Integer.parseInt(txtMarks3.getText()) < 0 | Integer.parseInt(txtMarks3.getText())  > 100 ) {

JOptionPane.showMessageDialog(new JDialog(), "Marks 3 should be in range of 0 to 100");

}


else {
int rno = Integer.parseInt(txtRno.getText());
String name = txtName.getText();
int marks1 = Integer.parseInt(txtMarks1.getText());
int marks2 = Integer.parseInt(txtMarks2.getText());
int marks3 = Integer.parseInt(txtMarks3.getText());
NewDbHandler.addStudent(rno, name, marks1, marks2, marks3);
txtRno.setText("");
txtName.setText("");
txtMarks1.setText("");
txtMarks2.setText("");
txtMarks3.setText("");
txtRno.requestFocus();}

 };
btnSave.addActionListener(a1);

ActionListener a2 = (ae) -> { MainPage a = new MainPage(); dispose(); };
btnBack.addActionListener(a2);


setTitle("Add STUDENT");
setSize(600, 600);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}



/*class A2Test {
public static void main(String args[]) {
A2 a = new A2();
}
}
*/

