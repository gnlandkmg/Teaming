package teaming.Teaming.Profile.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import teaming.Teaming.Profile.Domain.Profiles;

import java.util.Optional;

public interface ProfilesRepository extends JpaRepository<Profiles, Long> {
    Optional<Profiles> findById(Long id);
}