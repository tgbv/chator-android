package tld.tgbv.chatorandroid.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;

public class Lobbies {
    // holds the lobbies
    private ArrayList<Lobby> lobbies;

    // holds users count
    private int length = 0;

    // instantiate
    public Lobbies(){
        this.lobbies = new ArrayList<>();
    }

    // instantiate with lobbies
    public Lobbies(ArrayList<Lobby> input){
        this.lobbies = input;
    }

    /**
     * getters and setters
     */
    public int getLength() {
        return length;
    }
    public ArrayList<Lobby> get(){
        return this.lobbies;
    }

    /**
     * adds new lobby
     *
     * @param lobbyData
     * @return this
     */
    public Lobbies push(HashMap<String, Object> lobbyData)
    {
        Lobby lobby = new Lobby(lobbyData);
        this.lobbies.add( lobby );
        this.length++;
        return this;
    }

    /**
     * removes a lobby from list
     *
     * @param index
     * @return this
     * @throws Exception
     */
    public Lobbies remove(int index) throws Exception {
        // check for index
        if(index < 0 || index > this.length-1) throw new Exception("Index out of bound.");

        // remove
        this.lobbies.remove(index);

        // update counter
        this.length--;

        //
        return this;
    }

    /**
     * sets a lobby object to a custom index
     *
     * @param index
     * @param lobbyObject
     * @return this
     * @throws Exception
     */
    public Lobbies setLobby(int index, Lobby lobbyObject) throws  Exception {
        // check for index
        if(index < 0 || index > this.length-1) throw new Exception("Index out of bound.");

        // set
        this.lobbies.set(index, lobbyObject);

        return this;
    }

}
