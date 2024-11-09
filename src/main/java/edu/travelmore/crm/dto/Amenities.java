package edu.travelmore.crm.dto;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Amenities {
    private boolean wifi;
    private boolean parking;
    private boolean pool;
    private boolean gym;
    private boolean ac;
}
