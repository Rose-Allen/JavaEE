package db;

import java.time.LocalDateTime;

public class News {
    private Long id;
    private String title;
    private String content;

    private Category category;

    private Language language;
    private LocalDateTime postDate;
}

