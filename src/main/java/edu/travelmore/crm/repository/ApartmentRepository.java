package edu.travelmore.crm.repository;

import edu.travelmore.crm.entity.ApartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ApartmentRepository extends JpaRepository<ApartmentEntity,Long> {
    
}
