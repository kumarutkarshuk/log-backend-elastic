package app.vercel.utkarshkumar.log_backend_elastic.Repository;

import app.vercel.utkarshkumar.log_backend_elastic.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
