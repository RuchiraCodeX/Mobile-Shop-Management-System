
package Classes;

import java.io.BufferedReader;


public class PhoneDetails {
     Methods phones=new Methods("PhoneDetails.txt");
   private String PhoneId;
   private String BrandName;
   private String Name;
   private String OS;
   private String Display;
   private String Camera;
   private String Processor;
   private String RAM;
   private String Storage;
   private String Battery;
   private String Price;
   private String Category;
   private int PhoneCount;

   public PhoneDetails()
   {}

    public PhoneDetails(String PhoneId, String BrandName) {
        this.PhoneId = PhoneId;
        this.BrandName = BrandName;
    }

    public PhoneDetails(String PhoneId, String BrandName, String Name) {
        this.PhoneId = PhoneId;
        this.BrandName = BrandName;
        this.Name = Name;
    }

    public PhoneDetails(String PhoneId, String BrandName, String Name, String OS) {
        this.PhoneId = PhoneId;
        this.BrandName = BrandName;
        this.Name = Name;
        this.OS = OS;
    }

    public PhoneDetails(String PhoneId, String BrandName, String Name, String OS, String Display) {
        this.PhoneId = PhoneId;
        this.BrandName = BrandName;
        this.Name = Name;
        this.OS = OS;
        this.Display = Display;
    }

    public PhoneDetails(String PhoneId, String BrandName, String Name, String OS, String Display, String Camera) {
        this.PhoneId = PhoneId;
        this.BrandName = BrandName;
        this.Name = Name;
        this.OS = OS;
        this.Display = Display;
        this.Camera = Camera;
    }

    public PhoneDetails(String PhoneId, String BrandName, String Name, String OS, String Display, String Camera, String Processor) {
        this.PhoneId = PhoneId;
        this.BrandName = BrandName;
        this.Name = Name;
        this.OS = OS;
        this.Display = Display;
        this.Camera = Camera;
        this.Processor = Processor;
    }

    public PhoneDetails(String PhoneId, String BrandName, String Name, String OS, String Display, String Camera, String Processor, String RAM) {
        this.PhoneId = PhoneId;
        this.BrandName = BrandName;
        this.Name = Name;
        this.OS = OS;
        this.Display = Display;
        this.Camera = Camera;
        this.Processor = Processor;
        this.RAM = RAM;
    }

    public PhoneDetails(String PhoneId, String BrandName, String Name, String OS, String Display, String Camera, String Processor, String RAM, String Storage) {
        this.PhoneId = PhoneId;
        this.BrandName = BrandName;
        this.Name = Name;
        this.OS = OS;
        this.Display = Display;
        this.Camera = Camera;
        this.Processor = Processor;
        this.RAM = RAM;
        this.Storage = Storage;
    }

    public PhoneDetails(String PhoneId, String BrandName, String Name, String OS, String Display, String Camera, String Processor, String RAM, String Storage, String Battery) {
        this.PhoneId = PhoneId;
        this.BrandName = BrandName;
        this.Name = Name;
        this.OS = OS;
        this.Display = Display;
        this.Camera = Camera;
        this.Processor = Processor;
        this.RAM = RAM;
        this.Storage = Storage;
        this.Battery = Battery;
    }

    public PhoneDetails(String PhoneId, String BrandName, String Name, String OS, String Display, String Camera, String Processor, String RAM, String Storage, String Battery, String Price) {
        this.PhoneId = PhoneId;
        this.BrandName = BrandName;
        this.Name = Name;
        this.OS = OS;
        this.Display = Display;
        this.Camera = Camera;
        this.Processor = Processor;
        this.RAM = RAM;
        this.Storage = Storage;
        this.Battery = Battery;
        this.Price = Price;
    }

