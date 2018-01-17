package intro_to_array_lists;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JFrame frame = new JFrame();
		JPanel panel = new JPanel();
			JButton btn1 = new JButton();
			JButton btn2 = new JButton();
			JButton btn3 = new JButton();
			JLabel lbl1 = new JLabel();
	
	ArrayList<String> names = new ArrayList<String>();
	
	public void setup() {
		panel.add(lbl1);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		
		frame.add(panel);
		
		lbl1.setText("Pick one");
		btn1.setText("Add Name");
		btn2.setText("View Names");
		btn3.setText("Clear List");
		btn3.setForeground(Color.RED);
		btn3.setOpaque(true);
		
		frame.pack();
		frame.setVisible(true);
		
		names.add("Bob Banders");
		names.add("Sandy Summers");
		names.add("Greg Ganders");
		names.add("Donny Doners");
		
		btn1.addActionListener(new AddButtonHandler());
		btn2.addActionListener(new ViewButtonHandler());
		btn3.addActionListener(new ClearButtonHandler());
	}
		
	class ViewButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null, String.join("\n", names));
		}
	}
	
	class AddButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			names.add(JOptionPane.showInputDialog("Input name:"));
		}
	}
	
	class ClearButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			names.clear();
		}
		
	}
}