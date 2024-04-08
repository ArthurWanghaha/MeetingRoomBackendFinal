package com.example.MeetingRoom;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

public class User {
    @Id
    private String id;
    private String email;

    private String jobTitle;
    private String username;

    private String number;

    private String address;

    private String Bio;
    private List<String> institutions;
    private String password;
    private Binary profilePicture;

    public void setProfilePicture(Binary profilePicture) {
        this.profilePicture = profilePicture;
    }

    public Binary getProfilePicture() {
        return profilePicture;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBio(String bio) {
        Bio = bio;
    }

    public String getNumber() {
        return number;
    }

    public String getAddress() {
        return address;
    }

    public String getBio() {
        return Bio;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setInstitutions(List<String> institutions) {
        this.institutions = institutions;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public List<String> getInstitutions() {
        return institutions;
    }

    public String getPassword() {
        return password;
    }

    // Getters and setters
}
