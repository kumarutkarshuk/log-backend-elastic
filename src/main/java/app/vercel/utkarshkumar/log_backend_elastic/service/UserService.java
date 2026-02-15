package app.vercel.utkarshkumar.log_backend_elastic.service;

import app.vercel.utkarshkumar.log_backend_elastic.Repository.UserRepository;
import app.vercel.utkarshkumar.log_backend_elastic.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User getUserById(Long id){
        return userRepository.findById(id).orElse(null);
    }
}
