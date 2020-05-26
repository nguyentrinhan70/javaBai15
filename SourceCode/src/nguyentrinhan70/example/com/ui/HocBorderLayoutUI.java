package nguyentrinhan70.example.com.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HocBorderLayoutUI extends JFrame{
	public HocBorderLayoutUI(String tieude) {
		// TODO Auto-generated constructor stub
		this.setTitle(tieude);
		addControls();
	}

	public void addControls() {

		Container con = getContentPane();
		JPanel pnBorderLayout = new JPanel();
		pnBorderLayout.setLayout(new BorderLayout());
		JPanel pnSouth = new JPanel();
		pnSouth.setBackground(Color.CYAN);
		//pnBorderLayout.add(pnSouth,BorderLayout.SOUTH);
		pnSouth.setPreferredSize(new Dimension(0, 100));

		JButton btn = new JButton("Nút Button");
		pnBorderLayout.add(btn,BorderLayout.SOUTH);

		JPanel pnEast = new JPanel();
		pnEast.setBackground(Color.GREEN);
		pnBorderLayout.add(pnEast,BorderLayout.EAST);
		pnEast.setPreferredSize(new Dimension(100, 0));

		JPanel pnWest = new JPanel();
		pnWest.setBackground(Color.PINK);
		pnBorderLayout.add(pnWest,BorderLayout.WEST);
		pnWest.setPreferredSize(new Dimension(100, 0));
		JPanel pnCenter = new JPanel();
		pnCenter.setBackground(Color.red);
		pnBorderLayout.add(pnCenter);
		con.add(pnBorderLayout);

		JPanel pnNorth = new JPanel();
		pnNorth.setBackground(Color.darkGray);
		pnBorderLayout.add(pnNorth, BorderLayout.NORTH);
		pnNorth.setPreferredSize(new Dimension(0, 100));;
	}

	public void showWindow() {
		this.setSize(600, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
