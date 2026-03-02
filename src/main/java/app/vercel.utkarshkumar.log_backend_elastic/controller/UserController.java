package app.vercel.utkarshkumar.log_backend_elastic.controller;

import app.vercel.utkarshkumar.log_backend_elastic.Repository.UserRepository;
import app.vercel.utkarshkumar.log_backend_elastic.model.User;
import app.vercel.utkarshkumar.log_backend_elastic.service.UserService;
import lombok.RequiredArgsConstructor;
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
    public String getEmail(@PathVariable Long id) {
//        User user = userService.getUserById(id);
        User user = userRepository.findById(id).orElse(null);
        if (user == null) {
            return "User not found";
        }
        return user.getEmail() != null ? user.getEmail().toLowerCase() : "Email not available";
    }
}
