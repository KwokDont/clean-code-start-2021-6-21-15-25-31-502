package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    private Address toAddressObj;
    private Address fromAddressObj;

    public DeliveryManager(String fromAddress, String toAddress) {
        this.toAddressObj = new Address(toAddress);
        this.fromAddressObj = new Address(fromAddress);
    }

    public DeliverCenter allocate(){
        if (toAddressObj.getProvince().equals(fromAddressObj.getProvince())
                && toAddressObj.getCity().equals(fromAddressObj.getCity())){
            return DeliverCenter.LOCAL;
        }
        if (toAddressObj.getProvince().equals(fromAddressObj.getProvince())) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }
}
