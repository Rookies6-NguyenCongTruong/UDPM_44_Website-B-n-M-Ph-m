package datn.udpm.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import datn.udpm.entity.News;

public interface NewsRespository extends JpaRepository<News,Integer> {

}
