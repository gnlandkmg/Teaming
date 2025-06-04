package teaming.Teaming.Profile.DTO;

import teaming.Teaming.Profile.Domain.Profiles;

public record ProfileResponse(
        Long id,
        String major,
        String circle
) {
    public static ProfileResponse of (Profiles profiles) {
        return new ProfileResponse(
                profiles.getId(),
                profiles.getMajor(),
                profiles.getCircle()
        );
    }
}
