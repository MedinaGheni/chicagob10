package apiModels;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Data
public class CustomResponse {




    private String firstName;
    private String lastName;
    private Contact contact;
    private List<Instructor> instructors;
    private List<Student> students;
    private Company company;
    private String jsonResponse;




    public Company getCompany() {
        return company;
    }



    public Contact getContact() {
        return contact;
    }



    public List<Student> getStudents() {
        return students;
    }



    public List<Instructor> getInstructors() {
        return instructors;
    }


    public String getLastName() {
        return lastName;
    }


    public String getFirstName() {
        return firstName;
    }


    public String getJsonResponse() {
        return jsonResponse;
    }

    public void setJsonResponse(String jsonResponse) {
        this.jsonResponse = jsonResponse;
    }
}