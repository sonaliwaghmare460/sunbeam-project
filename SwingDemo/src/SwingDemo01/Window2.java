package SwingDemo01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Window2 extends JFrame {
	private JLabel nameLabel;
	private JLabel genderLabel;
	private JLabel hobbyLabel;
	private JTextField nameTextField;
	private JButton submitButton;
	private JRadioButton maleRadioButton, femalRadioButton;
	private ButtonGroup genderButtonGroup;

	
	public Window2() {
		//initialize window
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("second window");
		this.setLayout(null);
		
		
		// add components
		nameLabel = new JLabel("Name:");
		nameLabel.setBounds(50, 50, 80, 30);
		this .add(nameLabel);
		nameTextField = new JTextField();
		nameTextField.setBounds(150, 50, 150, 30);
        this.add(nameTextField);
				
		genderLabel = new JLabel("gender:");
		genderLabel.setBounds(50, 100, 80, 30);
		this.add(genderLabel);
		
		genderButtonGroup = new ButtonGroup();
		
		maleRadioButton = new JRadioButton("Male");
		maleRadioButton.setBounds(150, 100, 80, 30);
		this.add(maleRadioButton);
		//maleRadioButton.setSelected(true);
		genderButtonGroup.add(maleRadioButton);
		maleRadioButton.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				System.out.println("male RadioButton Selected:" + maleRadioButton.isSelected());
			}
		});
		
		
		
		
		
		femalRadioButton = new JRadioButton("female");
		femalRadioButton.setBounds(250, 100, 80, 30);
		this.add(femalRadioButton);
		genderButtonGroup.add(femalRadioButton);
        femalRadioButton.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				System.out.println("femal RadioButton Selected:" + femalRadioButton.isSelected());
			}
		});

		
		
		hobbyLabel = new JLabel("hobby:");
		hobbyLabel.setBounds(50, 150, 80, 30);
		this .add(hobbyLabel);
		
		submitButton = new JButton("Submit");
		submitButton.setBounds(100, 200, 80, 30);
		this.add(submitButton);
	
		
		
			submitButton.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					String text = nameTextField.getText();
					System.out.println("TextField text:" + text);
					text = text.toUpperCase();
					nameTextField.setText(text);
					
				}
				});
			}
	
	
	public static void main(String args[]) {
		Window2  w = new Window2();
		w.setSize(600, 400);
		w.setVisible(true);
	}
	
}