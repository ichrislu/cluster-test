package chris.test.cluster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import chris.test.cluster.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
