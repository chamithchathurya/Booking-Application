package edu.travelmore.crm.repository;

import edu.travelmore.crm.entity.RestaurentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface RestaurentRepository extends JpaRepository<RestaurentEntity,Long> {
}
