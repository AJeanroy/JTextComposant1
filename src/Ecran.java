import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ecran extends JFrame implements WindowListener{
	
	private JFrame mFrame = new JFrame();
	private JPanel mPanel = new JPanel();
	private JPanel mPanel2 = new JPanel();
	
	public Ecran(int largeur, int longueur, String title){
		mFrame.setSize(largeur, longueur);
		mFrame.setTitle(title);
	    mFrame.setLocationRelativeTo(null);
	    mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    mPanel.setLayout(new BorderLayout());
	    
	    mFrame.setContentPane(mPanel);
	}
	
	public Ecran(){
		mFrame.setSize(400, 400);
		mFrame.setTitle("Fenetre");
	    mFrame.setLocationRelativeTo(null);
	    mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    mPanel.setLayout(new BorderLayout());
	    
	    mFrame.setContentPane(mPanel);

	}
	
	public void SetVisible(){ mFrame.setVisible(true);}
	
	public JFrame GetFrame(){ return mFrame;}
	
	public JPanel GetPanel(){ 
		return mPanel;
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
