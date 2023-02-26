package FactoryDesignPattern.src.com.factory;

import FactoryDesignPattern.src.com.phone.Android;
import FactoryDesignPattern.src.com.phone.IOS;
import FactoryDesignPattern.src.com.phone.PhoneOperatingSystem;

public class PhoneOSFactory {
    public PhoneOperatingSystem showOs(String str) {
        if(str.equals("Android")) {
            return new Android();
        }
        return new IOS();
    }
}
