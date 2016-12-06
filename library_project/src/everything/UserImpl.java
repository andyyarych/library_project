package everything;

public class UserImpl implements User {

	private String id;

	public UserImpl(String id) {
		super();
		this.id = id;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "UserImpl [id=" + id + "]";
	}


}
