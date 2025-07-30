package com.example.WebShop.dto.user;

import com.example.WebShop.entities.User.enums.UserRole;

public record ResgisterDto(String login, String password, UserRole Role) {
}
