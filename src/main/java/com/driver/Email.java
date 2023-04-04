package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email() {
    }

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(getPassword().equals(oldPassword)){
            if(isValid(newPassword)){
                password=newPassword;
            }
        }
    }
    public boolean isValid(String password){
        Boolean cap=false;
        Boolean small=false;
        Boolean digit=false;
        Boolean special=false;
        if(password.length()<8){
            return false;
        }
        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if(ch>='A' && ch<='Z'){
                cap=true;
            }
            else if(ch>='a' && ch<='z'){
                small=true;
            }
            else if(ch>='0' && ch<='9'){
                digit=true;
            }
            else{
                special=true;
            }
        }
        if(cap && small && digit && special){
            return true;
        }
        return false;
    }
}
