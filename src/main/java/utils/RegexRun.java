package utils;

import abstractclasses.fragment.AbstractFragment;
import desktop.pages.EpamContactUsPage;
import driver.DriverManager;

public class RegexRun extends AbstractFragment {

    static EpamContactUsPage epamContactPage = new EpamContactUsPage();

    public static void main(String[] args) {

        String email = "3topora@mail.com";
        String email1 = "vasko@mail.";
        String ip = "192.168.0.1";
        String ip1 = "192 l.168.0.1";
        String cardNumber = "4567567891234567";
        String cardNumber1 = "12345678912345678";

        System.out.println(RegexUtil.isValidEmail(email));
        System.out.println(RegexUtil.isValidEmail(email1));
        System.out.println(RegexUtil.isValidIp4Address(ip));
        System.out.println(RegexUtil.isValidIp4Address(ip1));
        System.out.println(RegexUtil.isValidMasterCardNumber(cardNumber));
        System.out.println(RegexUtil.isValidMasterCardNumber(cardNumber1));

        epamContactPage.openEpamContactUsPage();

        System.out.println(epamContactPage.toString());

        DriverManager.quitDriver();
    }
}
