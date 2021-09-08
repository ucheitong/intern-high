package kr.ac.maist.yonsei.internHigh.domain.user.dao;

import kr.ac.maist.yonsei.internHigh.domain.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
