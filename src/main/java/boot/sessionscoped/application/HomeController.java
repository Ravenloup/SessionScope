/**
 * 
 */
package boot.sessionscoped.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author sunil.yadav
 *
 */
@Controller
public class HomeController {

	@Autowired
	private User user;

	@RequestMapping("/user")
	@ResponseBody
	public String getUser() {
		int age = user.getAge();
		user.setAge(25);
		return user.getAge() + " : " + age;
	}
}
