package kr.ac.maist.yonsei.internHigh.domain.user.domain;

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
@Table(name = "tbl_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private int userId;

    @Column(name = "var_id")
    private String loginId;

    @Column(name = "enc_password")
    private String loginPassword;

    @Column(name = "var_image_profile_path")
    private String profilePath;

    @Column(name = "var_image_banner_path")
    private String bannerPath;

    @Column(name = "date_create")
    private String createDate;

    @Column(name = "date_edit")
    private String editDate;

    @Builder
    public User(int userId,
                String loginId,
                String loginPassword,
                String profilePath) {

        this.userId = userId;
        this.loginId = loginId;
        this.loginPassword = loginPassword;
        this.profilePath = profilePath;
    }

}