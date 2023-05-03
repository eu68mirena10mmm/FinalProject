package ru.croc;

public class  RoleChecker {
    public RoleChecker() {
    }
    public boolean hasRole(String role) {
        if (new WordCRUD().roleCheckDB(role)){
            return true;
        } else {
            return false;
        }
    }

}

