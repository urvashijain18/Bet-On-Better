/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.WorkRequest.VerificationRequestByBank;
import java.util.ArrayList;

/**
 *
 * @author Urvashi
 */
public class VerificationRequestDirectory {
    private ArrayList<VerificationRequestByBank> verificationRequestList;
   
    public VerificationRequestDirectory(){
        verificationRequestList = new ArrayList<>();
    }
    
    public ArrayList<VerificationRequestByBank> getEnterpriseList() {
        return verificationRequestList;
    }

    public void setEnterpriseList(ArrayList<VerificationRequestByBank> verificationRequestList) {
        this.verificationRequestList = verificationRequestList;
    }
}
