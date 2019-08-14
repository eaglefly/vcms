package com.demo;

import io.github.biezhi.anima.Model;
import io.github.biezhi.anima.annotation.Table;
import lombok.Data;

import java.util.Date;

@Table(name = "\"Account\"")
@Data
public class User extends Model {
    Integer Id;
    String UserId;
    String UserName;
    String Password;
    Date RegDate;
    Date LastLoginDate;
    Integer Status;
    Integer RoleId;
}
