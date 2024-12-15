package tw.edu.ntub.imd.birc.firstmvc.bean;

import lombok.Data;
import tw.edu.ntub.imd.birc.firstmvc.databaseconfig.entity.Author;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
// 前端資料需要的格式，基本上會跟entity一樣，但是可以因為需求而增加變數
public class BookBean {

//    @ManyToOne
//    @JoinColumn(name = "author_id", insertable = false, updatable = false)
//    private AuthorBean author;

    @Null(message = "id 不得填寫")
    private Integer id;

    @NotBlank(message = "name - 未填寫")
    @Size(max = 50, message = "name 輸入字數小於{max}個字")
    private String name;

    @NotBlank(message = "publication date - 未填寫")
    private String publication_date_str;
    private LocalDate publication_date;

    @NotNull(message = "author id - 未瑱寫")
    private Integer author_id;

    @Null(message = "create_time 不得填寫")
    private LocalDateTime create_time;


}
