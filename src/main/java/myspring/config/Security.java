//package myspring.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.provisioning.UserDetailsManager;
//
//@EnableWebSecurity
//public class Security {
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//        UserDetailsManager manager = new InMemoryUserDetailsManager();
//        UserDetails userDetails = User
//                .withUsername("admin")
//                .password("qwerty")
//                .roles(UserRoles.ADMIN.toString())
//                .build();
//        manager.createUser(userDetails);
//        return manager;
//    }
//
//    public enum UserRoles {
//        ADMIN
//    }
//
//}
