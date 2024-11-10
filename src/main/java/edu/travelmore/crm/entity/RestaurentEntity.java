package edu.travelmore.crm.entity;

import edu.travelmore.crm.dto.Amenities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "Restaurant")
public class RestaurentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String location;

    @Embedded
    private Amenities amenities;

}
