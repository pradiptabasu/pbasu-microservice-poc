package com.pradipta.employee.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import com.pradipta.employee.model.Employee;

//public class EmployeeRepository {
public interface EmployeeRepository extends MongoRepository<Employee, Long>{
	
	List<Employee> findByDepartmentId(@Param("departmentId") Long departmentId);
	List<Employee> findByOrganizationId(@Param("organizationId") Long organizationId);

//	private List<Employee> employees = new ArrayList<>();
//	
//	public Employee add(Employee employee) {
//		employee.setId((long) (employees.size()+1));
//		employees.add(employee);
//		return employee;
//	}
//	
//	public Employee findById(Long id) {
//		Optional<Employee> employee = employees.stream().filter(a -> a.getId().equals(id)).findFirst();
//		if (employee.isPresent())
//			return employee.get();
//		else
//			return null;
//	}
//	
//	public List<Employee> findAll() {
//		return employees;
//	}
//	
//	public List<Employee> findByDepartment(Long departmentId) {
//		return employees.stream().filter(a -> a.getDepartmentId().equals(departmentId)).collect(Collectors.toList());
//	}
//	
//	public List<Employee> findByOrganization(Long organizationId) {
//		return employees.stream().filter(a -> a.getOrganizationId().equals(organizationId)).collect(Collectors.toList());
//	}
	
}
