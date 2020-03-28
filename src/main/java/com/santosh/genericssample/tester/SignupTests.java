package com.santosh.genericssample.tester;

import com.santosh.genericssample.SignupTemplate;
import com.santosh.genericssample.app.GmailSignup;

public class SignupTests {

    public static void main(String[] args) {
        GmailSignup.UserDetail userDetail = new GmailSignup.UserDetail("Santosh", "santosh@gmail.com");
        GmailSignup.AuthDetail authDetail = new GmailSignup.AuthDetail("santosh", "santosh");

        SignupTemplate<GmailSignup.UserDetail, GmailSignup.AuthDetail> gmailSignup = new GmailSignup(userDetail, authDetail);
        gmailSignup.doSignup();
    }
}
