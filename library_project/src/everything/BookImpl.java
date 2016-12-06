package everything;

public class BookImpl implements Book {

	private String id;

	public BookImpl(String id) {
		super();
		this.id = id;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "BookImpl [id=" + id + "]";
	}

}
