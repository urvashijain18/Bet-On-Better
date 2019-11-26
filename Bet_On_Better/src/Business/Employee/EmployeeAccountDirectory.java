/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author devma
 */
public class EmployeeAccountDirectory {
    private ArrayList<EmployeeAccount> employeeAccountList;

    public EmployeeAccountDirectory() {
        employeeAccountList = new ArrayList();
    }

    public ArrayList<EmployeeAccount> getEmployeeAccountList() {
        return employeeAccountList;
    }
    
    public EmployeeAccount authenticateEmployee(String username, String password){
        for (EmployeeAccount ea : employeeAccountList)
            if (ea.getUsername().equals(username) && ea.getPassword().equals(password)){
                return ea;
            }
        return null;
    }
    
    public EmployeeAccount createEmployeeAccount(String username, String password, Role role){
        EmployeeAccount employeeAccount = new EmployeeAccount();
        employeeAccount.setUsername(username);
        employeeAccount.setPassword(password);
        employeeAccount.setRole(role);
        employeeAccountList.add(employeeAccount);
        return employeeAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (EmployeeAccount ea : employeeAccountList){
            if (ea.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
}
