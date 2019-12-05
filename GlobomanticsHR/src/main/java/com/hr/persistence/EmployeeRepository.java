package com.hr.persistence;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.hr.personnel.Employee;
import com.hr.personnel.FullTimeEmployee;
import com.hr.personnel.PartTimeEmployee;

public class EmployeeRepository {

	private EmployeeFileSerializer serializer;

	public EmployeeRepository(EmployeeFileSerializer serializer) {
		this.serializer = serializer;
	}

	public List<Employee> findAll() {
		Employee anna = new FullTimeEmployee("Anna Smith", 2000);
		Employee billy = new FullTimeEmployee("Billy Leech", 920);

		Employee steve = new PartTimeEmployee("Steve Jones", 800);
		Employee magda = new PartTimeEmployee("Magda Iovan", 920);

		return Arrays.asList(anna, billy, steve, magda);
	}

	public void save(Employee employee) throws IOException {
		String serializedString = this.serializer.serialize(employee);

		Path path = Paths.get(employee.getFullName().replace(" ", "_") + ".rec");
		Files.write(path, serializedString.getBytes());

	}
}
