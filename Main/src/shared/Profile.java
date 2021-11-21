package shared;

import java.util.ArrayList;

public class Profile
  {
    private String firstName;
    private String lastName;
    private String email;
    private long phone;
    private long accountNumber;
    private ArrayList<Message> notifications;
    private ArrayList<Transaction> transactions;

    public Profile(String firstName, String lastName, String email, long phone, long accountNumber)
      {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.accountNumber = accountNumber;
      }

    public String getFirstName()
      {
        return firstName;
      }

    public void setFirstName(String firstName)
      {
        this.firstName = firstName;
      }

    public String getLastName()
      {
        return lastName;
      }

    public void setLastName(String lastName)
      {
        this.lastName = lastName;
      }

    public String getEmail()
      {
        return email;
      }

    public void setEmail(String email)
      {
        this.email = email;
      }

    public long getPhone()
      {
        return phone;
      }

    public void setPhone(long phone)
      {
        this.phone = phone;
      }

    public long getAccountNumber()
      {
        return accountNumber;
      }

    public void setAccountNumber(long accountNumber)
      {
        this.accountNumber = accountNumber;
      }

    public ArrayList<Message> getNotifications()
      {
        return notifications;
      }

    public void setNotifications(ArrayList<Message> notifications)
      {
        this.notifications = notifications;
      }

    public ArrayList<Transaction> getTransactions()
      {
        return transactions;
      }

    public void setTransactions(ArrayList<Transaction> transactions)
      {
        this.transactions = transactions;
      }
  }
