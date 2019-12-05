/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EndUser;

import Business.UserAccount.UserAccount;

/**
 *
 * @author devma
 */
public class EndUser extends UserAccount{
    private AccountDetails accountDetails;

    public AccountDetails getAccountDetails() {
        return accountDetails;
    }

    public void setAccountDetails(AccountDetails accountDetails) {
        this.accountDetails = accountDetails;
    }
      
}
