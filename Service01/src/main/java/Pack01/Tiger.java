package Pack01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//@Controller
//public class Tiger {
//	@RequestMapping("/")
//	public String f0() {
//		System.out.println("f0 call");
//	
//		return "index";
//	}
//	
//	
//	
//	@RequestMapping("/t1")
//	public String f1() {
//		System.out.println("f1 call");
//	
//		return "TigerView";
//		//return "redirect:/"; 뒤로 가기 필요없이 이동하지말고 컨트롤러만 call이 되는 지 확인
//	}
//	@Autowired
//	RestTemplate restTemplate;
//	
//	
//	
//	@Bean //스프링에게 관리 시키기 위해 밖에다가...
//	RestTemplate resTemplate() {
//		return new RestTemplate();
//	}
//	
//	
//
//	
//	
//	
//	
//}


@RestController
public class Tiger {

	
	
//	@Autowired
//	RestTemplate restTemplate;
//	
//	
//	@Bean //스프링에게 관리 시키기 위해 밖에다가...new를 사용하지 않고..
//	RestTemplate resTemplate() {
//		return new RestTemplate();
//	}
//	
	@RequestMapping("/a1")
	public String f2() {
//		System.out.println("call");
//
//		String str = restTemplate.getForObject(
//				"http://localhost:8082/a2" ,
//				String.class
//				);
//		
//		System.out.println(str);
	System.out.println("들어왔나?");
	
	RestTemplate rt = new RestTemplate();
	String str = rt.getForObject(
			"http://localhost:8082/a2/200" ,
			String.class
			);
		
		return str;
		//return "redirect:/"; //뒤로 가기 필요없이 이동하지말고 컨트롤러만 call이 되는 지 확인
	}
	
	
}
