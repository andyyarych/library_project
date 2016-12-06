package everything;

import java.util.List;

public class UserDaoBF implements UserDao {

	@Override
	public void save(User user) {
		System.out.println(user + " is saved to binary file");
	}

	@Override
	public void update(User user) {
		System.out.println(user + " is updated in binary file");
	}

	@Override
	public User findOne(String id) {
		System.out.println("Found id " + id + " in binary file");
		return null;
	}

	@Override
	public List<User> findAll() {
		System.out.println("Found all users in binary file");
		return null;
	}

}
