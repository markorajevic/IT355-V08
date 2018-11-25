package com.metropolitan.spring;

import com.metropolitan.spring.config.AppConfig;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.metropolitan.spring.entity.User;
import com.metropolitan.spring.service.UserService;

/**
 * @author Vlada
 *
 */
public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);

      // Add Users
      userService.add(new User("Vlada", "Milicevic", "vlada@example.com"));
      userService.add(new User("Zoran", "Zoranovic", "zoki@example.com"));
      userService.add(new User("Milena", "Milic", "mila@example.com"));

      // Get Users
      List<User> users = userService.listUsers();
      for (User user : users) {
         System.out.println("Id = "+user.getId());
         System.out.println("First Name = "+user.getFirstName());
         System.out.println("Last Name = "+user.getLastName());
         System.out.println("Email = "+user.getEmail());
         System.out.println();
      }

      context.close();
   }
}
