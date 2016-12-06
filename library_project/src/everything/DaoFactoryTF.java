package everything;

public class DaoFactoryTF implements DaoFactory {

	@Override
	public UserDao getUserDao() {
		return new UserDaoTF();
	}

	@Override
	public BookDao getBookDao() {
		return new BookDaoTF();
	}

	@Override
	public RentDao getRentDao() {
		// TODO Auto-generated method stub
		return new RentDaoTF();
	}

}
