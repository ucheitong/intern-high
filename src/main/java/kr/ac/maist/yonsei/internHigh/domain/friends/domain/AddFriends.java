package kr.ac.maist.yonsei.internHigh.domain.friends.domain;

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
@Entity
@Table(name = "tbl_add_friends_list")
public class AddFriends {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_add_friends_list")
    private int addFriendsListId;

    @Column(name = "id_user")
    private int userId;

    @Column(name = "id_add_friend")
    private int addFriendId;

    @Column(name = "date_create")
    private String dateCreate;
}
