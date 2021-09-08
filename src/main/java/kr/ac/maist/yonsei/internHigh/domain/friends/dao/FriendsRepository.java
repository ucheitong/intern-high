package kr.ac.maist.yonsei.internHigh.domain.friends.dao;

import kr.ac.maist.yonsei.internHigh.domain.friends.domain.Friends;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendsRepository extends JpaRepository<Friends, Integer> {
}
