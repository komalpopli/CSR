package com.csr;

import com.csr.model.Role;
import com.csr.model.User;
import com.csr.model.UserRole;
import com.csr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class CsrserverApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(CsrserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting code");
		/*User user=new User();
		user.setEmployeeId("224");
		user.setPassword("abc");
		user.setEmail("komal.popli@clarivate.com");

		Role role=new Role();
		role.setRoleId(1L);
		role.setRoleName("Admin");

		Set<UserRole> userroles=new HashSet<>();
		UserRole userrole=new UserRole();
		userrole.setRole(role);
		userrole.setUser(user);
		userroles.add(userrole);
		User user1=this.userService.createUser(user,userroles);
		System.out.println(user1.getEmployeeId());*/

	}
}
