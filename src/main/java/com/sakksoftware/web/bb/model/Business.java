package com.sakksoftware.web.bb.model;

import com.fasterxml.jackson.annotation.JsonProperty;
//import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Locale;

@Data
@Document
public class Business {

    @Id
    private String id;

    private String name;

    private List<String> email;

    private List<String> phone;

    private String website;

    private String description;

    private String avatarImage;

    private String featuredImage;

    private boolean verified;

    @DBRef
    private User user;

    @JsonProperty
    private List<GeoJsonPoint> location;

    @DBRef
    private List<Address> addressList;

    @DBRef
    private List<Category> categoryList;

}

