package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class Employer extends AbstractEntity {
  
 
  @NotBlank
  public String location;
  
  public Employer (){}
  
  public void setLocation(String location) {
    this.location = location;
  }
  
  public String getLocation() {
    return location;
  }

}
