package edu.travelmore.crm.repository;

import edu.travelmore.crm.entity.ApartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartmentRepository extends JpaRepository<ApartmentEntity,Long> {
    
}
