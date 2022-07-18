package jana60.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.Repository.degreesRepository;

@Controller
@RequestMapping("/degrees")
public class DegreesController {
	@Autowired
	private degreesRepository degrees;

	@GetMapping
	private String degrees(Model model) {
		model.addAttribute("degreesList", degrees.findAll());
		return "degrees";
	}
}
