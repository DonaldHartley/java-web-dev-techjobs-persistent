package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {
  
  public String getDescription() {
    return description;
  }
  
  @Size(max=255)
  public String description;
  
  public Skill (){}
  
}