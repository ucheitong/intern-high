package kr.ac.maist.yonsei.internHigh.domain.friends.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@DynamicInsert
@Entity
@Table(name = "tbl_friends_list")
public class Friends {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_friends_list")
    private int friendsListId;

    @Column(name = "id_user")
    private int userId;

    @Column(name = "id_friend")
    private int friendId;

    @Column(name = "date_create")
    private String dateCreate;
}
