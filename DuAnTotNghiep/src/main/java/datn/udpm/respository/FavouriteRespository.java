package datn.udpm.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import datn.udpm.entity.Favourite;

public interface FavouriteRespository extends JpaRepository<Favourite,Integer> {

}
