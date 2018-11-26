package pl.bmstefanski.website.user;

import java.io.Serializable;
import java.util.Set;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import pl.bmstefanski.website.role.Role;

@Document
public class User implements Serializable {

  @Id
  private ObjectId identifier;
  private String username;
  private String email;
  private String password;
  private Set<Role> roles;

  User() {
  }

  User(ObjectId identifier, String username, String email, String password, Set<Role> roles) {
    this.identifier = identifier;
    this.username = username;
    this.email = email;
    this.password = password;
    this.roles = roles;
  }

  public ObjectId getIdentifier() {
    return this.identifier;
  }

  public void setIdentifier(ObjectId identifier) {
    this.identifier = identifier;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Set<Role> getRoles() {
    return this.roles;
  }

  public void setRoles(Set<Role> roles) {
    this.roles = roles;
  }

}
