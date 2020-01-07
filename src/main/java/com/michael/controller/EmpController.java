package com.michael.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.michael.model.Emp;
import com.michael.service.EmpService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EmpController {
	/*private List<Emp> emps=createListEmp();
	
	//Hard coding
	@GetMapping("/employees")
	public List<Emp> displayEmps(){//RequestMapping/GetMapping
		return emps;
	}
	private static List<Emp> createListEmp(){
		List<Emp> list= new ArrayList<>();
		Emp e1= new Emp(1001,"Abdul");
		Emp e2= new Emp(1002,"Edson");
		Emp e3= new Emp(1003,"Sam");
		Emp e4= new Emp(1004,"Tamirat");
		Emp e5= new Emp(1005,"Michael");
		list.add(e1);list.add(e2);list.add(e3);list.add(e4);list.add(e5);
		return list;
		}
	*/
	@Autowired
	private EmpService empService;
	
	@PostMapping("/createEmp")
	public Emp createEmp(@RequestBody Emp emp) {
		return empService.createEmp(emp);
	}
	
	@GetMapping("/getAllEmps")
	public List<Emp> getAllEmps() {
		return empService.findAllEmps();
	}
	
	@GetMapping("/getEmpById/{empId}")
	public Optional<Emp> getAllEmpById(@PathVariable("empId") int empId) {
		return empService.findById(empId);
	}
	
	@DeleteMapping("/deleteEmp/{empId}")
	public void delete(@PathVariable("empId") int empId) {
		 empService.deleteById(empId);
	}
	
	//Do one for updating
 	@PutMapping("/updateEmp/{empId}")
	public void updateEmp(@PathVariable("empId") int empId) {
 		empService.updateEmp(empId);
 	}
	
	
}
