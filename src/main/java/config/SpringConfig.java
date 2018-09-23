package config;

import dao.UserDao;
import dao.UserDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import service.UserService;
import service.UserServiceImpl;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages ={"service", "dao"})
public class SpringConfig {
    //



    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
        }

        @Bean //бин с настройками, чтобы подключиться к нашей бд
        public DataSource getDataSource(){
            DriverManagerDataSource dataSource = new DriverManagerDataSource();
            dataSource.setUrl("jdbc:mysql://localhost:3306/example?useSll=false");
            dataSource.setUsername("root");
            dataSource.setPassword("root");
            dataSource.setDriverClassName("com.mysql.jdbc.Driver");
            return dataSource;
        }
//
//        @Bean
//    public UserDao getUserDao(){
//        return new UserDaoImpl(getJdbcTemplate());
//        }

//        @Bean
//    public UserService getUserService(){
//        return new UserServiceImpl();
//        }

}
