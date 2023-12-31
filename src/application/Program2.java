package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("==== TEST 1: findById ======");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n==== TEST 2: findAll ======");
		List<Department> list = departmentDao.findAll();
		for (Department department : list) {
			System.out.println(department);
		}
		
		System.out.println("\n==== TEST 3: insert ======");
		Department newDepartment = new Department(null, "Tools");
		departmentDao.insert(newDepartment);
		System.out.print("Inserted! New id: " + newDepartment.getId());
		
		System.out.println("\n==== TEST 3: update ======");
		dep = departmentDao.findById(6);
		dep.setName("Hardware");
		departmentDao.update(dep);
		System.out.println("Update completed!");
		
		System.out.println("\n==== TEST 4: deleteById ======");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
	}
}
