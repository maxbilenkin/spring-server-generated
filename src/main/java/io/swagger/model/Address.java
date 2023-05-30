package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Address
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-30T02:05:22.682550422Z[GMT]")


public class Address   {
  @JsonProperty("street")
  private String street = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("zipcode")
  private Integer zipcode = null;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    VA("VA"),
    
    CA("CA"),
    
    TX("TX"),
    
    NY("NY");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("state")
  private StateEnum state = null;

  public Address street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Get street
   * @return street
   **/
  @Schema(example = "112 John Smith Rd", description = "")
  
    public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
   **/
  @Schema(example = "McLean", description = "")
  
    public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address zipcode(Integer zipcode) {
    this.zipcode = zipcode;
    return this;
  }

  /**
   * Get zipcode
   * @return zipcode
   **/
  @Schema(example = "22201", description = "")
  
    public Integer getZipcode() {
    return zipcode;
  }

  public void setZipcode(Integer zipcode) {
    this.zipcode = zipcode;
  }

  public Address state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   **/
  @Schema(description = "")
  
    public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.street, address.street) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.zipcode, address.zipcode) &&
        Objects.equals(this.state, address.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street, city, zipcode, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
