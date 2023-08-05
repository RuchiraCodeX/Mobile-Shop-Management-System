
package Classes;

import java.io.BufferedReader;
import java.io.IOException;

public class Cashier {
   Methods meth=new Methods("Users.txt");
   private String UserID;
   private String Name;
   private String Password;
   private String UserType;
   private int UserCount;

    public Cashier(String UserID, String Name) {
        this.UserID = UserID;
        this.Name = Name;
    }

    public Cashier(String UserID, String Name, String Password) {
        this.UserID = UserID;
        this.Name = Name;
        this.Password = Password;
    }

    public Cashier(String UserID, String Name, String Password, String UserType) {
        this.UserID = UserID;
        this.Name = Name;
        this.Password = Password;
        this.UserType = UserType;
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
   
   
   

   public boolean addNewUser(){
       
       if(!meth.createanewfile()){
           String record=UserID+ " " +Name+ " " +Password+ " " +UserType;
           return meth.writedatatothefile(record);
           
       }
       return false;
   }
   
    public boolean validateLogin() {
        try {
            String[] words = null;
            
            BufferedReader users = meth.readAFile();
            String user;

            while ((user = users.readLine()) != null) //U001 Name 123 Cashier
            {              
                words = user.split(" "); // [0]=U001 [1]=Name [2]=Password [3]=Cashier

              
                if (words[0].equals(UserID) && words[1].equals(Name)&& words[2].equals(Password)&& words[3].equals(UserType)) {
                    this.setUserID(words[0]);
                    this.setName(words[1]);
                    this.setPassword(words[2]);
                    this.setUserType(words[3]);
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
