package edu.upc.eetac.dsa.talker.auth;

import edu.upc.eetac.dsa.talker.entity.Role;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergi1 on 28/10/2015.
*/
public class UserInfo implements Principal {
    private String name;
    private List<Role> roles = new ArrayList<>();

    public UserInfo() {
    }

    public UserInfo(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}