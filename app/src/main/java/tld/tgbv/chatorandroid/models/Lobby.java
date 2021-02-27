package tld.tgbv.chatorandroid.models;

import java.util.ArrayList;
import java.util.HashMap;

public class Lobby {
    // db data
    private int id;
    private String nick;
    private String created_at;
    private String updated_at;

    // is gonna have the users
    private ArrayList<User> users;

    // instantiates new lobby
    public Lobby(){}

    // instantiates with eventual properties
    public Lobby(HashMap<String, Object> input){
        if(input.containsKey("id")) this.id = (int)input.get("id");
        if(input.containsKey("created_at")) this.created_at = (String)input.get("created_at");
        if(input.containsKey("updated_at")) this.updated_at = (String)input.get("updated_at");
        if(input.containsKey("nick")) this.nick = (String)input.get("nick");
    }

    /**
    *   getters and setters
     */
    public Lobby setUpdatedAt(String updated_at) {
        this.updated_at = updated_at;
        return this;
    }
    public String getUpdatedAt() {
        return updated_at;
    }
    public Lobby setCreatedAt(String created_at) {
        this.created_at = created_at;
        return this;
    }
    public String getCreatedAt() {
        return created_at;
    }
    public int getId() {
        return id;
    }
    public Lobby setNick(String newNick){
        this.nick = newNick;
        return this;
    }
    public String getNick(){
        return this.nick;
    }

}
