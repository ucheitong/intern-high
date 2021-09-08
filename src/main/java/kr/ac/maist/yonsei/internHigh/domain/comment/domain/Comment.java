package kr.ac.maist.yonsei.internHigh.domain.comment.domain;

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
@Table(name = "tbl_comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comment")
    private int commentId;

    @Column(name = "id_post")
    private int postId;

    @Column(name = "id_main_comment")
    private int mainCommentId;

    @Column(name = "var_content")
    private String content;

    @Column(name = "char_has_image")
    private char hasImage;

    @Column(name = "char_is_reply")
    private char isReply;

    @Column(name = "number_like")
    private int like;

    @Column(name = "date_create")
    private String createDate;

    @Column(name = "date_edit")
    private String editDate;



    @Builder
    public Comment(int postId,
                   int mainCommentId,
                   String content) {

        this.postId = postId;
        this.mainCommentId = mainCommentId;
        this.content = content;
        this.like = 0;
    }

}
