package com.santosh.genericssample.app;

import com.santosh.genericssample.SignupTemplate;
import lombok.Getter;

public class GmailSignup extends SignupTemplate<GmailSignup.UserDetail, GmailSignup.AuthDetail> {

    public GmailSignup(UserDetail detail, AuthDetail authDetail) {
        super(detail, authDetail);
    }

    @Override
    public void doSignup() {
        System.out.println("Signup request initiated with below details");
        System.out.println("Name : " + detail.getName());
        System.out.println("Username : " + authDetail.getUsername());
    }

    @Getter
    public static class UserDetail {
        private String name;
        private String email;

        public UserDetail(String name, String email) {
            this.name = name;
            this.email = email;
        }
    }

    @Getter
    public static class AuthDetail {
        private String username;
        private String password;

        public AuthDetail(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }
}
