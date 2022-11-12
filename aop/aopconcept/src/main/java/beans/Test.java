package beans;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	private List<String> names;
	private Map<Integer,String> rollNo;
	private int[] carModel;
	
	public void setNames(List<String> names) {
		this.names = names;
	}

	public void setRollNo(Map<Integer, String> rollNo) {
		this.rollNo = rollNo;
	}

	public void setCarModel(int[] carModel) {
		this.carModel = carModel;
	}

	public List<String> getNames() {
		return names;
	}

	public Map<Integer, String> getRollNo() {
		return rollNo;
	}

	public int[] getCarModel() {
		return carModel;
	}

	public Test(List<String> names, Map<Integer, String> rollNo, int[] carModel) {
		super();
		this.names = names;
		this.rollNo = rollNo;
		this.carModel = carModel;
	}

	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void print() {
		System.out.println("carModels......");
		for (int i : carModel) {
			System.out.println(i);
		}
	}
	
}
