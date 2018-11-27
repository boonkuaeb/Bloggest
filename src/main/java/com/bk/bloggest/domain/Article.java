package com.bk.bloggest.domain;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.security.core.userdetails.User;

import java.util.Date;

@Document(indexName = "bloggest_article", type = "article")
@Data
public class Article {
    @Id
    private String id;

    private String title;
    private String link;
    private String summary;
    private String body;

    @Field(type = FieldType.Nested)
    private User author;

    @Field(type = FieldType.Date)
    private Date createdBy = new Date() ;
}
