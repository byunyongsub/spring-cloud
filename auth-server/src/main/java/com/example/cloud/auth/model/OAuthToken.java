package com.example.cloud.auth.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class OAuthToken implements Serializable {
    private static final long serialVersionUID = 1535376455583157928L;

    private String access_token;
    private String token_type;
    private String refresh_token;
    private long expires_in;
    private String scope;
}
