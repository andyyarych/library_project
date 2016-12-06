package everything;

public class RentImpl implements Rent {

	private String id;
	private User user;
	private Book book;

	public RentImpl(String id, User user, Book book) {
		super();
		this.id = id;
		this.user = user;
		this.book = book;
	}

	@Override
	public String toString() {
		return "RentImpl [id=" + id + ", user=" + user + ", book=" + book + "]";
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public User getUser() {
		return user;
	}

	@Override
	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public Book getBook() {
		return book;
	}

	@Override
	public void setBook(Book book) {
		this.book = book;
	}

}
