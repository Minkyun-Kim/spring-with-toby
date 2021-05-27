package springbook.user.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import javax.sql.DataSource;

@Configuration//빈 팩토리용 오브젝트 설정 클래스라고 지칭
public class DaoFactory {

    @Bean//오브젝트를 만들어 주는 곳에 붙임.
    public UserDao userDao(){
        UserDao userDao = new UserDao();
        userDao.setDataSource(dataSource());
        return userDao;
    }

    @Bean
    public DataSource dataSource(){
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();

        dataSource.setDriverClass(com.mysql.jdbc.Driver.class);
        dataSource.setUrl("jdbc:mysql://localhost/spring_with_toby");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        return dataSource;
    }
}