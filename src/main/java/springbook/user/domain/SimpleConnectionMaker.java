package springbook.user.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
기존 NUserDao extends UserDao 클래스처럼 상속을 사용하면 문제가 생긴다.
바로 다른 목적으로 UserDao를 사용하면 의미가 모호해지고 불필요한 추상 메소드가 만들어질 수 있기 때문이다.
상속을 쓰지 않기 위해 이번엔 Connection을 만드는 새로운 클래스를 만들고 해당 클래스를 할당하기로 했다.
이때 생기는 문제는 다시 원점으로 돌아와 해당 클래스는 한가지 DB에 밖에 연결할 수 없어 확장성 면에서 단점이 있다.
이를 해결하기 위해 인터페이스를 만들고 해당 인터페이스를 구현하도록 하자. 
 */
public class SimpleConnectionMaker {

    public Connection makeNewConnection() throws ClassNotFoundException, SQLException {
        //Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost/spring_with_toby", "root", "root");
        return c;
    }
}
