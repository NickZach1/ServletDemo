/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uclan.co4752;

/**
 *
 * @author Li GUo
 */
public class User
{

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
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
    private String userName;
    private String firstName;
    private String lastName;
}
