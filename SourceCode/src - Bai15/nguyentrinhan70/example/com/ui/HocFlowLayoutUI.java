package nguyentrinhan70.example.com.ui;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HocFlowLayoutUI extends JFrame {
	public HocFlowLayoutUI	(String tieude) {
		super(tieude);
		addControls();
	}
	public void addControls () {
		Container con =getContentPane();
		//Tạo JPanel
		JPanel pnFlowLayout = new JPanel();
		pnFlowLayout.setLayout(new FlowLayout());
		JButton btn1 = new JButton("Demo button1");
		JButton btn2 = new JButton("Demo button2");
		JButton btn3 = new JButton("Demo button3");
		JButton btn4 = new JButton("Demo button4");
		JButton btn5 = new JButton("Demo button5");
		
		pnFlowLayout.add(btn1);
		pnFlowLayout.add(btn2);
		pnFlowLayout.add(btn3);
		pnFlowLayout.add(btn4);
		pnFlowLayout.add(btn5);
		
		con.add(pnFlowLayout);
	}
	
	public void showWindow() {
		this.setSize(600, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
