package slo.view;

import javax.swing.JOptionPane;

public class WindowView 
{
	private String windowMessage;
	public WindowView()
	{
		windowMessage = "Assignment made for SLO Formative";
	}
	public String getAnswer(String displayMessage)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null,displayMessage,
											 windowMessage, JOptionPane.INFORMATION_MESSAGE,null,
											null, "Input answer here.").toString();
		return answer;
	}
	public void displayResponse(String displayMessage)
	{
		JOptionPane.showMessageDialog(null, displayMessage,windowMessage,JOptionPane.PLAIN_MESSAGE);
	}
}
