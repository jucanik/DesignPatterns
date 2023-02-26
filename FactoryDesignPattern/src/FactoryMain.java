package FactoryDesignPattern.src;

import FactoryDesignPattern.src.com.factory.PhoneOSFactory;
import FactoryDesignPattern.src.com.phone.Android;
import FactoryDesignPattern.src.com.phone.IOS;
import FactoryDesignPattern.src.com.phone.PhoneOperatingSystem;

public class FactoryMain {
    public static void main(String args[]) {
        PhoneOSFactory phoneOSFactory = new PhoneOSFactory();
        PhoneOperatingSystem phoneOperatingSystem = phoneOSFactory.showOs("IOS");
        phoneOperatingSystem.show();
        phoneOperatingSystem = phoneOSFactory.showOs("Android");
        phoneOperatingSystem.show();
    }
}
