package tw.edu.ntub.imd.birc.firstmvc.service;

import tw.edu.ntub.imd.birc.firstmvc.bean.BookBean;
import java.util.List;

public interface BookService extends BaseService<BookBean, Integer> {
    List<BookBean> findAll();
}