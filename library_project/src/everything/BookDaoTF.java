package everything;

import java.util.List;

public class BookDaoTF implements BookDao {

	@Override
	public void save(Book book) {
		System.out.println(book + " is saved in text file");
	}

	@Override
	public void update(Book book) {
		System.out.println(book + " is updated in text file");

	}

	@Override
	public Book findOne(String id) {
		System.out.println("Found id " + id + " in text file");
		return null;
	}

	@Override
	public List<Book> findAll() {
		System.out.println("Found all books in text file");
		return null;
	}

}
