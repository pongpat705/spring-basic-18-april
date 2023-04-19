package th.co.opentechlab.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.co.opentechlab.spring.entity.CountryEntity;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<CountryEntity, String> {
    List<CountryEntity> findByContinent(String continent);

}
