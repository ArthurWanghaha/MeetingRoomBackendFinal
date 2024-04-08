package com.example.MeetingRoom;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Meeting")
public class Documents {
    @Id
    private String id;

    private String title;

    private Binary documents;

    private String folderName;

    public String getFolderName() {
        return folderName;
    }

    public void setDocuments(Binary documents) {
        this.documents = documents;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Binary getDocuments() {
        return documents;
    }

    public Documents(String title, String folderName) {
        this.title = title;
        this.folderName = folderName;
    }
}
