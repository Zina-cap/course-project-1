package ru.tsystems.devschool.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-08-24T22:29:15.694+03:00")

public class ErrorDto  implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Error codes: * CONFLICT - Attempt to save not unique data. * NOT_FOUND - Data was not found. * BAD_REQUEST - incorrect value in request params. * INTERNAL_SERVER_ERROR - problem on server side. 
   */
  public enum ErrorEnum {
    CONFLICT("CONFLICT"),
    
    BAD_REQUEST("BAD_REQUEST"),
    
    NOT_FOUND("NOT_FOUND"),
    
    INTERNAL_SERVER_ERROR("INTERNAL_SERVER_ERROR");

    private String value;

    ErrorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ErrorEnum fromValue(String text) {
      for (ErrorEnum b : ErrorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("error")
  private ErrorEnum error = null;

  @JsonProperty("error_description")
  private String errorDescription = null;

  public ErrorDto error(ErrorEnum error) {
    this.error = error;
    return this;
  }

  /**
   * Error codes: * CONFLICT - Attempt to save not unique data. * NOT_FOUND - Data was not found. * BAD_REQUEST - incorrect value in request params. * INTERNAL_SERVER_ERROR - problem on server side. 
   * @return error
  **/
  @ApiModelProperty(required = true, value = "Error codes: * CONFLICT - Attempt to save not unique data. * NOT_FOUND - Data was not found. * BAD_REQUEST - incorrect value in request params. * INTERNAL_SERVER_ERROR - problem on server side. ")
  @NotNull


  public ErrorEnum getError() {
    return error;
  }

  public void setError(ErrorEnum error) {
    this.error = error;
  }

  public ErrorDto errorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

  /**
   * Description of error.
   * @return errorDescription
  **/
  @ApiModelProperty(value = "Description of error.")


  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDto errorDto = (ErrorDto) o;
    return Objects.equals(this.error, errorDto.error) &&
        Objects.equals(this.errorDescription, errorDto.errorDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, errorDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDto {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
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

