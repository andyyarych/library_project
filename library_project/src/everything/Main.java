package everything;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	public static List<UserImpl> users = new ArrayList<>();
	public static List<BookImpl> books = new ArrayList<>();
	public static List<RentImpl> rents = new ArrayList<>();
	public static UserDao userDao;
	public static BookDao bookDao;
	public static RentDao rentDao;
	public static DaoFactory DaoDB = new DaoFactoryDB();
	public static DaoFactory DaoTF = new DaoFactoryTF();
	public static DaoFactory DaoBF = new DaoFactoryBF();

	public static void main(String[] args) {

		boolean isRun = true;

		if (users.isEmpty()) {
			System.out.println("Enter 1 to work with database");
			System.out.println("Enter 2 to work with text file");
			System.out.println("Enter 3 to work with binary file");
			System.out.println("Enter 0 to exit");
			switch (sc.next()) {
			case "1": {
				DaoDB();
				break;
			}
			case "2": {
				DaoTF();
				break;
			}
			case "3": {
				DaoBF();
				break;
			}
			default: isRun = false;
			}
		}

		while (isRun) {
			System.out.println("Enter 1 to manage users");
			System.out.println("Enter 2 to manage books");
			System.out.println("Enter 3 to manage rents");
			System.out.println("Enter 0 to exit");
			switch (sc.next()) {
			case "1": {
				manageUsers();
				break;
			}
			case "2": {
				manageBooks();
				break;
			}
			case "3": {
				manageRent();
				break;
			}
			default: isRun = false;
			}
		}
	}

	private static void DaoDB() {
		userDao = DaoDB.getUserDao();
		bookDao = DaoDB.getBookDao();
		rentDao = DaoDB.getRentDao();
	}

	private static void DaoTF() {
		userDao = DaoTF.getUserDao();
		bookDao = DaoTF.getBookDao();
		rentDao = DaoTF.getRentDao();
	}

	private static void DaoBF() {
		userDao = DaoBF.getUserDao();
		bookDao = DaoBF.getBookDao();
		rentDao = DaoBF.getRentDao();
	}

	private static void manageRent() {
		System.out.println("Enter 1 to rent a book");
		System.out.println("Enter 2 to return a book");
		System.out.println("Enter 3 to find rent by id");
		System.out.println("Enter 4 to find rents by user");
		System.out.println("Enter 5 to find rents by book");
		System.out.println("Enter 6 to show all rents history");
		System.out.println("Enter 0 to return");
		switch (sc.next()) {
		case "1" : {
			System.out.println("Enter user name");
			String name = sc.next();
			UserImpl user = new UserImpl(name);
			System.out.println("Enter book title");
			String title = sc.next();
			BookImpl book = new BookImpl(title);
			RentImpl rent = new RentImpl(user.getId() + book.getId(), user, book);
			rentDao.save(rent);
			break;
		}
		case "2": {
			System.out.println("Enter user name");
			String name = sc.next();
			UserImpl user = new UserImpl(name);
			System.out.println("Enter book title");
			String title = sc.next();
			BookImpl book = new BookImpl(title);
			RentImpl rent = new RentImpl(user.getId() + book.getId(), user, book);
			rentDao.save(rent);
			break;
		}
		case "3": {
			System.out.println("Enter rent id (user name + book title) ");
			String rentId = sc.next();
			rentDao.findOne(rentId);
			for (RentImpl rent : rents) {
				if (rent.getId().equals(rentId)) {
					System.out.println(rent);
				}
			}
			break;
		}
		case "4": {
			System.out.println("Enter user name");
			String name = sc.next();
			UserImpl user = new UserImpl(name);
			rentDao.findByUser(user);
			for (RentImpl rent : rents) {
				if (rent.getUser().equals(user)) {
					System.out.println(rent);
				}
			}
			break;
		}
		case "5": {
			System.out.println("Enter book title");
			String title = sc.next();
			BookImpl book = new BookImpl(title);
			rentDao.findByBook(book);
			for (RentImpl rent : rents) {
				if (rent.getUser().equals(book)) {
					System.out.println(rent);
				}
			}
			break;
		}
		case "6": {
			rentDao.findAll();
			for (RentImpl rentImpl : rents) {
				System.out.println(rentImpl);
			}
		}
		default: break;
		}
	}

	private static void manageBooks() {
		System.out.println("Enter 1 to add new book");
		System.out.println("Enter 2 to delete book");
		System.out.println("Enter 3 to show book");
		System.out.println("Enter 4 to show all books");
		System.out.println("Enter 0 to return");
		switch (sc.next()) {
		case "1": {
			System.out.println("Enter book title");
			String title = sc.next();
			BookImpl book = new BookImpl(title);
			bookDao.save(book);
			books.add(book);
			break;
		}
		case "2": {
			System.out.println("Enter book title");
			String title = sc.next();
			bookDao.update(new BookImpl(title));
			Iterator<BookImpl> iter = books.iterator();
			while (iter.hasNext()) {
				if (iter.next().getId().equals(title)) {
					iter.remove();
				}
			}
			break;
		}
		case "3": {
			System.out.println("Enter book title");
			String title = sc.next();
			for (BookImpl book : books) {
				if (book.getId().equals(title))
					bookDao.findOne(title);
			}
			break;
		}
		case "4": {
			bookDao.findAll();
			for (BookImpl book : books) {
				System.out.println(book);
			}
			break;
		}
		default: break;
		}
	}

	private static void manageUsers() {
		System.out.println("Enter 1 to add new user");
		System.out.println("Enter 2 to delete user");
		System.out.println("Enter 3 to show user");
		System.out.println("Enter 4 to show all users");
		System.out.println("Enter 0 to return");
		switch (sc.next()) {
		case "1": {
			System.out.println("Enter user name");
			String name = sc.next();
			UserImpl user = new UserImpl(name);
			userDao.save(user);
			users.add(user);
			break;
		}
		case "2": {
			System.out.println("Enter user name");
			String name = sc.next();
			userDao.update(new UserImpl(name));
			Iterator<UserImpl> iter = users.iterator();
			while (iter.hasNext()) {
				if (iter.next().getId().equals(name)) {
					iter.remove();
				}
			}
			break;
		}
		case "3": {
			System.out.println("Enter user name");
			String name = sc.next();
			for (UserImpl userImpl : users) {
				if (userImpl.getId().equals(name))
					userDao.findOne(name);
			}
			break;
		}
		case "4": {
			userDao.findAll();
			for (UserImpl userImpl : users) {
				System.out.println(userImpl);
			}
			break;
		}
		default: break;
		}
	}

}
