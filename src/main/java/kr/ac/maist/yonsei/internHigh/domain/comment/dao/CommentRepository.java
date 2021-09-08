package kr.ac.maist.yonsei.internHigh.domain.comment.dao;

import kr.ac.maist.yonsei.internHigh.domain.comment.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
