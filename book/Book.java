package tw.edu.ntub.imd.birc.firstmvc.databaseconfig.entity;

import lombok.Data;
import tw.edu.ntub.imd.birc.firstmvc.databaseconfig.Config;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@Entity

@Table(name = "book", schema = Config.DATABASE_NAME)

public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    // 對應欄位資料
    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "publication_date", nullable = false)
    private LocalDate publication_date;

    @Column(name = "authonr_id", nullable = false)
    private Integer authonr_id;

    @Column(name = "create_time", nullable = false)
    private LocalDateTime create_time;
}