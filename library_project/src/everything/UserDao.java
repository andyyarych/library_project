package everything;

import java.util.List;

public interface UserDao {

    void save(User user);

    void update(User user);

    User findOne(String id);

    List<User> findAll();
}
