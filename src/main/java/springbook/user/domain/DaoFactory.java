package springbook.user.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//빈 팩토리용 오브젝트 설정 클래스라고 지칭
public class DaoFactory {

    @Bean//오브젝트를 만들어 주는 곳에 붙임.
    public UserDao userDao(){
        return new UserDao();
    }
    @Bean
    public ConnectionMaker connectionMaker(){
        return new DConnectionMaker();
    }

    /*
    public AccountDao accountDao(){
        return new AccountDao(getConnectionMaker());
    }
     */

    /*
    public MessageDao messageDao(){
        return new MessageDao(getConnectionMaker());
    }
     */
}
