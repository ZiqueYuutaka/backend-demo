package com.zique.demo.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;
    
//    {
//        "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTU2MzUwMTM3OCwiaWF0IjoxNTYyODk2NTc4fQ.FBnE8mFxhiYIEn59Vy3fsVX6lFleus2gDUXajVvNSa8PkCeGdqGwA8rBCWG2mDzgjpr_iP2Kus_TuJ-3z0-JjA"
//    }

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

