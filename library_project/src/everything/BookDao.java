package everything;

import java.util.List;

public interface BookDao {

	void save(Book book);

    void update(Book book);

    Book findOne(String id);

    List<Book> findAll();

}
