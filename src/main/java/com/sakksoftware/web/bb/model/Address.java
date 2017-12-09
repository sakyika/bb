package com.sakksoftware.web.bb.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Address {

    @Id
    private String id;

    private String unitNumber;

    private String streetNumber;

    private String streetName;

    private String city;

    private String provinceState;

    private String postalCode;

    private String country;

}
