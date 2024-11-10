package edu.travelmore.crm.repository;

import edu.travelmore.crm.entity.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface HotelRepository extends JpaRepository<HotelEntity,Long> {
}
