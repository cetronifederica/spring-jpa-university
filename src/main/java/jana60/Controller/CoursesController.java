package jana60.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.Repository.CoursesRepository;

@Controller
@RequestMapping("/courses")
public class CoursesController {

	@Autowired
	private CoursesRepository courses;

	@GetMapping
	private String courses(Model model) {
		model.addAttribute("coursesList", courses.findAll());
		return "courses";
	}
}
