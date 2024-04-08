package com.example.MeetingRoom;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class DocumentService {

    @Autowired
    private DocumentRepository documentRepo;

    public String addDocuments(String title, String folderName, MultipartFile file) throws IOException {
        Documents document = new Documents(title, folderName);
        document.setDocuments(new Binary(BsonBinarySubType.BINARY, file.getBytes()));
        document = documentRepo.insert(document);
        return document.getId();
    }

    public List<Documents> getDocumentsByFolder(String folderName) {
        return documentRepo.findByFolderName(folderName);
    }
    public Documents getPhoto(String id) {
        return documentRepo.findById(id).get();
    }
}
