package edu.travelmore.crm.service.villa;

import edu.travelmore.crm.dto.Apartment;
import edu.travelmore.crm.dto.Villa;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface VillaService {
    public void addVilla(Villa villa);

    public List<Villa> getAllVilla();
}
