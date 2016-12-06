package everything;

public class DaoFactoryBF implements DaoFactory {

	@Override
	public UserDao getUserDao() {
		return new UserDaoBF();
	}

	@Override
	public BookDao getBookDao() {
		return new BookDaoBF();
	}

	@Override
	public RentDao getRentDao() {
		return new RentDaoBF();
	}

}
