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
 * SearchStudentsDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-08-24T22:29:15.694+03:00")

public class SearchStudentsDto  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("schoolNumber")
  private Integer schoolNumber = null;

  public SearchStudentsDto schoolNumber(Integer schoolNumber) {
    this.schoolNumber = schoolNumber;
    return this;
  }

  /**
   * Number of school
   * @return schoolNumber
  **/
  @ApiModelProperty(value = "Number of school")


  public Integer getSchoolNumber() {
    return schoolNumber;
  }

  public void setSchoolNumber(Integer schoolNumber) {
    this.schoolNumber = schoolNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchStudentsDto searchStudentsDto = (SearchStudentsDto) o;
    return Objects.equals(this.schoolNumber, searchStudentsDto.schoolNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schoolNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchStudentsDto {\n");
    
    sb.append("    schoolNumber: ").append(toIndentedString(schoolNumber)).append("\n");
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

