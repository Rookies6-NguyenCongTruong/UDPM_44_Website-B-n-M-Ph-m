package datn.udpm.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import datn.udpm.entity.Banner;

public interface BannerRespository extends JpaRepository<Banner,Integer> {

}