    public PhoneDetails(String PhoneId, String BrandName, String Name, String OS, String Display, String Camera, String Processor, String RAM, String Storage, String Battery, String Price, String Category) {
        this.PhoneId = PhoneId;
        this.BrandName = BrandName;
        this.Name = Name;
        this.OS = OS;
        this.Display = Display;
        this.Camera = Camera;
        this.Processor = Processor;
        this.RAM = RAM;
        this.Storage = Storage;
        this.Battery = Battery;
        this.Price = Price;
        this.Category = Category;
    }

    public PhoneDetails(String PhoneId, String BrandName, String Name, String OS, String Display, String Camera, String Processor, String RAM, String Storage, String Battery, String Price, String Category, int PhoneCount) {
        this.PhoneId = PhoneId;
        this.BrandName = BrandName;
        this.Name = Name;
        this.OS = OS;
        this.Display = Display;
        this.Camera = Camera;
        this.Processor = Processor;
        this.RAM = RAM;
        this.Storage = Storage;
        this.Battery = Battery;
        this.Price = Price;
        this.Category = Category;
        this.PhoneCount = PhoneCount;
    }

    public String getPhoneId() {
        return PhoneId;
    }

    public void setPhoneId(String PhoneId) {
        this.PhoneId = PhoneId;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getDisplay() {
        return Display;
    }

    public void setDisplay(String Display) {
        this.Display = Display;
    }

    public String getCamera() {
        return Camera;
    }

    public void setCamera(String Camera) {
        this.Camera = Camera;
    }

    public String getProcessor() {
        return Processor;
    }

    public void setProcessor(String Processor) {
        this.Processor = Processor;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getStorage() {
        return Storage;
    }

    public void setStorage(String Storage) {
        this.Storage = Storage;
    }

    public String getBattery() {
        return Battery;
    }

    public void setBattery(String Battery) {
        this.Battery = Battery;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public int getPhoneCount() {
        return PhoneCount;
    }

    public void setPhoneCount(int PhoneCount) {
        this.PhoneCount = PhoneCount;
    }
    

   
  
    public boolean addNewPhone(){
       
       if(!phones.createanewfile()){
           
           String record=PhoneId+" "+BrandName+" "+Name+" "+OS+" "+Display+" "+Camera+" "+Processor+" "+RAM+" "+Storage+" "+Battery+" "+Price+" "+Category+" ";
           return phones.writedatatothefile(record);
           
       }
       return false;
   }
     public boolean SearchPhones(String PhoneId)
      {
        boolean Found = false;
         
        try {
            String[] words = null;
            
            BufferedReader phone = phones.readAFile();
            String Sphone;
            
            outerloop:
            while (( Sphone= phone.readLine()) != null)
            {            
                words = Sphone.split(" "); 
                
                for (String word : words)
                {
                    if (word.equals(PhoneId))
                    {
                        Found = true;
                        
                    
                    this.setBrandName(words[0]);
                    this.setName(words[1]);
                    this.setOS(words[2]);
                    this.setDisplay(words[3]);
                    this.setCamera(words[4]);
                    this.setProcessor(words[5]);
                    this.setRAM(words[6]);
                    this.setStorage(words[7]);
                    this.setBattery(words[8]);
                    this.setPrice(words[9]);
                    this.setCategory(words[10]);
                    
                        break outerloop;
                    }
                }
            }
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        
        return Found;
      }


    
     public String viewAllphones () 
        {
        String Phone, allphones = " ";
        String[] words = null;
        int count = 0;

        BufferedReader phoneDetails = phones.readAFile();

        try {
            while ((Phone = phoneDetails.readLine()) != null)
            {    
                words = Phone.split(" ");             
                allphones = allphones + words[0] +  "\t" +  words[1] + "\t" + words[2] + "\t" + words[3]
                        + "\t" + words[4] + "\t" + words[5] + "\t" + words[6] + "\t" + words[7] + "\t" + words[8]
                        + "\t" + words[9] + "\t" + words[10] + "\t" + words[11] + "\t" + words[12];
                           
                count++; 
            }
        } catch (Exception e) {
            System.err.println("ERROR"+e);
        }
        
        setPhoneCount(count);//2
        return allphones;
    }
        
    
  
   
}
