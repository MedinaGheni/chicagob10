package apiModels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {

    private String firstName;
    private String lastName;
    private Contact contact;
    private Company company;
    private int batch;

    public int getBatch() {
        return batch;
    }



    public Company getCompany() {
        return company;
    }



    public Contact getContact() {
        return contact;
    }



    public String getFirstName() {
        return firstName;
    }



    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
