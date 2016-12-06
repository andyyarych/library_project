package everything;

import java.util.List;

public class BookDaoBF implements BookDao {

	@Override
	public void save(Book book) {
		System.out.println(book + " is saved in binary file");
	}

	@Override
	public void update(Book book) {
		System.out.println(book + " is updated in binary file");

	}

	@Override
	public Book findOne(String id) {
		System.out.println("Found id " + id + " in binary file");
		return null;
	}

	@Override
	public List<Book> findAll() {
		System.out.println("Found all books in binary file");
		return null;
	}

}
