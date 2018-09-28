package pl.bmstefanski.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

  @GetMapping("/login")
  public String login() {
    return "login";
  }

  @GetMapping("/login-fail")
  public String loginFail(Model model) {
    model.addAttribute("isFail", true);
    return "login";
  }

  @GetMapping("/logout")
  public String logout() {
    return "home";
  }

}
