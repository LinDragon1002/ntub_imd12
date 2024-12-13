package tw.edu.ntub.imd.birc.firstmvc.databaseconfig.dao;

import org.springframework.stereotype.Repository;
import tw.edu.ntub.imd.birc.firstmvc.databaseconfig.entity.Book;
import tw.edu.ntub.imd.birc.firstmvc.databaseconfig.entity.Teacher;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface BookDAO extends BaseDAO<Book, Integer> {
    List<Book> findAll();
}
