import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class confirmation extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					confirmation frame = new confirmation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public confirmation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Heading = new JLabel("CONFIRMATION");
		Heading.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
		Heading.setBounds(108, 13, 211, 26);
		contentPane.add(Heading);
		
		JLabel headingSentence = new JLabel("Would you like to confirm the booking?");
		headingSentence.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		headingSentence.setBounds(56, 102, 316, 16);
		contentPane.add(headingSentence);
		
		JButton No = new JButton("NO");
		No.addActionListener(new ActionListener() {
			private Component frame;

			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(frame,"Your Booking has been cancelled!");
			}
		});
		No.setForeground(Color.RED);
		No.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		No.setBounds(97, 156, 84, 25);
		contentPane.add(No);
		
		JButton Yes = new JButton("YES");
		Yes.addActionListener(new ActionListener() {
			private Component frame;

			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(frame,"Your Booking has been confirmed!");
				
				waiting waiting = new waiting();
				waiting.setVisible(true);
			}
		});
		Yes.setForeground(Color.GREEN);
		Yes.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		Yes.setBounds(239, 156, 84, 25);
		contentPane.add(Yes);
	}

}
