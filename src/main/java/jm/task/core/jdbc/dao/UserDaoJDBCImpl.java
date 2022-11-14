package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

@Deprecated
public class UserDaoJDBCImpl extends Util {
    public UserDaoJDBCImpl() {

    }

    @Deprecated
    public void createUsersTable() {

    }

    @Deprecated
    public void dropUsersTable() {

    }

    @Deprecated
    public void saveUser(String name, String lastName, byte age) {
        User user = new User(name, lastName, age);
        Session session = Util.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }

    @Deprecated
    public void removeUserById(/*long id*/) {

    }

    @Deprecated
    public List<User> getAllUsers() {
        return null;
    }

    @Deprecated
    public void cleanUsersTable() {

    }
}
