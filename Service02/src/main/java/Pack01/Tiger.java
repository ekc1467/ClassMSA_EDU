package Pack01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Tiger {
	@RequestMapping("/")
	public String f0() {
		System.out.println("f0 call");
	
		return "index";
	}
	
	@RequestMapping("/t1")
	public String f1() {
		System.out.println("f1 call");
	
		return "TigerView";
		//return "redirect:/"; 뒤로 가기 필요없이 이동하지말고 컨트롤러만 call이 되는 지 확인
	}
	
//	@RequestMapping("/a2")
//	public String f2() {
//		System.out.println("aaa call");
//	
//		return "호랑이 만세";
//		//return "redirect:/"; 뒤로 가기 필요없이 이동하지말고 컨트롤러만 call이 되는 지 확인
//	}
}


@RestController
@RequestMapping("/a2")
class BppController787 {
	@GetMapping("/{num}")
	public String f1(@PathVariable String num) {
		System.out.println("들어왔나? 서비스2?");
		String result = "호랑이";
		return result;

	}
}









//package Pack01;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//public class Tiger {
//	@RequestMapping("/")
//	public String f0() {
//		System.out.println("f0 call");
//	
//		return "index";
//	}
//	
//	@RequestMapping("/t1")
//	public String f1() {
//		System.out.println("f1 call");
//	
//		return "TigerView";
//		//return "redirect:/"; 뒤로 가기 필요없이 이동하지말고 컨트롤러만 call이 되는 지 확인
//	}
//	
//	@RequestMapping("/a2")
//	public String f2() {
//		System.out.println("aaa call");
//	
//		return "호랑이 만세";
//		//return "redirect:/"; 뒤로 가기 필요없이 이동하지말고 컨트롤러만 call이 되는 지 확인
//	}
//}
