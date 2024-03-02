package model;

public class Address {
  public Address(String address, int zipCode, String state, String country) {
    this.address = address;
    this.zipCode = zipCode;
    this.state = state;
    this.country = country;
  }

  private String address;

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getZipCode() {
    return zipCode;
  }

  public void setZipCode(int zipCode) {
    this.zipCode = zipCode;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  private int zipCode;
  private String state;
  private String country;

}
