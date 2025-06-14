package teaming.Teaming.Profile.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import teaming.Teaming.Profile.Service.DecoService;
import teaming.Teaming.Profile.DTO.CreateDecoRequest;
import teaming.Teaming.Profile.DTO.ProfileResponse;
import teaming.Teaming.Profile.DTO.UpdateProfiles;

import java.util.List;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class DecoController {
    private final DecoService decoService;

    @PostMapping()
    public void createDeco(@RequestBody CreateDecoRequest request) {
        decoService.createDeco(request);
    }


    @GetMapping("/{id}")
    public ProfileResponse findProfilesById(@PathVariable Long id) {
        return decoService.findProfilesById(id);
    }

//    @DeleteMapping("/{id}")
//    public void deleteProfiles(@PathVariable Long id) {
//
//        decoService.deleteProfiles(id);
//    }
    @PatchMapping()
    public ProfileResponse updateProfiles(@RequestBody UpdateProfiles request) {
        return decoService.updateProfiles(request);
    }

    @GetMapping()
    public List<ProfileResponse> findAll() {
        return decoService.findAll();
    }
}
