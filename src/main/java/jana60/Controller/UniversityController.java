package jana60.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.Repository.CoursesRepository;
import jana60.Repository.DepartmentsRepository;
import jana60.Repository.degreesRepository;

@Controller
@RequestMapping("/")
public class UniversityController {

	@Autowired
	private DepartmentsRepository repo;

	@Autowired
	private degreesRepository degrees;

	@Autowired
	private CoursesRepository courses;

	@GetMapping
	private String home() {
		return "home";
	}

	@GetMapping("/departments")
	private String departments(Model model) {
		// List<Departments> departmentList = (List<Departments>) repo.findAll();
		model.addAttribute("departmentList", repo.findAllByOrderByName());
		return "departments";
	}

	@GetMapping("/degrees")
	private String degrees(Model model) {
		model.addAttribute("degreesList", degrees.findAll());
		return "degrees";
	}

	@GetMapping("/courses")
	private String courses(Model model) {
		model.addAttribute("coursesList", courses.findAll());
		return "courses";
	}

}
