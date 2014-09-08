package it.gm.gui.tests;

import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class MusicShaffler extends JPanel implements ActionListener{
	
	private String newline = "\n";
    protected static final String textFieldString = "JTextField";
    protected static final String passwordFieldString = "JPasswordField";
    protected static final String ftfString = "JFormattedTextField";
    protected static final String buttonString = "JButton";

    protected JLabel actionLabel;
	
	public MusicShaffler()  {
		
		
		 JTextPane textPane = createTextPane();
	        JScrollPane paneScrollPane = new JScrollPane(textPane);
	        paneScrollPane.setVerticalScrollBarPolicy(
	                        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	        paneScrollPane.setPreferredSize(new Dimension(250, 155));
	        paneScrollPane.setMinimumSize(new Dimension(10, 10));
	}

}
