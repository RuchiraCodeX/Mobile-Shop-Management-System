/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.BufferedReader;
import java.io.IOException;
public class Manager {
     Methods man=new Methods("Managers.txt");
   private String UserID;
   private String Name;
   private String Password;
   private String UserType;
   private int UserCount;

    public Manager(String UserID, String Name) {
        this.UserID = UserID;
        this.Name = Name;
    }

    public Manager(String UserID, String Name, String Password) {
        this.UserID = UserID;
        this.Name = Name;
        this.Password = Password;
    }

    public Manager(String UserID, String Name, String Password, String UserType) {
        this.UserID = UserID;
        this.Name = Name;
        this.Password = Password;
        this.UserType = UserType;
    }

    public Manager(String UserID, String Name, String Password, String UserType, int UserCount) {
        this.UserID = UserID;
        this.Name = Name;
        this.Password = Password;
        this.UserType = UserType;
        this.UserCount = UserCount;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    public int getUserCount() {
        return UserCount;
    }

    public void setUserCount(int UserCount) {
        this.UserCount = UserCount;
    }
   
    public boolean addNewManager(){
       
       if(!man.createanewfile()){
           String record=UserID+ " " +Name+ " " +Password+ " " +UserType;
           return man.writedatatothefile(record);
           
       }
       return false;
   }
     public boolean validateLogin() {
        try {
            String[] words = null;
            
            BufferedReader users = man.readAFile();
            String user;

            while ((user = users.readLine()) != null) //M001 Name 123 manager 
            {              
                words = user.split(" "); // [0]=U001 [1]=Name [2]=Password [3]=manager

              
                if (words[0].equals(UserID) && words[1].equals(Name)&& words[2].equals(Password)&& words[3].equals(UserType)) {
                    this.setUserID(words[0]);//M001
                    this.setName(words[1]);
                    this.setPassword(words[2]);//123
                    this.setUserType(words[3]);//Manager
                    return true;
                }
            }
        }
        catch (IOException e)
        {
            System.out.println("Error"+e);
        }
        
        return false;
    }
   
}
