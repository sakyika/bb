package com.sakksoftware.web.bb.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Category {

    @Id
    private String id;

    private String name;

    private String description;

    @DBRef
    List<Business> businessList;

}
