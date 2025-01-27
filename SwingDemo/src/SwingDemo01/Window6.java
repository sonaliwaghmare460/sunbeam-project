package SwingDemo01;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

	public class Window6 extends JFrame {
		private JButton messageboxButton;
		private JButton confirmButton;
		private JButton inputButton;
		
		public Window6() {
			// initialize window
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setTitle("Sixth Window");
			this.setLayout(null);	
			// initialize components
			messageboxButton = new JButton("Message Box");
			messageboxButton.setBounds(100, 100, 160, 30);
			this.add(messageboxButton);
			messageboxButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(Window6.this, "Hello, World!!");
				}
			});

			confirmButton = new JButton("Are you sure?");
			confirmButton.setBounds(100, 175, 160, 30);
			this.add(confirmButton);
			confirmButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int selOption = JOptionPane.showConfirmDialog(Window6.this, "Please confirm your choice...");
					if(selOption == JOptionPane.YES_OPTION)
						System.out.println("You said YES!");
					else if(selOption == JOptionPane.NO_OPTION)
						System.out.println("You said NO!");
					else if(selOption == JOptionPane.CANCEL_OPTION)
						System.out.println("You said CANCEL!");
				}
			});

			inputButton = new JButton("Your Name?");
			inputButton.setBounds(100, 250, 160, 30);
			this.add(inputButton);
			inputButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String name = JOptionPane.showInputDialog(Window6.this, "Enter your name...");
					System.out.println("Hello, " + name);
				}
			});
		}
		
		public static void main(String[] args) {
			Window6 w = new Window6();
			w.setSize(600, 400);
			w.setVisible(true);
		}
	}


