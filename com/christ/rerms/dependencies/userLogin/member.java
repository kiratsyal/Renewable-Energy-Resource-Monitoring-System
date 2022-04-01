class member {
    int solarDevs, windDevs, hydroElecDevs, geothermalDevs;
    String consumerID, contact, name, dob, password, AadhaarNo;

    member(String consumerID, String contact, String AadhaarNo, String password, String name, String dob,
            int solarDevs,
            int windDevs, int hydroElecDevs, int geothermalDevs) {
        this.consumerID = consumerID;
        this.password = password;
        this.contact = contact;
        this.AadhaarNo = AadhaarNo;
        this.name = name;
        this.dob = dob;
        // no. of devices the member has
        this.solarDevs = solarDevs;
        this.windDevs = windDevs;
        this.hydroElecDevs = hydroElecDevs;
        this.geothermalDevs = geothermalDevs;
    }

    protected void printMem() {
        System.out.println("Name : " + this.name);
        System.out.println("Consumer ID : " + this.consumerID);
        System.out.println("Contact No. : " + this.contact);
        System.out.println("Aadhar No. : " + this.AadhaarNo);
        System.out.println("Date of birth : " + this.dob);
        System.out.println("No. of Solar devices owned : " + this.solarDevs);
        System.out.println("No. of Wind devices owned : " + this.windDevs);
        System.out.println("No. of Hydroelectric devices owned : " + this.hydroElecDevs);
        System.out.println("No. of Geothermal devices owned : " + this.geothermalDevs);
    }
}
