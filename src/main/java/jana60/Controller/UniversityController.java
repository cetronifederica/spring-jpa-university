package jana60.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.Model.Departments;
import jana60.Repository.UniversityRepository;

@Controller
@RequestMapping("/")
public class UniversityController {

	@Autowired
	private UniversityRepository repo;

	@GetMapping
	private String departments(Model model) {
		List<Departments> departmentList = (List<Departments>) repo.findAll();
		model.addAttribute("departmentList", departmentList);
		return "departments";
	}

//	private String departments(Model model) {
//		List<String> departmentList = List.of("Dipartimento di Biologia", "Dipartimento di Matematica",
//				"Dipartimento di Scienze chimiche", "Dipartimento di Scienze statistiche",
//				"Dipatimento di Neuroscienze", "Dipartimento di Medicina");
//		model.addAttribute("departmentList", departmentList);
//		return "departments";
//	}
}
