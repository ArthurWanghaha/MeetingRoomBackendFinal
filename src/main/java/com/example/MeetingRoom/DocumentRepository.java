package com.example.MeetingRoom;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DocumentRepository extends MongoRepository<Documents, String> {
    List<Documents> findByFolderName(String folderName);
}
