package Helper;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HelperStartGameDialog extends JDialog implements ActionListener{
	
	private String message;
	private boolean result;
	
	public HelperStartGameDialog(){
		super();
		this.message = "Drücken Sie auf den Button, um das Spiel zu starten";
		this.result = false;
		setTitle("Start");
		setResizable(false);
		setModal(true);
		
		//this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		JPanel messagePanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		//Label
		JLabel label = new JLabel(this.message);
		messagePanel.add(label);
		panel.add(messagePanel);
		
		//Button
		JButton startButton = new JButton("Start");
		buttonPanel.add(startButton);
		startButton.addActionListener(this);
		panel.add(buttonPanel);
		
		this.add(panel);
		
		setLocation((Toolkit.getDefaultToolkit().getScreenSize().width)/2 - getWidth()/2, (Toolkit.getDefaultToolkit().getScreenSize().height)/2 - getHeight()/2);

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        //Setzt Fenstergröße automatisch
        pack();
        setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.result = true;
		setVisible(false);
		dispose();
	}
	
	public boolean getResult(){
		return this.result;
	}
	
//	public static void main(String[] args) {
//		HelperStartGameDialog dialog = new HelperStartGameDialog();
//	}
}
