import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class waiting extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					waiting frame = new waiting();
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
	public waiting() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel pleaseWaitFor = new JLabel("Waiting Time:");
		pleaseWaitFor.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		pleaseWaitFor.setBounds(31, 44, 123, 16);
		contentPane.add(pleaseWaitFor);
		
		
		int wait = (int)((Math.random()*((10-2)+1))+1);
		String waitTime = Integer.toString(wait);
		JLabel waitingTime = new JLabel(waitTime);
		waitingTime.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		waitingTime.setBounds(316, 44, 56, 16);
		contentPane.add(waitingTime);
		
		JLabel restOfTheLine = new JLabel("(for the cab to arrive at your location)");
		restOfTheLine.setFont(new Font("Baskerville Old Face", Font.PLAIN, 16));
		restOfTheLine.setBounds(31, 73, 236, 28);
		contentPane.add(restOfTheLine);
		
		JLabel mins = new JLabel("mins");
		mins.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		mins.setBounds(345, 44, 56, 16);
		contentPane.add(mins);
		
		JLabel ThankYou = new JLabel("THANK YOU for choosing to ride with us!!!");
		ThankYou.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		ThankYou.setBounds(17, 130, 394, 75);
		contentPane.add(ThankYou);
	}

}
