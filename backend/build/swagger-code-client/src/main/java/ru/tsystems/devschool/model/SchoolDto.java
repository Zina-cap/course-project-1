package ru.tsystems.devschool.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SchoolDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-08-24T22:29:15.694+03:00")

public class SchoolDto  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("number")
  private Integer number = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("version")
  private Long version = null;

  public SchoolDto id(Long id) {
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

  public SchoolDto number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Ordinal number of School
   * @return number
  **/
  @ApiModelProperty(value = "Ordinal number of School")


  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public SchoolDto startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start date
   * @return startDate
  **/
  @ApiModelProperty(value = "Start date")

  @Valid

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public SchoolDto endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End date
   * @return endDate
  **/
  @ApiModelProperty(value = "End date")

  @Valid

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public SchoolDto version(Long version) {
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
    SchoolDto schoolDto = (SchoolDto) o;
    return Objects.equals(this.id, schoolDto.id) &&
        Objects.equals(this.number, schoolDto.number) &&
        Objects.equals(this.startDate, schoolDto.startDate) &&
        Objects.equals(this.endDate, schoolDto.endDate) &&
        Objects.equals(this.version, schoolDto.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, number, startDate, endDate, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchoolDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

