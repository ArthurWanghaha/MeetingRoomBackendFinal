package com.example.MeetingRoom;

public class UserDetailsDTO {
    private String email;
    private String jobTitle;
    private String username;
    private String number;
    private String address;
    private String bio;

    public UserDetailsDTO(String email, String jobTitle, String username, String number, String address, String bio) {
        this.email = email;
        this.jobTitle = jobTitle;
        this.username = username;
        this.number = number;
        this.address = address;
        this.bio = bio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
// Getters and setters
}