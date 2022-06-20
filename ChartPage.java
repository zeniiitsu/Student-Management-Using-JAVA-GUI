import javax.swing.*;			//JFrame
import org.jfree.data.category.*;	//DefaultCategoryDatasest
import org.jfree.chart.*;		//ChartFactory
import org.jfree.chart.plot.*;		//PlotOrientation
import java.io.*;
import java.sql.*;


class ChartPage extends JFrame {

ChartPage() {

try
{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system" , "abc123");

String sql = "select * from student";
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery(sql);

//s1 : Prepare the data set
DefaultCategoryDataset ds = new DefaultCategoryDataset();
while(rs.next()) {
ds.addValue(rs.getInt(3), rs.getString(2), "Sub1");
ds.addValue(rs.getInt(4), rs.getString(2), "Sub2");
ds.addValue(rs.getInt(5), rs.getString(2), "Sub3");
}

//s2 : design the chart
JFreeChart ch = ChartFactory.createBarChart("Class A", "Subject", "Marks", ds, PlotOrientation.VERTICAL, true, true, false);

//s3 : display the chart
ChartPanel cp = new ChartPanel(ch);
setContentPane(cp);


//s4 : save the chart
try {
	File f = new File("ClassA.jpeg");
	ChartUtilities.saveChartAsJPEG(f, ch, 700, 400);

}
 catch(IOException e) { System.out.println(e); }

setSize(400, 400);
setLocationRelativeTo(null);
setTitle("Performace of FE Students");
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
setVisible(true);
}
catch(SQLException e)
{ JOptionPane.showMessageDialog(new JDialog(), "issue " + e);
}
}
}


