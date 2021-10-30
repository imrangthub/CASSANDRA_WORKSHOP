package imranmadbar.user;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    @Query(
            value = "SELECT * FROM USER_TABLE WHERE id=:id order by id desc limit 1",
            nativeQuery = true)
    Optional<UserEntity> findById(@Param("id") Long id);


}