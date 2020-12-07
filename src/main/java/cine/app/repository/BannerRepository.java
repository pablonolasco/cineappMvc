package cine.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cine.app.model.Banner;
@Repository
public interface BannerRepository extends JpaRepository<Banner, Integer> {

}
