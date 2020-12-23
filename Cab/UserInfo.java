import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserInfo extends JFrame {

	private JPanel contentPane;
	private JTextField NameTextField;
	private JTextField PickUpPointTextField;
	private JTextField DestinationTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInfo frame = new UserInfo();
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
	public UserInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel EnterDetails = new JLabel("Enter Details");
		EnterDetails.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		EnterDetails.setBounds(162, 26, 116, 26);
		contentPane.add(EnterDetails);
		
		JLabel Name = new JLabel("Name:");
		Name.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		Name.setBounds(55, 78, 56, 16);
		contentPane.add(Name);
		
		JLabel PickUpPoint = new JLabel("Pick-up Point:");
		PickUpPoint.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		PickUpPoint.setBounds(55, 117, 116, 16);
		contentPane.add(PickUpPoint);
		
		JLabel Destination = new JLabel("Destination:");
		Destination.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		Destination.setBounds(55, 158, 95, 16);
		contentPane.add(Destination);
		
		NameTextField = new JTextField();
		NameTextField.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		NameTextField.setBounds(203, 75, 165, 22);
		contentPane.add(NameTextField);
		NameTextField.setColumns(10);
		
		PickUpPointTextField = new JTextField();
		PickUpPointTextField.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		PickUpPointTextField.setBounds(203, 114, 165, 22);
		contentPane.add(PickUpPointTextField);
		PickUpPointTextField.setColumns(10);
		
		DestinationTextField = new JTextField();
		DestinationTextField.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		DestinationTextField.setBounds(203, 155, 165, 22);
		contentPane.add(DestinationTextField);
		DestinationTextField.setColumns(10);
		
		JButton nextBtn = new JButton("Next");
		nextBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String UserName = NameTextField.getText();
				String PickUpPoint = PickUpPointTextField.getText();
				String Destination = DestinationTextField.getText();
				
				cabType cabType = new cabType();
				cabType.setVisible(true);
				
			}
		});
		nextBtn.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		nextBtn.setBounds(181, 200, 81, 25);
		contentPane.add(nextBtn);
	}

}
