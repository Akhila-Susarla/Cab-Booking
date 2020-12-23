import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class paymentMeth extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paymentMeth frame = new paymentMeth();
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
	public paymentMeth() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Heading = new JLabel("PAYMENT METHOD");
		Heading.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
		Heading.setBounds(84, 13, 255, 26);
		contentPane.add(Heading);
		
		JLabel headingLine = new JLabel("Pick a Payment Method:");
		headingLine.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		headingLine.setBounds(40, 52, 299, 16);
		contentPane.add(headingLine);
		
		JRadioButton Cash = new JRadioButton("Cash");
		Cash.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		Cash.setBounds(34, 77, 127, 25);
		contentPane.add(Cash);
		
		JRadioButton debitCard = new JRadioButton("Debit Card");
		debitCard.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		debitCard.setBounds(34, 114, 127, 25);
		contentPane.add(debitCard);
		
		JRadioButton creditCard = new JRadioButton("Credit Card");
		creditCard.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		creditCard.setBounds(34, 153, 127, 25);
		contentPane.add(creditCard);
		
		JRadioButton Ewallet = new JRadioButton("E-Wallet");
		Ewallet.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		Ewallet.setBounds(34, 188, 127, 25);
		contentPane.add(Ewallet);
		
		JButton NextBtn = new JButton("Next");
		NextBtn.addActionListener(new ActionListener() {
			private Component frame;

			public void actionPerformed(ActionEvent e) {
		
				if(Cash.isSelected())
				{    
					JOptionPane.showMessageDialog(frame,"You have chosen to pay by Cash."); 
				}    
				if(debitCard.isSelected())
				{    
					JOptionPane.showMessageDialog(frame,"You have chosen to pay by Debit Card."); 
				} 
				if(creditCard.isSelected())
				{    
					JOptionPane.showMessageDialog(frame,"You have chosen to pay by Credit Card."); 
				} 
				if(Ewallet.isSelected())
				{    
					JOptionPane.showMessageDialog(frame,"You have chosen to pay by E-Wallet."); 
				} 
				
				confirmation confirmation = new confirmation();
				confirmation.setVisible(true);
			}
		});
		NextBtn.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		NextBtn.setBounds(302, 188, 85, 25);
		contentPane.add(NextBtn);
	}
}
