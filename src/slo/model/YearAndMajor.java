package slo.model;

import java.util.ArrayList;

public class YearAndMajor
	{
		private ArrayList<String> yearList;
		private ArrayList<String> majorList;
		private String userName;		
		public YearAndMajor(String userName)
		{
			this.yearList = new ArrayList<String>();
			this.majorList = new ArrayList<String>();
			this.userName = userName;
			buildYearList();
			buildMajorList();
		}
		private void buildYearList()
		{
			this.yearList.add("your in that year!");
		}
		private void buildMajorList()
		{
			this.majorList.add("Nice Major");
		}
		public boolean majorChecker(String currentInput)
		{
			boolean hasMajors = false;
			
			for(String major: majorList)
			{
				if(currentInput.toLowerCase().contains(major.toLowerCase()))
				{	
				hasMajors = true;
				}
			}
			
			return hasMajors;
		}
		public boolean yearChecker(String currentInput)
		{
			boolean hasYears = false;
			
			for(String year: yearList)
			{
				if(currentInput.toLowerCase().equals(year.toLowerCase()))
				{
					hasYears = true;
				}
			}
			return hasYears;
		}
		public String getUserName()
		{
			return userName;
		}
		public ArrayList<String> getYearList()
		{
			return yearList;
		}
		public ArrayList<String> getMajorList()
		{
			return majorList;
		}
}
