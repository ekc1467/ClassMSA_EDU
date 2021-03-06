package Pack01;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import reactor.core.publisher.Mono;


//public class AppController {
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
//	@RequestMapping("/a1")
//	public String f2() {
//		System.out.println("f1 call");
//	
//		String str = restTemplate.getForObject(
//				"http://localhost:8082/a2/3000" ,
//				String.class
//				);
//		
//		System.out.println(str);
//		
//		return str;
//		//return "redirect:/"; 뒤로 가기 필요없이 이동하지말고 컨트롤러만 call이 되는 지 확인
//	}
//	
//	
//}












////WebClient 및 restTemplate
//
//
//
////==============================================================
//
//package Pack01;
//
//import java.util.Map;
//import java.util.Set;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.reactive.function.client.WebClient;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import reactor.core.publisher.Mono;
//
//@RestController //정수
//@RequestMapping("/t1") //함수에 붙여서 경로 더하기 가능
//public class AppController {
//	@GetMapping( "/{num}" ) 
//	public String f1(@PathVariable String num) {
//		System.out.println(num);
//		
//		RestTemplate rt = new RestTemplate();
//		Integer data = rt.getForObject(
//				"http://localhost:8082/s1/2000" ,
//				Integer.class
//				);//리턴 값이 String
//		
//		return "AppController: " + "<br/>" + data;
//	}
//}
//
//
//
//
//@RestController // 문자열
//@RequestMapping("/t2")
//class AppController2 {
//	@GetMapping( "/{num}" ) // 
//	public String f1(@PathVariable String num) {
//		System.out.println(num);
//		
//		RestTemplate rt = new RestTemplate();
//		String data = rt.getForObject(
//				"http://localhost:8082/s2/2000" ,
//				String.class
//				);//리턴 값이 String
//		
//		return "AppController: " + "<br/>" + data;
//	}
//}
//
//
//@NoArgsConstructor 
//@AllArgsConstructor
//@Setter
//@Getter
//class Person{
//	String name;
//	int age;
//}
//
//
//@RestController //배열
//@RequestMapping("/t3")
//class AppController3 {
//	@GetMapping( "/{num}" ) // String appNum로 값을 넣어준다. 이름이 달라도 상관없다.
//	public String f1(@PathVariable String num) {
//		System.out.println(num);
//		
//		RestTemplate rt = new RestTemplate();
//		Person data = rt.getForObject(
//				"http://localhost:8082/s3/2000" ,
//				Person.class
//				);//리턴 값이 String
//		
//		return "AppController: " + "<br/>" + data.getName()+ data.getAge();
//	}
//}
//
//@RestController //배열
//@RequestMapping("/t4")
//class AppController4 {
//	@GetMapping( "/{num}" ) // String appNum로 값을 넣어준다. 이름이 달라도 상관없다.
//	public String f1(@PathVariable String num) {
//		System.out.println(num);
//		
//		RestTemplate rt = new RestTemplate();
//		Integer[] data = rt.getForObject(
//				"http://localhost:8082/s4/2000" ,
//				Integer[].class
//				);//리턴 값이 String
//		
//		String result = "";
//		for (Integer item : data) {
//			result += item + " ";
//		}
//		
//		return "AppController: " + "<br/>" + result;
//	}
//}
//
//
//@RestController //배열
//@RequestMapping("/t5")
//class AppController5 {
//	@GetMapping( "/{num}" ) // String appNum로 값을 넣어준다. 이름이 달라도 상관없다.
//	public String f1(@PathVariable String num) {
//		System.out.println(num);
//		
//		RestTemplate rt = new RestTemplate();
//		String[] data = rt.getForObject(
//				"http://localhost:8082/s5/2000" ,
//				String[].class
//				);//리턴 값이 String
//		
//		String result = "";
//		for (String item : data) {
//			result += item + " ";
//		}
//		
//		return "AppController: " + "<br/>" + result;
//	}
//}
//
//
//@RestController //배열
//@RequestMapping("/t6")
//class AppController6 {
//	@GetMapping( "/{num}" ) // String appNum로 값을 넣어준다. 이름이 달라도 상관없다.
//	public String f1(@PathVariable String num) {
//		System.out.println(num);
//		
//		RestTemplate rt = new RestTemplate();
//		Person[] data = rt.getForObject(
//				"http://localhost:8082/s6/2000" ,
//				Person[].class
//				);//리턴 값이 String
//		
//		String result = "";
//		for (Person item : data) {
//			result += (item.getName() + " " + item.getAge() + " ");
//		}
//		
//		return "AppController: " + "<br/>" + result;
//	}
//}
//
//
//
//@RestController //collection(Integer)
//@RequestMapping("/t7")
//class AppController7 {
//	@GetMapping( "/{num}" ) // String appNum로 값을 넣어준다. 이름이 달라도 상관없다.
//	public String f1(@PathVariable String num) {
//		System.out.println(num);
//		
//		RestTemplate rt = new RestTemplate();
//		ResponseEntity<Integer[]> data= rt.getForEntity( 
//				"http://localhost:8082/s7/2000" ,
//				Integer[].class
//				);//리턴 값이 String
//		
//		String result = "";
//		System.out.println();
//		for (Integer item : data.getBody()) {
//			result += (item + " ");
//		}
//		
//		return "AppController: " + "<br/>" +result ;
//	}
//}
//
//
//
//
//@RestController //collection(Integer)
//@RequestMapping("/t8")
//class AppController87 {
//	@GetMapping( "/{num}" ) // String appNum로 값을 넣어준다. 이름이 달라도 상관없다.
//	public String f1(@PathVariable String num) {
//		System.out.println(num);
//		
//		RestTemplate rt = new RestTemplate();
//		ResponseEntity<Person[]> data= rt.getForEntity( //왜 받을 때 <>에 []가 들어가지?
//				"http://localhost:8082/s8/2000" ,
//				Person[].class
//				);//리턴 값이 String
//		
//		String result = "";
//		
//		for (Person item : data.getBody()) {
//			result += (item.getName() + " " + item.getAge());
//		}
//		
//		return "AppController: " + "<br/>" +result ;
//	}
//}
//
//
//
//
//
//
//@RestController 
//@RequestMapping("/t9") //함수에 붙여서 경로 더하기 가능
//class AppController9 {
//	@GetMapping( "/{num}" ) 
//	public String f1(@PathVariable String num) {
//		System.out.println(num);
//		
//		int test = 777 + Integer.parseInt(num);
//		RestTemplate rt = new RestTemplate();
//		Integer data = rt.getForObject(
//				"http://localhost:8082/s9/{apple}" ,
//				Integer.class, test //apple 안에 test이 들어간다. 가변적이게 이용하기 위해서.
//				);//리턴 값이 String
//		
//		return "AppController: " + "<br/>" + data;
//	}
//}
//
//
//@RestController 
//@RequestMapping("/t10") //함수에 붙여서 경로 더하기 가능
//class AppController10 {
//	@GetMapping( "/{num}" ) 
//	public String f1(@PathVariable String num) {
//		System.out.println(num);
//		
//		int test = 777 + Integer.parseInt(num);
//		RestTemplate rt = new RestTemplate();
//		String data = rt.getForObject(
//				"http://localhost:8082/s10/{apple}/{banana}" ,
//				String.class, 777, 888 
//				);
//		
//		return "AppController: " + "<br/>" + data;
//	}
//}
//
//
//
////
////@RestController //collection Map
////@RequestMapping("/t11")
////class AppController11 {
////	@SuppressWarnings("unchecked")
////	@GetMapping( "/{num}" ) // String appNum로 값을 넣어준다. 이름이 달라도 상관없다.
////	public String f1(@PathVariable String num) {
////		System.out.println(num);
////		
////		RestTemplate rt = new RestTemplate();
////		@SuppressWarnings("rawtypes")
////		ResponseEntity<Map> data= rt.getForEntity( 
////				"http://localhost:8082/s11/2000" ,
////				Map.class
////				);//리턴 값이 String
////		
////		
////		System.out.println(data.getBody());
////		
////		
////		Map<String,String> map = data.getBody();
////		System.out.println(map);
////		
////		map.forEach((k,v)->{
////			System.out.println(k+" "+v);
////		});
////		
////		System.out.println(map.get("key1"));
////		System.out.println(map.get("key2"));
////		System.out.println(map.get("key3"));
////		
////		return "AppController: " + "<br/>"  ;
////	}
////}
//
//
//
//@RestController
//@RequestMapping("/t11")
//class AppController11 {
//   @SuppressWarnings("unchecked")
//   @GetMapping("/{num}")
//   public String f1(@PathVariable String num ) {
//      System.out.println(num);
//      
//      RestTemplate rt = new RestTemplate();
//      // Collection은 다른 데이터와 다르게 가져온다.
//      ResponseEntity<Map> data = rt.getForEntity(
//            "http://localhost:8082/s11/11000",
//            Map.class
//      );
//    
//      Map<String, String> map = data.getBody();
//      System.out.println(map);
//      String result = "";
//      
//      Set<String> keys = map.keySet();
//      for(String key : keys) {
//         result += key + " : " + map.get(key) + ", ";
//      }
//      
//      System.out.println(keys);
//      
//      System.out.println(map.get("key1"));
//      System.out.println(map.get("key2"));
//      System.out.println(map.get("key3"));
//      
//      return "AppController : " +  
//            "<br/>" + result;
//   }
//}
////
// 
//
//
//
//@RestController
//@RequestMapping("/t12")
//class AppController12 {
//   @GetMapping("/{num}")
//   public Mono<String> f1(@PathVariable String num) {
//      
//      WebClient client = WebClient.create();
//
//     
//      
//      return client.get()
//    	      .uri("http://localhost:8082/s2/2000")
//    	      .retrieve()
//    	      .bodyToMono(String.class);
//   }
//}
//
//
////서버 리스타트 필수
////동기화. 디버깅용
//@RestController 
//@RequestMapping("/t13")
//class AppController13 {
//@GetMapping("/{num}")
//public String f1(@PathVariable String num) {
//   
//   WebClient client = WebClient.create();
//
//   String r = client.get()
//   .uri("http://localhost:8082/s13/2000")
//   .retrieve()
//   .bodyToMono(String.class)
//   .block();
//   
//   
//   System.out.println("앵무새" + r);
//   
//   return "ss"+r ;
//}
//}
//
//
//
//
//@RestController 
//@RequestMapping("/t14")
//class AppController14 {
//@GetMapping("/{num}")
//public String f1(@PathVariable String num) {
//   
//   WebClient client = WebClient.create();
//
//   Person p = client.get()
//   .uri("http://localhost:8082/s14/2000")
//   .retrieve()
//   .bodyToMono(Person.class)
//   .block();
//   
//   
//   String result = "";
//   result += p.getName() + "" + p.getAge() + "";
//   
//   return result;
//}
//}
//
//
//@RestController
//@RequestMapping("/t15")
//class AppController15 {
//	@GetMapping("/{num}")
//	public String f1(@PathVariable String num) {
//
//		WebClient client = WebClient.create();
//
//		Integer[] data = client.get().uri("http://localhost:8082/s15/2000").retrieve().bodyToMono(Integer[].class)
//				.block();
//
//		String result = "";
//		for (Integer item : data) {
//			result += (item + " ");
//
//		}
//
//		return result;
//	}
//}
//
//@RestController
//@RequestMapping("/t16")
//class AppController16 {
//	@GetMapping("/{num}")
//	public void f1(@PathVariable String num) {
//		// 비동기 함수를 호출해서 결과가 끝났을 때 리턴값읋 받아서 새로운 페이지를 만든다.
//		Mono<String> result = f2();
//		result.subscribe(v -> {
//			System.out.println(v);
//		});
//	}
//
//	public Mono<String> f2() {
//		WebClient client = WebClient.create();
//
//		return client.get().
//				uri("http://localhost:8082/s12/2000").
//				retrieve().
//				bodyToMono(String.class);
//	}
//}

//=============================================





//package Pack01;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//@RestController
//@RequestMapping("/app")
//public class AppController {
//	@GetMapping( "/{appNum}" ) // String appNum로 값을 넣어준다. 이름이 달라도 상관없다.
//	public String f1(@PathVariable String appNum) {
//		System.out.println(appNum);
//		
//		RestTemplate rt = new RestTemplate();
//		String str = rt.getForObject(
//				"http://localhost:8082/bpp/2000" ,
//				String.class
//				);//리턴 값이 String
//		
//		return "AppController: " + appNum + "<br/>" + str;
//	}
//}
