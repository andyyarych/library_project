package everything;

import java.util.List;

public class UserDaoTF implements UserDao {

	@Override
	public void save(User user) {
		System.out.println(user + " is saved to text file");
	}

	@Override
	public void update(User user) {
		System.out.println(user + " is updated in text file");
	}

	@Override
	public User findOne(String id) {
		System.out.println("Found id " + id + " in text file");
		return null;
	}

	@Override
	public List<User> findAll() {
		System.out.println("Found all users in text file");
		return null;
	}

}
