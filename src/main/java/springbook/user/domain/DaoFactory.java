package springbook.user.domain;

public class DaoFactory {

    public UserDao userDao(){
        return new UserDao(getConnectionMaker());
    }

    public ConnectionMaker getConnectionMaker(){
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
