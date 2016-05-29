package com.aoji.logindemo;

/**
 * Created by dsadowski2001 on 5/22/16.
 */
public class Constants {

    //Constatns for web connections
    public static final int CONNECTION_TIMEOUT = 10000;
    public static final int READ_TIMEOUT = 10000;
    public static final int STATUS_ERROR =400;
    public static final int STATUS_UNAUTHORIZED = 401;

    //Application key and secret
    //access the API

    public static final String APP_KEY = "AppKey";
    public static final String APP_SECRET = "AppSecret";

    //URL'S to be used
    public static final String END_POINT = "DOMAIN/api";
    public static final String LOGIN_URL = END_POINT + "/login.php";
    public static final String SIGNUP_URL = END_POINT + "/signup.php";
    public static final String INFO_URL = END_POINT + "/info.php";
    public static final String UPDATE_URL = END_POINT + "/update.php";
    public static final String DELETE_URL = END_POINT + "/delete.php";
    public static final String RESET_URL = END_POINT + "/reset.php";

    //Constants used in JSON Parsing
    public static final String AUTHORIZATION = "Authorization";
    public static final String ENAIL = "email";
    public static final String PASSWORD = "password";
    public static final String GRANT_TYPE = "grant_type";
    public static final String CLIENT_CREDENTIALS = "client_credential";
    public static final String ACCESS_TOKEN = "access_token";
    public static final String ACCESS = "access";
    public static final String INFO = "info";
    public static final String MESSAGE = "message";
    public static final String ID = "id";
    public static final String ID_INFO = "ID";
    public static final String PHONE_NUMBER = "phoneNumber";
    public static final String NOTE = "note";
    public static final String NAME = "name";
    public static final String STATUS = "status";

    public static final String CONNECTION_MESSAGE = "No Internet Connection";


}

