package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    String toAddress;
    String fromAddress;
    private Address toAddressObj;
    private Address fromAddressObj;

    public DeliveryManager(String fromAddress, String toAddress) {
        this.toAddressObj = new Address(toAddress);
        this.fromAddressObj = new Address(fromAddress);
        this.toAddress = toAddress;
        this.fromAddress = fromAddress;
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

    private String getCity(String address) {
        return address.substring(address.indexOf("省") + 1, address.indexOf("市"));
    }

    private String getProvince(String address) {
        return address.substring(0, address.indexOf("省"));
    }
}
