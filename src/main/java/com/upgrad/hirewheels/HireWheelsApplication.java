package com.upgrad.hirewheels;

import com.upgrad.hirewheels.dao.RoleDAO;
import com.upgrad.hirewheels.dao.UserDAO;
import com.upgrad.hirewheels.entities.Role;
import com.upgrad.hirewheels.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class HireWheelsApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(HireWheelsApplication.class, args);
		UserDAO userDAO =context.getBean(UserDAO.class);
		RoleDAO roleDAO = context.getBean(RoleDAO.class);

		//Creating roles
		Role role1 = new Role();
		role1.setRole_name("ADMIN");
		roleDAO.save(role1);

		Role role2 = new Role();
		role2.setRole_name("USER");
		roleDAO.save(role2);


		//Inserting users in the database
		User user1 = new User();
		user1.setFirst_name("Prathi");
		user1.setLast_name("shetty");
		user1.setEmail("prathishetty@gmail.com");
		user1.setMobile_no(897169836);
		user1.setPassword("pra");
		user1.setWalletMoney(10000);
		user1.setRole(role1);

		User user2 = new User();
		user2.setFirst_name("krithi");
		user2.setLast_name("k");
		user2.setEmail("krithi@gmail.com");
		user2.setMobile_no(897169826);
		user2.setPassword("kri");
		user2.setWalletMoney(10000);
		user2.setRole(role2);

		User user3 = new User();
		user3.setFirst_name("Swathi");
		user3.setLast_name("S");
		user3.setEmail("Swathi@gmail.com");
		user3.setMobile_no(897169816);
		user3.setPassword("swa");
		user3.setWalletMoney(10000);
		user3.setRole(role2);

		User user4 = new User();
		user4.setFirst_name("Ruthu");
		user4.setLast_name("R");
		user4.setEmail("Ruthu@gmail.com");
		user4.setMobile_no(897169835);
		user4.setPassword("ruthu");
		user4.setWalletMoney(10000);
		user4.setRole(role2);

		User user5 = new User();
		user5.setFirst_name("Kishor");
		user5.setLast_name("kumar");
		user5.setEmail("Kishor@gmail.com");
		user5.setMobile_no(897169835);
		user5.setPassword("Kishor");
		user5.setWalletMoney(10000);
		user5.setRole(role2);

		//Saving all users
		List<User> userLists= new ArrayList<>();
		userLists.add(user1);
		userLists.add(user2);
		userLists.add(user3);
		userLists.add(user4);
		userLists.add(user5);
		userDAO.saveAll(userLists);

		//printing user details on console
		userDAO.findAll().forEach(user -> System.out.println(user.toString()));

		//paginated request to fetch a page with 2 users using the UserDao interface
		Page<User> page0 = userDAO.findAll(PageRequest.of(0,2));
		page0.stream().forEach(user -> System.out.println(user.toString()));

		// custom query methods to fetch the users using the UserDao
		userDAO.findByFirstNameIgnoreCase("Prathi").forEach(user -> System.out.println(user.toString()));
		userDAO.findByFirstNameOrLastNameIgnoreCase("Swathi","S").forEach(user -> System.out.println(user.toString()));
		userDAO.findByEmailIgnoreCase("prathishetty@gmail.com").forEach(user -> System.out.println(user.toString()));
	}

}
