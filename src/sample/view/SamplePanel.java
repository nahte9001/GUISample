package sample.view;

import sample.controller.GUIController;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SamplePanel extends JPanel
{
	private GUIController appController;
	
	private JButton colorButton;
	private JLabel textLabel;
	
	public SamplePanel(GUIController appController)
	{
		super();
		
		this.appController = appController;
		
		colorButton = new JButton("I swear to god do not press it");
		textLabel = new JLabel("Do NOT press it. I'm shaking with rage right now do not press it or i'll eat your skin I swear to god");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.CYAN);
		this.add(textLabel);
		this.add(colorButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		colorButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				changeBackgroundColor();
			}
		});
	}
	
	private void changeBackgroundColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
		textLabel.setText("Red is: " + red + " Green is " + green + " Blue is: " + blue + "     Why'd you have to press it");
	}
	
}
