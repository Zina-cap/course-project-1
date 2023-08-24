package ru.tsystems.devschool.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import ru.tsystems.devschool.model.CourseRegistrationDto;
import ru.tsystems.devschool.model.MentorDto;
import ru.tsystems.devschool.model.SchoolDto;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StudentDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-08-24T22:29:15.694+03:00")

public class StudentDto  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("mentor")
  private MentorDto mentor = null;

  @JsonProperty("school")
  private SchoolDto school = null;

  @JsonProperty("courses")
  @Valid
  private List<CourseRegistrationDto> courses = null;

  @JsonProperty("version")
  private Long version = null;

  public StudentDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Internal (from database) id of Mentor
   * @return id
  **/
  @ApiModelProperty(value = "Internal (from database) id of Mentor")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public StudentDto firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "First name")
  @NotNull


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public StudentDto lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "Last name")
  @NotNull


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public StudentDto email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email
   * @return email
  **/
  @ApiModelProperty(value = "Email")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public StudentDto phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Phone nubmer
   * @return phone
  **/
  @ApiModelProperty(required = true, value = "Phone nubmer")
  @NotNull


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public StudentDto mentor(MentorDto mentor) {
    this.mentor = mentor;
    return this;
  }

  /**
   * Mentor of student
   * @return mentor
  **/
  @ApiModelProperty(value = "Mentor of student")

  @Valid

  public MentorDto getMentor() {
    return mentor;
  }

  public void setMentor(MentorDto mentor) {
    this.mentor = mentor;
  }

  public StudentDto school(SchoolDto school) {
    this.school = school;
    return this;
  }

  /**
   * School number
   * @return school
  **/
  @ApiModelProperty(required = true, value = "School number")
  @NotNull

  @Valid

  public SchoolDto getSchool() {
    return school;
  }

  public void setSchool(SchoolDto school) {
    this.school = school;
  }

  public StudentDto courses(List<CourseRegistrationDto> courses) {
    this.courses = courses;
    return this;
  }

  public StudentDto addCoursesItem(CourseRegistrationDto coursesItem) {
    if (this.courses == null) {
      this.courses = new ArrayList<>();
    }
    this.courses.add(coursesItem);
    return this;
  }

  /**
   * Get courses
   * @return courses
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CourseRegistrationDto> getCourses() {
    return courses;
  }

  public void setCourses(List<CourseRegistrationDto> courses) {
    this.courses = courses;
  }

  public StudentDto version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * Version of object
   * @return version
  **/
  @ApiModelProperty(value = "Version of object")


  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentDto studentDto = (StudentDto) o;
    return Objects.equals(this.id, studentDto.id) &&
        Objects.equals(this.firstName, studentDto.firstName) &&
        Objects.equals(this.lastName, studentDto.lastName) &&
        Objects.equals(this.email, studentDto.email) &&
        Objects.equals(this.phone, studentDto.phone) &&
        Objects.equals(this.mentor, studentDto.mentor) &&
        Objects.equals(this.school, studentDto.school) &&
        Objects.equals(this.courses, studentDto.courses) &&
        Objects.equals(this.version, studentDto.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, email, phone, mentor, school, courses, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    mentor: ").append(toIndentedString(mentor)).append("\n");
    sb.append("    school: ").append(toIndentedString(school)).append("\n");
    sb.append("    courses: ").append(toIndentedString(courses)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

