package com.plivo.api.models.compliancerequirement;

import com.plivo.api.models.base.Getter;
import retrofit2.Call;

public class ComplianceRequirementLister extends Getter<ComplianceRequirement> {
    private String phoneNumber;
    private String countryIso2;
    private String endUserType;
    private String numberType;

    public ComplianceRequirementLister(String phoneNumber) {
        super(phoneNumber);
        this.phoneNumber = phoneNumber;
    }


    public ComplianceRequirementLister countryIso2(String countryIso2) {
        this.countryIso2 = countryIso2;
        return this;
    }

    public ComplianceRequirementLister endUserType(String endUserType) {
        this.endUserType = endUserType;
        return this;
    }

    public ComplianceRequirementLister numberType(String numberType) {
        this.numberType = numberType;
        return this;
    }

    @Override
    protected Call<ComplianceRequirement> obtainCall() {
        return client().getApiService().complianceRequirementList(client().getAuthId(), toMap());
    }
}
