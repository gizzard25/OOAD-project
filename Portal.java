package ooad;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseWheelEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Portal {
    private JFrame frame=new JFrame();
	private JPanel contentPane;
	//private String fname="";
	//private String lname="";
	private SqlExecution sqlExe=null;

	/**
	 * Launch the application.
	 */
	public static void main(final String fname, final String lname, final SqlExecution sqlExe) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Portal window=new Portal(fname,lname,sqlExe);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Portal(String fname, String lname, SqlExecution sqlExe) {
		//this.fname=fname;
		this.sqlExe=sqlExe;
		//this.lname=lname;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		frame.setContentPane(contentPane);
		
		JLabel welcome = new JLabel("Welcome to flyway, "+fname+" "+lname+"!");
		contentPane.add(welcome, BorderLayout.NORTH);
	}

}
