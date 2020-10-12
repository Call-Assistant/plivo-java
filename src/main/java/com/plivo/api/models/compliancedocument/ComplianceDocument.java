package com.plivo.api.models.compliancedocument;

import com.plivo.api.models.base.BaseResource;

public class ComplianceDocument extends BaseResource {
    private String endUserId;
    private String createdAt;
    private String documentId;
    private String documentTypeId;
    private String alias;
    private String fileName;

    private static class MetaInformation {
        private String addressLine1;
        private String addressLine2;
        private String city;
        private String country;
        private String postalCode;
        private String lastName;
        private String firstName;
        private String dateOfBirth;

        public MetaInformation() {

        }

        public String getLastName() {
            return lastName;
        }

        public String getAddressLine1() {
            return addressLine1;
        }

        public String getAddressLine2() {
            return addressLine2;
        }

        public String getCity() {
            return city;
        }

        public String getCountry() {
            return country;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getPostalCode() {
            return postalCode;
        }
    }

    private MetaInformation metaInformation;

    public static ComplianceDocumentGetter getter(String id) {
        return new ComplianceDocumentGetter(id);
    }

    public static ComplianceDocumentCreator creator(String endUserId, String documentTypeId, String alias) {
        return new ComplianceDocumentCreator(endUserId, documentTypeId, alias);
    }

    public static ComplianceDocumentUpdater updater(String id) {
        return new ComplianceDocumentUpdater(id);
    }

    public static ComplianceDocumentDeleter deleter(String id) {
        return new ComplianceDocumentDeleter(id);
    }

    public static ComplianceDocumentLister lister() {
        return new ComplianceDocumentLister();
    }

    @Override
    public String getId() {
        return documentId;
    }
}
