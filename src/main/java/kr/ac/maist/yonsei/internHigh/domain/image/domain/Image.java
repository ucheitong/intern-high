package kr.ac.maist.yonsei.internHigh.domain.image.domain;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DynamicInsert
@DynamicUpdate
@Entity
@ToString
@Table(name = "tbl_image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_image")
    private int imageId;

    @Column(name = "id_post")
    private int postId;

    @Column(name = "id_comment")
    private int commentId;

    @Column(name = "var_orig_file_name")
    private String origFileName;

    @Column(name = "var_file_name")
    private String fileName;

    @Column(name = "var_file_path")
    private String filePath;

    @Column(name = "date_create")
    private String createDate;

    @Column(name = "date_edit")
    private String editDate;

    @Builder
    public Image(int imageId, int postId, int commentId, String origFileName, String fileName, String filePath) {
        this.imageId = imageId;
        this.postId = postId;
        this.commentId = commentId;
        this.origFileName = origFileName;
        this.fileName = fileName;
        this.filePath = filePath;
    }
}
