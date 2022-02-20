package com.example.tfg.data.model;
import androidx.room.*;
/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
@Entity(tableName = "user")
public class LoggedInUser {
    @PrimaryKey(autoGenerate = true)
    private String userId;
    private String displayName;

    public LoggedInUser(String userId, String displayName) {
        this.userId = userId;
        this.displayName = displayName;
    }

    public String getUserId() {
        return userId;
    }

    public String getDisplayName() {
        return displayName;
    }
}