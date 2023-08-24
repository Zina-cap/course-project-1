package ru.tsystems.devschool.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import ru.tsystems.devschool.model.CourseDto;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CourseRegistrationDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-08-24T22:29:15.694+03:00")

public class CourseRegistrationDto  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("course")
  private CourseDto course = null;

  @JsonProperty("mark")
  private Integer mark = null;

  @JsonProperty("version")
  private Long version = null;

  public CourseRegistrationDto course(CourseDto course) {
    this.course = course;
    return this;
  }

  /**
   * Course
   * @return course
  **/
  @ApiModelProperty(value = "Course")

  @Valid

  public CourseDto getCourse() {
    return course;
  }

  public void setCourse(CourseDto course) {
    this.course = course;
  }

  public CourseRegistrationDto mark(Integer mark) {
    this.mark = mark;
    return this;
  }

  /**
   * Mark for course
   * @return mark
  **/
  @ApiModelProperty(value = "Mark for course")


  public Integer getMark() {
    return mark;
  }

  public void setMark(Integer mark) {
    this.mark = mark;
  }

  public CourseRegistrationDto version(Long version) {
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
    CourseRegistrationDto courseRegistrationDto = (CourseRegistrationDto) o;
    return Objects.equals(this.course, courseRegistrationDto.course) &&
        Objects.equals(this.mark, courseRegistrationDto.mark) &&
        Objects.equals(this.version, courseRegistrationDto.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(course, mark, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourseRegistrationDto {\n");
    
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
    sb.append("    mark: ").append(toIndentedString(mark)).append("\n");
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

