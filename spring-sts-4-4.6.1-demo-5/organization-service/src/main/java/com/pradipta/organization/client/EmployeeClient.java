package com.pradipta.organization.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.pradipta.organization.fallback.EmployeeClientFallback;
import com.pradipta.organization.model.Employee;

@FeignClient(name = "employee-service" , fallbackFactory = EmployeeClientFallback.class)
public interface EmployeeClient {

	@GetMapping("/organization/{organizationId}")
	List<Employee> findByOrganization(@PathVariable("organizationId") Long organizationId);
	
}
