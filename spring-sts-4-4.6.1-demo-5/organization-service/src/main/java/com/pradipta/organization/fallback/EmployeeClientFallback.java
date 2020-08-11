package com.pradipta.organization.fallback;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.pradipta.organization.client.EmployeeClient;
import com.pradipta.organization.model.Employee;

import feign.hystrix.FallbackFactory;

@Component
public class EmployeeClientFallback implements EmployeeClient, FallbackFactory<EmployeeClient>  {

	@Override
	public List<Employee> findByOrganization(Long organizationId) {
		// TODO Auto-generated method stub
		return new ArrayList<>();
	}

	@Override
	public EmployeeClient create(Throwable cause) {
		// TODO Auto-generated method stub
		return null;
	}
}
