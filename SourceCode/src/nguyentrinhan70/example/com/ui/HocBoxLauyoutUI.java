package nguyentrinhan70.example.com.ui;

import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HocBoxLauyoutUI extends JFrame{
	public   HocBoxLauyoutUI(String tieude) {
		// TODO Auto-generated constructor stub
		super(tieude);
		addControls();
	}
		
	public void addControls() {
		Container con = getContentPane();
		JPanel pnBox = new JPanel();
		pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.X_AXIS));
		
		JButton btn1 = new JButton("Demo button 1");
		JButton btn2 = new JButton("Demo button 2");
		JButton btn3 = new JButton("Demo button 3");
		JButton btn4 = new JButton("Demo button 4");
		JButton btn5 = new JButton("Demo button 5");
		
		pnBox.add(btn1);
		pnBox.add(btn2);
		pnBox.add(btn3);
		pnBox.add(btn4);
		pnBox.add(btn5);
		
		con.add(pnBox);
	}
	public void showWindow() {
		
		this.setSize(600, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
