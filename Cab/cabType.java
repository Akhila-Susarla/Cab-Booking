import java.lang.String;
import java.text.DecimalFormat;
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


public class cabType extends JFrame {

	private JPanel contentPane;
	protected Component frame;
	
	//public static String cabType = new String();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		

		//String cabType = new String("null");
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cabType frame = new cabType();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*public void traveltime(){
    	float d=(float) ((Math.random()*((50.0-10.0)+1.0))+10.0);
    	if(d<20) {
    		int t = (int)((Math.random()*((35.0-20.0)+1.0))+20.0);
    	}
    	else if(d>=20 && d<30) {
    		int t = (int)((Math.random()*((55.0-35.0)+1.0))+35.0);
    	}
    	else if(d>=30 && d<40) {
    		int t = (int)((Math.random()*((75.0-55.0)+1.0))+55.0);
    	}
    	else {
    		int t = (int)((Math.random()*((90.0-75.0)+1.0))+75.0);
    	}
    }
	
	/*public void getdistance() {
    	DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("You are "+ df.format(d) +" km away from your destination.");
    }
	
	/**
	 * Create the frame.
	 */
	public cabType() {
		
		//int cab;
		
		/*boolean CabMini = false;
		boolean CabPrime = false;
		boolean CabSUV = false;*/
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel CabType = new JLabel("Cab Type");
		CabType.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		CabType.setBounds(163, 27, 86, 16);
		contentPane.add(CabType);
		
		JLabel CabTypeDescription = new JLabel("Select a Cab of you preference (pick any one): ");
		CabTypeDescription.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		CabTypeDescription.setBounds(27, 69, 366, 16);
		contentPane.add(CabTypeDescription);
		
		JRadioButton MiniCabBtn = new JRadioButton("Mini");
		MiniCabBtn.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		MiniCabBtn.setBounds(41, 94, 127, 25);
		contentPane.add(MiniCabBtn);
		String cabTypeMini = new String("Mini");
		
		JRadioButton PrimeCabBtn = new JRadioButton("Prime");
		PrimeCabBtn.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		PrimeCabBtn.setBounds(41, 138, 127, 25);
		contentPane.add(PrimeCabBtn);
		String cabTypePrime = new String("Prime");
		
		JRadioButton SUVCabBtn = new JRadioButton("SUV");
		SUVCabBtn.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		SUVCabBtn.setBounds(41, 182, 127, 25);
		contentPane.add(SUVCabBtn);
		String cabTypeSUV = new String("Prime");
		
		JButton nextBtn = new JButton("Next");
		nextBtn.addActionListener(new ActionListener() {
			private String cab;

			public void actionPerformed(ActionEvent e) {
				
				/*DecimalFormat df = new DecimalFormat("0.00");
				
				if(MiniCabBtn.isSelected()){
					System.out.println("You have chosen a Mini cab\nThere are "+(int)((Math.random()*((6.0-2.0)+1))+2.0)+" cabs around you\nEstimated travel time:" + t +" min");
					System.out.println("Estimated Price:Rs."+df.format((float)(50.0+(d-2.0)*13.0))+"/-");
				}
				else if(PrimeCabBtn.isSelected()) {
					System.out.println("You have chosen a Prime cab\nThere are "+(int)((Math.random()*((6.0-2.0)+1))+2.0)+" cabs around you\nEstimated travel time:" + t +" min");
					System.out.println("Estimated price: Rs."+df.format((float)(55.0+(d-2.0)*15.0))+"/-");
				}
				else if(SUVCabBtn.isSelected()) {
					System.out.println("You have chosen an SUV cab\nThere are "+(int)((Math.random()*((6.0-2.0)+1))+2.0)+" cabs around you\nEstimated travel time" + t + "min");
					System.out.println("Estimated Price: Rs." + df.format((float)(60.0+(d-2.0)*17.0))+"/-");
				}
				else {
					System.out.println("Invalid!");
					System.exit(1);
				}*/
				
				if(MiniCabBtn.isSelected())
				{    
					//int cab = 1;
					//boolean CabMini = true;
					JOptionPane.showMessageDialog(frame,"You have chosen a Mini cab."); 
		            String cab = new String("Mini");
		            nextPage page=new nextPage(cab);
		            page.setVisible(true);
		            

					nextPage nextPage = new nextPage(cab);
					nextPage.setVisible(true);
				}    
				if(PrimeCabBtn.isSelected())
				{    
					//int cab = 2;
					//boolean CabPrime = true;
					JOptionPane.showMessageDialog(frame,"You have chosen a Prime cab."); 

		            String cab1 = new String("Prime");
		            nextPage page=new nextPage(cab1);
		            page.setVisible(true);
		            

					nextPage nextPage = new nextPage(cab1);
					nextPage.setVisible(true);
				}    
				if(SUVCabBtn.isSelected())
				{   
					//int cab = 3;
					//boolean CabSUV = true;
					JOptionPane.showMessageDialog(frame,"You have chosen an SUV cab.");    

		            String cab2 = new String("SUV");
		            nextPage page=new nextPage(cab2);
		            page.setVisible(true);
		            

					nextPage nextPage = new nextPage(cab2);
					nextPage.setVisible(true);
				}
				
				
			}
		});
		nextBtn.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		nextBtn.setBounds(289, 194, 80, 25);
		contentPane.add(nextBtn);
	}
}
