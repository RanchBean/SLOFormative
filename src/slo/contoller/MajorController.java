package slo.contoller;

import slo.view.*;
import slo.model.*;

public class MajorController 
{
	private MajorFrame majorFrame;
	private WindowView windowView;
	private YearAndMajor yearAndMajor;
	
	 public MajorController()
	 {
		 windowView = new WindowView();
		 majorFrame = new MajorFrame(this);
		 String user = windowView.getAnswer("");
	 }
	 public void Start()
	 {
		 
	 }
	public YearAndMajor getYearAndMajor()
	{
		return yearAndMajor;
	}
		
	public WindowView getWindowView()
	{
		return windowView;
	}

	public MajorFrame getMajorFrame()
	{
		return majorFrame;
	}
}
