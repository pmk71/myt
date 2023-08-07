package com.myt.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@Table(name="EMPLOYEE")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EMP_ID")
    private long empId;
    @Column(name = "EMP_FIRST_NAME")
    private String empFirstName;
    @Column(name = "EMP_LAST_NAME")
    private String empLastName;
    @Column(name = "EMP_EMAIL")
    private String empEmailId;
    
    public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public String getEmpEmailId() {
		return empEmailId;
	}

	public void setEmpEmailId(String empEmailId) {
		this.empEmailId = empEmailId;
	}

	public long getEmpId() {
		return empId;
	}

	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public EmployeeEntity(long empId, String empFirstName, String empLastName, String empEmailId) {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empEmailId = empEmailId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empEmailId=" + empEmailId + "]";
	}
}
