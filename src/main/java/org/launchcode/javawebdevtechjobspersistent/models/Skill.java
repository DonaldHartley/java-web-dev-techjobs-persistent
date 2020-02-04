package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
  
  @ManyToMany(mappedBy = "skills")
  private List<Job> jobs = new ArrayList<>();
  
  public String getDescription() {
    return description;
  }
  
  @Size(max=255)
  public String description;
  
  public Skill (){}
  
}