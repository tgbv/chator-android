package tld.tgbv.chatorandroid.models;

import java.util.HashMap;

public class User {
    // db data
    private int id;
    private String username;
//    private LocalDateTime created_at;
//    private LocalDateTime updated_at;
    private String created_at;
    private String updated_at;

    // creates new user model
    public User(){}

    // creates new user and assign the eventual properties
    public User(HashMap<String, Object> input){
        if(input.containsKey("id")) this.id = (int)input.get("id");
        if(input.containsKey("username")) this.username = (String) input.get("username");
        if(input.containsKey("created_at")) this.created_at = (String) input.get("created_at");
        if(input.containsKey("updated_at")) this.updated_at = (String)input.get("updated_at");
    }

    // getters
    public int getId() {  return id;  }
    public String getUsername() {  return username;  }
    public String getCreatedAt() { return created_at; }
    public String getUpdatedAt() { return updated_at; }

    // setters
//    public User setId(int n) {  this.id = n; return this;  } <-- this doesn't  make sense yet
    public User setUsername(String n) { this.username = n; return this;  }
    public User setCreatedAt(String n) { this.created_at = n; return this; }
    public User getUpdatedAt(String n) { this.updated_at = n; return this; }

}
