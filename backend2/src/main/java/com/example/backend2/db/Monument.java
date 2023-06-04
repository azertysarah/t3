package com.example.backend2.db;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "monuments")
public class Monument {
    @Id
    private ObjectId dataset_id;

    private String record_timestamp;

    private Fields fields;
}
