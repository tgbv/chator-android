package tld.tgbv.chatorandroid.models;

import java.util.ArrayList;
import java.util.HashMap;

public class Users {
    // holds the users
    private ArrayList<User> users;

    // holds users count
    private int length = 0;

    // instantiate
    public Users(){}

    // instantiate with users
    public Users(ArrayList<User> input){
        this.users = input;
    }

    /**
     * getters and setters
     */
    public int getLength() {
        return length;
    }
    public ArrayList<User> get(){
        return this.users;
    }

    /**
     * adds new user
     *
     * @param userData
     * @return this
     */
    public Users push(HashMap<String, Object> userData)
    {
        this.users.add( new User(userData) );
        this.length++;
        return this;
    }

    /**
     * removes a user from list
     *
     * @param index
     * @return this
     * @throws Exception
     */
    public Users remove(int index) throws Exception {
        // check for index
        if(index < 0 || index > this.length-1) throw new Exception("Index out of bound.");

        // remove
        this.users.remove(index);

        // update counter
        this.length--;

        //
        return this;
    }

    /**
     * sets a user object to a custom index
     *
     * @param index
     * @param userObject
     * @return this
     * @throws Exception
     */
    public Users setUser(int index, User userObject) throws  Exception {
        // check for index
        if(index < 0 || index > this.length-1) throw new Exception("Index out of bound.");

        // set
        this.users.set(index, userObject);

        return this;
    }


}
