package everything;

import java.util.List;

public interface RentDao {

    void save(Rent rent);

    void update(Rent rent);

    Rent findOne(String id);

    List<Rent> findAll();

    List<Rent> findByUser(User user);

    List<Rent> findByBook(Book book);
}
