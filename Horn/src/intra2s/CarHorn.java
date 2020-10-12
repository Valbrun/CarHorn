package intra2s;
import java.awt.Font;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.*;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;


@SuppressWarnings("serial")
public class CarHorn extends JFrame implements ActionListener,Runnable,MouseListener{
	private static String stream ;
	public static CarHorn p;
	
	JButton btnSHorn,btnSHorn2,btnSHorn3,btnSHorn4,btnNew,btnNew2;
	JButton btnhorn1,btnhorn2,btnhorn3,btnhorn4,btnShorn44,btnShorn444,btnShorn222,btnShorn22,btnShorn11,btnShorn111,btnvoice;
	
	Thread t;
	Thread n;
	Thread u;
	Thread v;
	Thread w;
	
	
	//-----------------------------------------------------------------------------	
	  CarHorn()
	  {
		  
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("Mon Application HORN");
			ImageIcon hornIcon = new ImageIcon("pcar.png");
			btnSHorn = new JButton(hornIcon);
			btnSHorn.setBounds(0, 40, 89, 67);
			btnSHorn.addMouseListener(this);
			add(btnSHorn);
			t = new Thread() ;
 		
			ImageIcon btnSHorn22 = new ImageIcon("pcar1.png");
			btnSHorn2 = new JButton(btnSHorn22);
			btnSHorn2.setBounds(109, 40, 89, 67);
			btnSHorn2.addMouseListener(this);
			add(btnSHorn2);
	
			ImageIcon btnSHorn33 = new ImageIcon("firetruck.png");
			 btnSHorn3 = new JButton(btnSHorn33);
			btnSHorn3.setBounds(233, 40, 89, 67);
			btnSHorn3.addMouseListener(this);
			add(btnSHorn3);
			
			ImageIcon btnSHorn44 = new ImageIcon("ambulance.png");
			 btnSHorn4 = new JButton(btnSHorn44);
			btnSHorn4.setBounds(345, 40, 89, 67);
			btnSHorn4.addMouseListener(this);
			add(btnSHorn4);
			
			
			JLabel lblNewLabel = new JLabel("Police & Emergency");
			lblNewLabel.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
			lblNewLabel.setBounds(153, 11, 142, 18);
			add(lblNewLabel);
			
			JLabel lblCarHorn = new JLabel("Car Horn");
			lblCarHorn.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
			lblCarHorn.setBounds(180, 154, 73, 18);
			 add(lblCarHorn);
			
			ImageIcon horn1 = new ImageIcon("car.png"); 
			btnhorn1 = new JButton(horn1);
			btnhorn1.setBounds(0, 183, 89, 67);
			btnhorn1.addMouseListener(this);
			add(btnhorn1);
			
			ImageIcon voice = new ImageIcon("horn2.png"); 
			btnvoice = new JButton(voice);
			btnvoice.setBounds(170, 275, 89, 67);
			btnvoice.addMouseListener(this);
			add(btnvoice);
			
			ImageIcon horn2 = new ImageIcon("truck.png"); 
			 btnhorn2 = new JButton(horn2);
			btnhorn2.setBounds(109, 183, 89, 67);
			btnhorn2.addMouseListener(this);
			add(btnhorn2);
	 
			ImageIcon horn3 = new ImageIcon("bus.png");
			btnhorn3 = new JButton(horn3);
	 		btnhorn3.setBounds(233, 183, 89, 67);
	 		btnhorn3.addMouseListener(this);
			add(btnhorn3);
			
			ImageIcon horn4 = new ImageIcon("alert.png");
			btnhorn4 = new JButton(horn4);
			btnhorn4.setBounds(345, 183, 89, 67);
			btnhorn4.addMouseListener(this);
			add(btnhorn4);
			
			btnNew = new JButton("P");
			btnNew.setBounds(0, 111, 43, 23);
			btnNew.addMouseListener(this);
			 add(btnNew);
			
			 btnNew2  = new JButton("S");
			btnNew2.setBounds(46, 111, 43, 23);
			btnNew2.addMouseListener(this);
			 add(btnNew2);
			 
			 
			 //-------------------
			   btnShorn11 = new JButton("P");
				btnShorn11.setBounds(109, 111, 43, 23);
				btnShorn11.addMouseListener(this);
				 add(btnShorn11);
				
				  btnShorn111 = new JButton("S"); 
				btnShorn111.setBounds(155, 111, 43, 23);
				btnShorn111.addMouseListener(this);
				 add(btnShorn111);
				//-------------------
				 
				//-------------------
				  btnShorn22 = new JButton("P");
				btnShorn22.setBounds(233, 111, 43, 23);
				btnShorn22.addMouseListener(this);
				 add(btnShorn22);
				
				  btnShorn222 = new JButton("S");
				btnShorn222.setBounds(279, 111, 43, 23);
				btnShorn222.addMouseListener(this);
				 add(btnShorn222);
				
				//-------------------
				
				//-------------------
				btnShorn44 = new JButton("P");
				btnShorn44.setBounds(345, 111, 43, 23);
				btnShorn44.addMouseListener(this);
				add(btnShorn44);
				
				btnShorn444 = new JButton("S");
				btnShorn444.setBounds(391, 111, 43, 23);
				btnShorn444.addMouseListener(this);
				add(btnShorn444);
//--------------------------------------------------------------------------------------------------------- 
	
	setLayout(null);
	setBounds(100, 100, 450, 400);;
	setVisible(true);

	}
	 
