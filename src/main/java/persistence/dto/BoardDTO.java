package persistence.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class BoardDTO {
    private Long id;
    private String title;
    private String writer;
    private String contents;
    private LocalDateTime regDate;
    private int hit;    //int는 0으로 설정, Integer은 NULL로 설정이라 Integer가 더 좋음//setter는 수정하니까 될 수 있으면 쓰면안됨




}
