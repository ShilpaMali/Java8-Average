package com.velocity;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;


/*
 * I have one employee class which contain id,name,salary
 * and want to calculate average of salary
 */
public class StreamAPI {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101, "sohan", 40000));
		list.add(new Employee(102, "sandip", 45000));
		list.add(new Employee(103, "akash", 55000));
		list.add(new Employee(104, "yogesh", 50000));
		list.add(new Employee(105, "vishal", 35000));

		DoubleSummaryStatistics dss = list.stream().collect(Collectors.summarizingDouble(p -> p.getEmpSalary()));
		System.out.println("Avg>>"+dss.getAverage());
		//System.out.println(dss);
	}

}
