package slo.view;

import slo.contoller.*;
import slo.view.*;
import javax.swing.*;

public class MajorFrame extends JFrame
{
	private MajorController majorController;
	private MajorPanel majorPanel;
	
	public MajorFrame(MajorController mainController)
	{
		this.majorController = mainController;
		majorPanel = new MajorPanel(majorController);
		setupFrame();
	}
	private void setupFrame() 
	{
		
	}
	public MajorController getBaseController()
	
	{
		return majorController;
	}
}
