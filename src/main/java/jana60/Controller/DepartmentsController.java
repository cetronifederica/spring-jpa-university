package jana60.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.Model.Departments;
import jana60.Repository.DepartmentsRepository;

@Controller
@RequestMapping("/departments")
public class DepartmentsController {

	@Autowired
	private DepartmentsRepository repo;

	@GetMapping
	private String departments(Model model) {
		// List<Departments> departmentList = (List<Departments>) repo.findAll();
		model.addAttribute("departmentList", repo.findAllByOrderByName());
		return "departments";
	}

	@GetMapping("/{departmentsId}")
	public String departmentsDetail(Model model, @PathVariable(name = "departmentsId") Integer departmentsPrimaryKey) {
		// select su db sulla tabella regions per quella primary key
		Departments currentDepartments = repo.findById(departmentsPrimaryKey).get();
		model.addAttribute("departments", currentDepartments);
		return "departmentsDetail";
	}
}
