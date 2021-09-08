package kr.ac.maist.yonsei.internHigh.domain.image.dao;

import kr.ac.maist.yonsei.internHigh.domain.image.domain.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Integer> {
}
