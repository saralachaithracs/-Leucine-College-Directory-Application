@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/{studentId}")
    public ResponseEntity<?> getStudentDetails(@PathVariable Long studentId) {
        Optional<StudentProfile> studentProfile = studentService.getStudentProfileById(studentId);
        if (studentProfile.isPresent()) {
            return ResponseEntity.ok(studentProfile.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Implement other endpoints for student-related operations
}
