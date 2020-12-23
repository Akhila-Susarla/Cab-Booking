import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class nextPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nextPage frame = new nextPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param cab 
	 */
	public nextPage(String cab) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//DecimalFormat df = new DecimalFormat("0.00");
		
		//no.of cabs
		
		JLabel noofCabsText = new JLabel("Number of cabs aound you:");
		noofCabsText.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		noofCabsText.setBounds(41, 56, 219, 16);
		contentPane.add(noofCabsText);

		int number = (int) ((Math.random()*((6-2)+1))+2);
		//float num = df.format(number);
		String Number = Integer.toString(number);
		JLabel noofCabsNumber = new JLabel(Number);
		noofCabsNumber.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		noofCabsNumber.setBounds(327, 56, 56, 16);
		contentPane.add(noofCabsNumber);
		
		
		//no.of kilometers (distance)
		
		JLabel Kilometers = new JLabel("Distance from your destination: ");
		Kilometers.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		Kilometers.setBounds(41, 85, 252, 16);
		contentPane.add(Kilometers);
		
		DecimalFormat df = new DecimalFormat("0.00");

    	float d=(float) ((Math.random()*((50.0-10.0)+1.0))+10.0);
		//System.out.println("You are "+ df.format(d) +" km away from your destination.");
    	String dist = Float.toString(d);
		JLabel distance = new JLabel(dist);
		distance.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		distance.setBounds(327, 85, 56, 16);
		contentPane.add(distance);
		
		
		//travel time
		int t;
		if(d<20) {
    		t = (int)((Math.random()*((35-20)+1))+20);
    	}
    	else if(d>=20 && d<30) {
    		t = (int)((Math.random()*((55-35)+1))+35);
    	}
    	else if(d>=30 && d<40) {
    		t = (int)((Math.random()*((75-55)+1))+55);
    	}
    	else {
    		t = (int)((Math.random()*((90-75)+1))+75);
    	}
		String travelTime = Integer.toString(t);
		JLabel TravelTimeText = new JLabel("Travel Time: ");
		TravelTimeText.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		TravelTimeText.setBounds(41, 114, 111, 16);
		contentPane.add(TravelTimeText);
		
		JLabel time = new JLabel(travelTime);
		time.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		time.setBounds(327, 114, 56, 16);
		contentPane.add(time);
		
		
		//estimated price
		
		//cabType.class(cab)
		float price;
		price = (float)(50.0+(d-2.0)*13.0);
		
		String Price = Float.toString(price);
		//Estimated Price:Rs."+df.format((float)(50.0+(d-2.0)*13.0))+"/-";
		JLabel PriceLabel = new JLabel("Price (in Rupees):");
		PriceLabel.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		PriceLabel.setBounds(41, 143, 252, 16);
		contentPane.add(PriceLabel);
		
		JLabel priceCalculated = new JLabel(Price);
		priceCalculated.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		priceCalculated.setBounds(327, 143, 56, 16);
		contentPane.add(priceCalculated);
		
		JButton NextBtn = new JButton("Next");
		NextBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				paymentMeth paymentMeth = new paymentMeth();
				paymentMeth.setVisible(true);
			}
		});
		NextBtn.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		NextBtn.setBounds(267, 191, 97, 25);
		contentPane.add(NextBtn);
		
		JLabel km = new JLabel("km");
		km.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		km.setBounds(381, 85, 28, 16);
		contentPane.add(km);
		
		JLabel mins = new JLabel("mins");
		mins.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		mins.setBounds(376, 114, 33, 16);
		contentPane.add(mins);
		
		JLabel rate = new JLabel("/-");
		rate.setFont(new Font("Baskerville Old Face", Font.BOLD, 18));
		rate.setBounds(376, 143, 244, 16);
		contentPane.add(rate);
	}

	public nextPage() {
		getContentPane().setLayout(null);
		// TODO Auto-generated constructor stub
	}
}
