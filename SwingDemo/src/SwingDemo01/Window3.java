package SwingDemo01;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.security.auth.Subject;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.Spring;

public class Window3 extends JFrame {
	private JComboBox<String>subjectComboBox;
	private DefaultComboBoxModel<String>subjectComboModel;
	
	
	public Window3() {
		//initialize window
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Third Window");
		this.setLayout(null);
		
		//initialized components
		String[] subjects = {"JAVA","BIG DATA","DATABASE","LINUX"};
		subjectComboModel = new DefaultComboBoxModel<>(subjects);
		subjectComboBox = new JComboBox<>(subjectComboModel);
		subjectComboBox.setBounds(100,100,100,30);
		this.add(subjectComboBox);
		subjectComboBox.setSelectedIndex(2);
		subjectComboBox.addItemListener(new ItemListener()
		{
			public void itemStateChanged1(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED) {
				String item	=(String) e.getItem();
				System.out.println("Selected Item: "+ item);
				int index = subjectComboBox.getSelectedIndex();
				System.out.println("Selected Index: "+ index);
				item = (String)subjectComboBox.getSelectedItem();
				System.out.println("Selected Item: "+ item);
				
			}
			}

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	public static void main(String[] args) {
		Window3 w = new Window3();
		w.setSize(600,400);
		w.setVisible(true);
	}

}