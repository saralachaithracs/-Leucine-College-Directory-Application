@Service
public class UserProfileService {

    @Autowired
    private UserProfileRepository userProfileRepository;

    public Optional<UserProfile> getUserProfileById(Long userId) {
        return userProfileRepository.findById(userId);
    }

    public UserProfile createUserProfile(UserProfile userProfile) {
        return userProfileRepository.save(userProfile);
    }

    public UserProfile updateUserProfile(Long userId, UserProfile userProfile) {
        Optional<UserProfile> existingProfileOptional = userProfileRepository.findById(userId);
        if (existingProfileOptional.isPresent()) {
            UserProfile existingProfile = existingProfileOptional.get();
            // Update existingProfile with userProfile details
            existingProfile.setPhoto(userProfile.getPhoto());
            existingProfile.setDepartment(userProfile.getDepartment());
            // Update other fields as needed
            return userProfileRepository.save(existingProfile);
        } else {
            return null;
        }
    }

    public void deleteUserProfile(Long userId) {
        userProfileRepository.deleteById(userId);
    }
}
