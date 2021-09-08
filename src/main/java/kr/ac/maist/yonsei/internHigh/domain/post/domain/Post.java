package kr.ac.maist.yonsei.internHigh.domain.post.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
@Entity
@Table(name = "tbl_post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_post")
    private int postId;

    @Column(name = "id_user")
    private int userId;

    @Column(name = "var_content")
    private String content;

    @Column(name = "char_has_image")
    private char hasImage;

    @Column(name = "number_like")
    private int like;

    @Column(name = "date_create")
    private String createDate;

    @Column(name = "date_edit")
    private String editDate;

    @Builder
    public Post(int userId,
                String content) {

        this.userId = userId;
        this.content = content;
        this.like = 0;
    }
}
