package com.santosh.genericssample;

public abstract class SignupTemplate<T, U> {
    protected T detail;
    protected U authDetail;

    public SignupTemplate(T detail, U authDetail) {
        this.detail = detail;
        this.authDetail = authDetail;
    }

    public abstract void doSignup();
}
