package jana60.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UniversityController {

	@GetMapping
	private String departments(Model model) {
		List<String> departmentList = List.of("Dipartimento di Biologia", "Dipartimento di Matematica",
				"Dipartimento di Scienze chimiche", "Dipartimento di Scienze statistiche",
				"Dipatimento di Neuroscienze", "Dipartimento di Medicina");
		model.addAttribute("departmentList", departmentList);
		return "departments";
	}
}
