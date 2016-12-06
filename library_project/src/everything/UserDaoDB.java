package everything;

import java.util.List;

public class UserDaoDB implements UserDao {

	@Override
	public void save(User user) {
		System.out.println(user + " is saved to database");
	}

	@Override
	public void update(User user) {
		System.out.println(user + " is updated in database");
	}

	@Override
	public User findOne(String id) {
		System.out.println("Found id " + id + " in database");
		return null;
	}

	@Override
	public List<User> findAll() {
		System.out.println("Found all users in database");
		return null;
	}

}
