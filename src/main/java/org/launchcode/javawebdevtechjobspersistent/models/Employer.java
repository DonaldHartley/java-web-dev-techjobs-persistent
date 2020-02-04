package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
  
  
  @OneToMany
  @JoinColumn
  private List<Job> jobs = new ArrayList<>();
  
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
