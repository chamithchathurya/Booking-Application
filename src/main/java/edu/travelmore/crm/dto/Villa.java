package edu.travelmore.crm.dto;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Villa {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String location;


    private Amenities amenities;
}
