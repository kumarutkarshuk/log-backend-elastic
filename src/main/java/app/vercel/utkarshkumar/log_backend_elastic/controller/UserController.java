package app.vercel.utkarshkumar.log_backend_elastic.controller;

import app.vercel.utkarshkumar.log_backend_elastic.Repository.UserRepository;
import app.vercel.utkarshkumar.log_backend_elastic.model.User;
import app.vercel.utkarshkumar.log_backend_elastic.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final UserRepository userRepository;

    @GetMapping("/email/{id}")
    public ResponseEntity<String> getEmail(@PathVariable Long id) {
        User user = userRepository.findById(id).orElse(null);
        if (user == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
        }
        return ResponseEntity.ok(user.getEmail().toLowerCase());
    }
}
