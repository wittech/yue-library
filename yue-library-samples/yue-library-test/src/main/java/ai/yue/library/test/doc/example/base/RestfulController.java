package ai.yue.library.test.doc.example.base;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.R;
import ai.yue.library.test.ipo.ValidationIPO;

/**
 * @author	ylyue
 * @since	2019年10月12日
 */
@RestController
@RequestMapping("/restful")
public class RestfulController {

	/**
	 * valid
	 * 
	 * @param validationIPO
	 * @return
	 */
	@PostMapping("/valid")
	public Result<?> valid(@Valid ValidationIPO validationIPO) {
		System.out.println(validationIPO);
		return R.success(validationIPO);
	}
	
}
