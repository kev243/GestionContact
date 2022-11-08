public class Contact {
    private String lastName;
    private String firstName;
    private String phoneNumber;


    public Contact (String lastName, String firstName, String phoneNumber){
        this.lastName = lastName;
        this.firstName= firstName;
        this.phoneNumber=phoneNumber;
    }

    //get et le set

    public String getLastName(String lastName){
        return lastName;
    }
    public void setLastName(String firstName){
        this.lastName=lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    @Override
    public String toString(){
        return  this.lastName+" "+ this.firstName+" "+ phoneNumber;
    }
}
