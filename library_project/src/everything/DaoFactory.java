package everything;

public interface DaoFactory {

    UserDao getUserDao();

    BookDao getBookDao();

    RentDao getRentDao();

}
