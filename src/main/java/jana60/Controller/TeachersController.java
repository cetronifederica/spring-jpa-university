package jana60.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.Model.Teachers;
import jana60.Repository.TeachersRepository;

@Controller
@RequestMapping("/teachers")
public class TeachersController {

	@Autowired
	private TeachersRepository teachers;

	@GetMapping
	private String teachers(Model model) {
		model.addAttribute("teachersList", teachers.findAll());
		return "teachers";
	}

	@GetMapping("/{teachersId}")
	public String teachersDetail(@PathVariable(name = "teachersId") Integer teachersPrimaryKey, Model model) {
		Teachers currentTeachers = teachers.findById(teachersPrimaryKey).get();
		model.addAttribute("teachers", currentTeachers);
		return "teachersDetail";
	}
}
