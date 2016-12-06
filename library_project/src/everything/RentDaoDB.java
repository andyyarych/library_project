package everything;

import java.util.List;

public class RentDaoDB implements RentDao {

	@Override
	public void save(Rent rent) {
		System.out.println(rent + " is saved to database");
	}

	@Override
	public void update(Rent rent) {
		System.out.println(rent + " is updated in database");
	}

	@Override
	public Rent findOne(String id) {
		System.out.println("Found rent by id " + id + " in database");
		return null;
	}

	@Override
	public List<Rent> findAll() {
		System.out.println("Found all rents in database");
		return null;
	}

	@Override
	public List<Rent> findByUser(User user) {
		System.out.println("Found rents by user " + user + " in database");
		return null;
	}

	@Override
	public List<Rent> findByBook(Book book) {
		System.out.println("Found rents by book " + book + " in database");
		return null;
	}

}
