package teaming.project_teaming.Profile.DTO;

import teaming.project_teaming.Profile.Domain.Profiles;

public record ProfileResponse(
        Long id,
        String title,
        String content
) {
    public static ProfileResponse of (Profiles profiles) {
        return new ProfileResponse(
                profiles.getId(),
                profiles.getTitle(),
                profiles.getContent()
        );
    }
}
