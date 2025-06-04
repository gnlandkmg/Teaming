package teaming.Teaming.Profile.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import teaming.Teaming.Profile.Domain.Profiles;
import teaming.Teaming.Profile.DTO.CreateDecoRequest;
import teaming.Teaming.Profile.DTO.ProfileResponse;
import teaming.Teaming.Profile.DTO.UpdateProfiles;
import teaming.Teaming.Profile.Repository.ProfilesRepository;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class DecoService {
    private final ProfilesRepository ProfilesRepository;

    public void createDeco(CreateDecoRequest request) {
        Profiles profiles = Profiles.builder()
                .major(request.major())
                .circle(request.circle())
                .build();

        ProfilesRepository.save(profiles);
    }
//    public String delete(DeleteRequest request) {
//        Profiles profiles = ProfilesRepository.findById(request.id()).orElse(null);
//
//        if (profiles == null) {
//            throw new IllegalArgumentException(request.id() + "는 없는 프로필입니다.");
//        }
//        ProfilesRepository.delete(profiles);
//        return "프로필이 삭제되었습니다.";
//    }
    public ProfileResponse findProfilesById(Long id) {
        Profiles e = ProfilesRepository.findById(id).orElse(null);
        if (e == null) {
            throw new IllegalArgumentException(id +"는 없는 프로필입니다.");
        }

        return ProfileResponse.of(e);
    }
//    public void deleteProfiles(Long id) {
//        Profiles e = ProfilesRepository.findById(id).orElse(null);
//        if (e == null) {
//            throw new IllegalArgumentException(id +"는 없는 프로필입니다.");
//        }
//        ProfilesRepository.delete(e);
//    }
    public ProfileResponse updateProfiles(UpdateProfiles request) {
        Profiles e = ProfilesRepository.findById(request.id()).orElse(null);
        if (e == null) {
            throw new IllegalArgumentException(request.id() +"는 없는 프로필입니다.");
        }
        e.setMajor(request.major());

        ProfilesRepository.save(e);

        return ProfileResponse.of(e);
    }

    public List<ProfileResponse> findAll() {
        return ProfilesRepository.findAll().stream().map(ProfileResponse::of).collect(Collectors.toList());
    }
}
