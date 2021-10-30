package imranmadbar.user;

import java.util.List;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface UserRepository extends CassandraRepository<UserEntity, Integer> {

    @AllowFiltering
    List<UserEntity> findByAgeGreaterThan(int age);

}