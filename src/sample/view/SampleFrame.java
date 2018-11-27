package sample.view;

import javax.swing.JFrame;
import sample.controller.GUIController;

public class SampleFrame extends JFrame
{
	private GUIController appController;
	private SamplePanel appPanel;
	
	public SampleFrame(GUIController appController)
	{
		super();
		
		this.appController = appController;
		this.appPanel = new SamplePanel(appController);
				
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(700,70);
		this.setTitle("Don't press the goddamn button");
		this.setResizable(false);
		this.setVisible(true);
	}
}
