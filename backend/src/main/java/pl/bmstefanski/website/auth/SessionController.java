package pl.bmstefanski.website.auth;

import java.io.IOException;
import java.security.Principal;
import java.util.Collections;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionController {

  @GetMapping("sessions/me")
  public ResponseEntity<?> user(Principal principal) {
    if (principal == null) {
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
          .body(Collections.singletonMap("error", "unauthorized"));
    }

    return ResponseEntity.ok(principal);
  }

  @GetMapping("sessions/github/callback")
  public void githubCallback(HttpServletResponse response) throws IOException {
    response.sendRedirect("http://localhost:8080/#/");
  }

}
