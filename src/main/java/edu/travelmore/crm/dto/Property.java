package edu.travelmore.crm.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Property {

    private Long id;
    private String name;
    private String location;
    private String description;
    private double price;
    private String type;
}
