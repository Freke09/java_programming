// 3.1 Account.java
// Creat Account class that contains a name instance variable and methods to set and get its value

public class Account
{
    private String name; // instace variable

    // Method to set the name in the object
    public void setName(String name)
    {
        this.name = name; // store the name
    }
        // method to retrieve the name from the object
        public String getName()
        {
            return name; // return value of name to caller
        }
}