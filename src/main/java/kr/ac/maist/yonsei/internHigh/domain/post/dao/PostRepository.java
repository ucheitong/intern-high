package kr.ac.maist.yonsei.internHigh.domain.post.dao;

import kr.ac.maist.yonsei.internHigh.domain.post.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
