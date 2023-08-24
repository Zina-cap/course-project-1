package ru.tsystems.devschool.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MentorDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-08-24T22:29:15.694+03:00")

public class MentorDto  implements Serializable {
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

  @JsonProperty("version")
  private Long version = null;

  public MentorDto id(Long id) {
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

  public MentorDto firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name
   * @return firstName
  **/
  @ApiModelProperty(value = "First name")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public MentorDto lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name
   * @return lastName
  **/
  @ApiModelProperty(value = "Last name")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public MentorDto email(String email) {
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

  public MentorDto phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Phone nubmer
   * @return phone
  **/
  @ApiModelProperty(value = "Phone nubmer")


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public MentorDto version(Long version) {
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
    MentorDto mentorDto = (MentorDto) o;
    return Objects.equals(this.id, mentorDto.id) &&
        Objects.equals(this.firstName, mentorDto.firstName) &&
        Objects.equals(this.lastName, mentorDto.lastName) &&
        Objects.equals(this.email, mentorDto.email) &&
        Objects.equals(this.phone, mentorDto.phone) &&
        Objects.equals(this.version, mentorDto.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, email, phone, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MentorDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

