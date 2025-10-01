package kr.co.sboard.dto;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommentDTO {

    private int cno;
    private int ano;
    private String content;
    private String writer;
    private String reg_ip;
    private String wdate;

    // 추가 필드
    private String nick; // user의 nick을 가져오기 위함

}
