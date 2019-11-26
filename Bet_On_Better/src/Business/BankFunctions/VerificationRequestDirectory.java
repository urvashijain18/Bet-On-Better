/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BankFunctions;

import Business.WorkQueue.VerificationRequest;
import java.util.ArrayList;

/**
 *
 * @author Urvashi
 */
public class VerificationRequestDirectory {
    private ArrayList<VerificationRequest> verificationRequestList;
   
    public VerificationRequestDirectory(){
        verificationRequestList = new ArrayList<>();
    }
    
    public ArrayList<VerificationRequest> getEnterpriseList() {
        return verificationRequestList;
    }

    public void setEnterpriseList(ArrayList<VerificationRequest> verificationRequestList) {
        this.verificationRequestList = verificationRequestList;
    }
}
