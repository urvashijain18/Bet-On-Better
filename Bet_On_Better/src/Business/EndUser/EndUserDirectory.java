/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EndUser;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author devma
 */
public class EndUserDirectory {
    private ArrayList<EndUser> endUserList;

    public EndUserDirectory() {
        endUserList = new ArrayList();
    }

    public ArrayList<EndUser> getEndUserList() {
        return endUserList;
    }
    
    public EndUser createUserAccount(String username, String password, Role role){
        EndUser endUser =new EndUser();
        endUser.setUsername(username);
        endUser.setPassword(password);
        endUser.setRole(role);
        endUserList.add(endUser);
        return endUser;
    }
}
