package everything;

import java.util.List;

public class BookDaoDB implements BookDao {

	@Override
	public void save(Book book) {
		System.out.println(book + " is saved in database");
	}

	@Override
	public void update(Book book) {
		System.out.println(book + " is updated in database");

	}

	@Override
	public Book findOne(String id) {
		System.out.println("Found id " + id + " in database");
		return null;
	}

	@Override
	public List<Book> findAll() {
		System.out.println("Found all books in database");
		return null;
	}

}
