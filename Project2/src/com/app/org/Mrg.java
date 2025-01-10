package com.app.org;



public class Mrg extends Emp {
	private double performanceBonus;
	
	public Mrg(int id,String name,String deptId,double basic,double performanceBonus)
	{
		super(id,name,deptId,basic);
		this.performanceBonus=performanceBonus;
	}
	
	public double getperformanceBonus() {
		return performanceBonus;
	}
	
	@Override
	public double computeNetSalary() {
		return getBasic()+performanceBonus;
	}

	
	@Override
	public String toString() {
		return super.toString()+",Performance Bonus: "+performanceBonus +",Net Salary: "+computeNetSalary();
	}
	
}