/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 *  @author Urvashi
 */
public class OrganizationDirectory {
  private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.AccVerif.getValue())){
            organization = new AccountVerificationOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.Animals.getValue())){
            organization = new AnimalsOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.Education.getValue())){
            organization = new EducationOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.Email.getValue())){
            organization = new EmailOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.Facebook.getValue())){
            organization = new FacebookOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.FoodAndHunger.getValue())){
            organization = new FoodAndHungerOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.FundRaisingEvents.getValue())){
            organization = new FundRaisingEventsOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.FundTransfer.getValue())){
            organization = new FundTransferOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.Health.getValue())){
            organization = new HealthOrganization();
            organizationList.add(organization);
        }
        return organization;
    }  
}