/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BankFunctions;

import java.util.ArrayList;

/**
 *
 * @author Urvashi
 */
public class FundAllocationRequestDirectory {
    private ArrayList<FundAllocationRequest> fundAllocationRequestsList;
   
    public FundAllocationRequestDirectory(){
        fundAllocationRequestsList = new ArrayList<>();
    }
    
    public ArrayList<FundAllocationRequest> getEnterpriseList() {
        return fundAllocationRequestsList;
    }

    public void setEnterpriseList(ArrayList<FundAllocationRequest> fundAllocationRequestsList) {
        this.fundAllocationRequestsList = fundAllocationRequestsList;
    }
}