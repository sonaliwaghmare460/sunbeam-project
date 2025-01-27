package SwingDemo01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window01 extends JFrame {
	private JButton submitButton;
	private JButton clickButton;
	
	public Window01() {
		// initialize window
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("First Window");
		this.setLayout(null);
		
		// add components
		class ButtonActionListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
                System.out.println("Button Is Clicked!");
               JButton btn = (JButton) e.getSource();
               System.out.println("Button title: "+btn.getText());
               String command = e.getActionCommand();
               System.out.println("Action Command:" + command);
               if(command.equals("BTN1")) {
            	   System.out.println("Submit button is clicked....");
               }
               else if(command.equals("BTN2")) {
            	   System.out.println("click button is clicked");
               }
			}
			
		}
		ButtonActionListener actionListener = new ButtonActionListener();
		
		
		submitButton = new JButton();
        submitButton.setText("Submit");	
        submitButton.setBounds(100, 150, 80, 30);
        submitButton.setActionCommand("BTN1");

                             //x     y    w   h
        this.add(submitButton);
        submitButton.addActionListener(actionListener);
       
        /*submitButton.addActionListener( new ActionListener() {
        	 

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Submit Button is Clicked!");                        
				 
			}
        });
        */
        
        clickButton = new JButton();
        clickButton.setText("click");	
        clickButton.setBounds(250, 150, 80, 30);
        clickButton.setActionCommand("BTN2");
        this.add(clickButton);
        clickButton.addActionListener(actionListener);
        
       /* clickButton.addActionListener( new ActionListener() {
       	 @Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button object:" + e.getSource());
				System.out.println("Button Action Command:" + e.getActionCommand());
				System.out.println("Click Button is Clicked!");                        
				 
			}
        });
		
	*/
	}
	public static void main(String args[])
	{
		Window01 w = new Window01();
		w.setSize(600, 400);
		w.setVisible(true);
	}

}
