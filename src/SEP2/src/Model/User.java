package SEP2.src.Model;

public class User
{
  private String FirstName;
  private String LastName;
  private String Email;
  private String PhoneNumber;
  private String Username;
  private String Password;
  private String DOB;
  private String Gender;
  private String Nationality;
  private String HomeAddress;
  private String ID;

  public User(String FirstName, String LastName, String Email, String PhoneNumber, String Username, String Password, String DOB)
  {
    this.FirstName = FirstName;
    this.LastName = LastName;
    this.Email = Email;
    this.PhoneNumber = PhoneNumber;
    this.Username = Username;
    this.Password = Password;
    this.DOB = DOB;
  }

  public String getFirstName()
  {
    return FirstName;
  }

  public String getLastName()
  {
    return LastName;
  }

  public String getEmail()
  {
    return Email;
  }

  public String getPhoneNumber()
  {
    return PhoneNumber;
  }
  public String getUsername()
  {
    return Username;
  }

  public String getPassword()
  {
    return Password;
  }
  public String getDOB()
  {
    return DOB;
  }
}
