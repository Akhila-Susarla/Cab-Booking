import java.awt.EventQueue;
import java.awt.Graphics;  
import java.awt.Image;  
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Welcome extends JFrame{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome window = new Welcome();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Welcome() {
		
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel CabBooking = new JLabel("CAB BOOKING SYSTEM");
		CabBooking.setFont(new Font("Baskerville Old Face", Font.BOLD, 22));
		CabBooking.setBounds(80, 103, 269, 40);
		frame.getContentPane().add(CabBooking);
		
		JLabel Welcome = new JLabel("WELCOME");
		Welcome.setFont(new Font("Baskerville Old Face", Font.BOLD, 22));
		Welcome.setBounds(154, 25, 124, 54);
		frame.getContentPane().add(Welcome);
		
		JButton ProceedBtn = new JButton("Proceed");
		ProceedBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserInfo Info = new UserInfo();
				Info.setVisible(true);
			}
		});
		ProceedBtn.setFont(new Font("Baskerville Old Face", Font.PLAIN, 15));
		ProceedBtn.setBounds(164, 174, 107, 40);
		frame.getContentPane().add(ProceedBtn);
	}
}
