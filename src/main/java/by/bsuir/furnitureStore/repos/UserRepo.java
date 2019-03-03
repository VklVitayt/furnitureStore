package by.bsuir.furnitureStore.repos;


import by.bsuir.furnitureStore.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
