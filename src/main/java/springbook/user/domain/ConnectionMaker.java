package springbook.user.domain;

import java.sql.Connection;
import java.sql.SQLException;

/*
기존의 SimpleConnectionMaker는 한가지 DB 밖에 연동하지 못했다.
이를 해결하고 상속의 단점을 보완하기 위해 인터페이스를 사용하자.
각각의 DB 사용자는 DB Connection을 만들기 위해 아래 인터페이스를 구현해 각자가 원하는 DB에 Connection을 만들어준다.
 */
public interface ConnectionMaker {

    public Connection makeConnection() throws ClassNotFoundException, SQLException;
}
