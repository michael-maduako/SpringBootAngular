package com.michael.model;

import javax.persistence.*;

@Entity
@Table(name="bootang")
public class Emp {
	@Id @GeneratedValue
	private int id;
	private String empName;
		public Emp() {}
		
		
		public Emp(int id, String empName) {
			super();
			this.id = id;
			this.empName = empName;
		}


		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		
}
