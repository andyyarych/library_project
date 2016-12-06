package everything;

public class DaoFactoryDB implements DaoFactory {

	@Override
	public UserDao getUserDao() {
		return new UserDaoDB();
	}

	@Override
	public BookDao getBookDao() {
		return new BookDaoDB();
	}

	@Override
	public RentDao getRentDao() {
		return new RentDaoDB();
	}

}