	 static boolean horn2 = false;
	
	 public static void main(String[] args) throws JavaLayerException{
			// TODO Auto-generated constructor stub

			try {   //Nous avons récupéré le thème Système pour l'interface graphique
				
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (Exception e) {
			System.out.print("LE THEME N'A PAS PU SE LANCER");
		}
			
			
			 p = new CarHorn();
			  p.setLocationRelativeTo(null);
			 p.setResizable(false);	
			 
			
	 }
			 
			 
			 //--------------------------------//

				//  PROJET JAVA REALISE EN 2020 
				//  Professeur Mr. BRUTUS
				//  Ecole Superieure D'infotronique 
			 //--------------------------------//

 
	
	public void run() {
		FileInputStream fis;
 
		try {
			
			fis = new FileInputStream(stream);
		AdvancedPlayer player=new AdvancedPlayer(fis);

		player.play();
		}catch  (FileNotFoundException e) {
			e.printStackTrace();
		}catch  (JavaLayerException e) {
			e.printStackTrace();
		}
	}
	
 
	@Override
	public void mouseClicked(MouseEvent e) {
//		boolean clicked = false;
//		// TODO Auto-generated method stub
//		if(e.getSource()==btnSHorn && e.getClickCount() == 3 && clicked==false ) {
//			stream="ououhloup.mp3";
//			 
//			 System.out.println("2 clicked");
//			t.start();
//			clicked = true;
//		}
//		
//		if(e.getSource()==btnSHorn2 &&  e.getClickCount() == 2 ) {
//			t.stop();
//			 
//			 
//			 System.out.println("1 clicked");
//			 clicked = false;
//			 System.out.println(clicked);
//		}
		
		
	}


	@Override
	public void mouseEntered(MouseEvent ev) {
		// TODO Auto-generated method stub
 
	}


	@Override
	public void mouseExited(MouseEvent ev) {
		// TODO Auto-generated method stub
	 
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnSHorn) {
			stream="phorn.mp3";
			t=new Thread(p);
			t.start();
		}
		
		if(e.getSource()==btnNew) {
			stream="phorn.mp3";
			n=new Thread(p);
			n.start();
		}

		
		if(e.getSource()==btnNew2) {
			n.stop();
		}
		
		if(e.getSource()==btnSHorn2) {
			stream="ouhh.mp3";
			t=new Thread(p);
			t.start();
		}
		
		if(e.getSource()==btnShorn11) {
			stream="ouhh.mp3";
			u=new Thread(p);
			u.start();
		}
		
		if(e.getSource()==btnShorn111) {
 
			u.stop();
		}
			
	
		if(e.getSource()==btnSHorn3) {
			stream="ououhloup.mp3";
			t=new Thread(p);
			t.start();
		}
		
		if(e.getSource()==btnShorn22) {
			stream="ououhloup.mp3";
			v=new Thread(p);
			v.start();
		}
		if(e.getSource()==btnShorn222) {
 
			v.stop();
		}
		
		if(e.getSource()==btnSHorn4) {
			stream="bulance.mp3";
			t=new Thread(p);
			t.start();
		}
		
		
		if(e.getSource()==btnShorn44) {
			stream="bulance.mp3";
			w=new Thread(p);
			w.start();
		}
		
		if(e.getSource()==btnShorn444) {
		 
			w.stop();
		}
//-------------------------------------------------------------------------------------
		
		if(e.getSource()==btnhorn1) {
			stream="Car.mp3";
			t=new Thread(p);
			t.start();
		}
		
		if(e.getSource()==btnhorn2) {
			stream="Truck.mp3";
			t=new Thread(p);
			t.start();
		}
		
		if(e.getSource()==btnhorn3) {
			stream="Bus.mp3";
			t=new Thread(p);
			t.start();
		}
		
		if(e.getSource()==btnhorn4) {
			stream="alarm.mp3";
			t=new Thread(p);
			t.start();
		}
		
		if(e.getSource()==btnvoice) {
			stream="voice.mp3";
			t=new Thread(p);
			t.start();
		}
		
		
		
	}
	

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnSHorn) {
			 
			t.stop();
//			t.destroy();
		}
		if(e.getSource()==btnSHorn2) {
			 
			t.stop();
//			t.destroy();
		}
		
		if(e.getSource()==btnSHorn3) {
			 
			t.stop();
//			t.destroy();
		}
		
		if(e.getSource()==btnSHorn4) {
			 
			t.stop();
//			t.destroy();
		}
		
		if(e.getSource()==btnvoice) {
			t.stop();
		}

		if(e.getSource()==btnhorn1) {
			t.stop();
		}
		
		if(e.getSource()==btnhorn2) {
			t.stop();
		}
		
		if(e.getSource()==btnhorn3) {
			t.stop();
		}
		
		if(e.getSource()==btnhorn4) {
			t.stop();
		}		

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		

	}
	
}
	
	 
