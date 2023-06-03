package application;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class FormController {
    @PostMapping("/tours")
    public void handleFormSubmission(@RequestBody FormData formData) {
        System.out.println(formData);
    }
}
