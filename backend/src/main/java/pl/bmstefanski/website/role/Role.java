package pl.bmstefanski.website.role;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Role {

  @Id
  private ObjectId identifier;
  private String name;

  Role() {

  }

  Role(ObjectId identifier, String name) {
    this.identifier = identifier;
    this.name = name;
  }

  public ObjectId getIdentifier() {
    return this.identifier;
  }

  public void setIdentifier(ObjectId identifier) {
    this.identifier = identifier;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
