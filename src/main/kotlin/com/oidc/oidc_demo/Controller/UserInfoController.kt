package com.oidc.oidc_demo

import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.core.oidc.user.OidcUser
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class UserInfoController {
    @GetMapping("userinfo")
    fun userInfo(
            @AuthenticationPrincipal user: OidcUser,
            model: Model
    ): String {
        model.addAttribute("subject", user.subject)
        model.addAttribute("email", user.email)
        model.addAttribute("emailVerified", user.emailVerified)
        model.addAttribute("fullName", user.fullName)
        model.addAttribute("picture", user.picture)
        model.addAttribute("locale", user.locale)
        model.addAttribute("familyName", user.familyName)
        model.addAttribute("givenName", user.givenName)
        return "userinfo"
    }
}