package teaming.project_teaming.Profile;

import org.springframework.data.jpa.repository.JpaRepository;
import teaming.project_teaming.Profile.Domain.Profiles;

import java.util.Optional;

public interface ProfilesRepository extends JpaRepository<Profiles, Long> {
    Optional<Profiles> findById(Long id);
}