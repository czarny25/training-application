package UserInterface;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JSplitPane;

import java.awt.GridLayout;

import javax.swing.JButton;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

public class Main {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 905, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 2), null), new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Button panels", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))));
		panel.setBounds(10, 11, 318, 502);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(23, 450, 126, 23);
		panel.add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setBounds(135, 30, 152, 23);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(135, 64, 152, 23);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(135, 98, 152, 23);
		panel.add(textField_4);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(23, 34, 102, 19);
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setBounds(23, 68, 102, 19);
		panel.add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(23, 102, 102, 19);
		panel.add(label_1);
		
		JButton button = new JButton("New button");
		button.setBounds(161, 450, 126, 23);
		panel.add(button);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(23, 136, 102, 19);
		panel.add(label_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(135, 132, 152, 23);
		panel.add(textField_5);
		
		
		
//		
		
		
		
		
	}
}


















