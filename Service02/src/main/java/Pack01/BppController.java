package Pack01;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


//숫자
@RestController
@RequestMapping("/s1")
public class BppController {
	@GetMapping("/{num}")
	public Integer f1(@PathVariable String num) {
		System.out.println(num);
		Integer result = Integer.parseInt(num);
		return result;

	}
}

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
class Person{
	String name;
	int age;
}



//문자열
@RestController
@RequestMapping("/s2")
class BppController2 {
	@GetMapping("/{num}")
	public String f1(@PathVariable String num) {
		System.out.println(num);
		String result = "호랑이";
		return result;

	}
}

//문자열
@RestController
@RequestMapping("/s3")
class BppController3 {
	@GetMapping("/{num}")
	public Person f1(@PathVariable String num) {
		System.out.println(num);
		Person result = new Person("호랑이",20);
		return result;

	}
}



//문자열
@RestController
@RequestMapping("/s4")
class BppController4 {
	@GetMapping("/{num}")
	public Integer[] f1(@PathVariable String num) {
		System.out.println(num);
		
		Integer[] ar = {10, 20, 30};
		
		return ar;

	}
}


//배열
@RestController
@RequestMapping("/s5")
class BppController5 {
	@GetMapping("/{num}")
	public String[] f1(@PathVariable String num) {
		System.out.println(num);
		
		String[] ar = {"소나무", "이", "구"};
		
		return ar;

	}
}

//배열
@RestController
@RequestMapping("/s6")
class BppController6 {
	@GetMapping("/{num}")
	public Person[] f1(@PathVariable String num) {
		System.out.println(num);
		
		Person[] ar = {
				new Person("홍길동1", 10),
				new Person("홍길동2", 20),
				new Person("홍길동3", 30),
		};
		
		return ar;

	}
}


//배열
@RestController
@RequestMapping("/s7")
class BppController7 {
	@GetMapping("/{num}")
	public LinkedList<Integer> f1(@PathVariable String num) {
		System.out.println(num);
		
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(100);
		li.add(200);
		li.add(300);
		
		
		return li;

	}
}


//배열
@RestController
@RequestMapping("/s8")
class BppController8 {
	@GetMapping("/{num}")
	public LinkedList<Person> f1(@PathVariable String num) {
		System.out.println(num);
		
		LinkedList<Person> li = new LinkedList<Person>();
		li.add(new Person("앵무새", 10));
		li.add(new Person("앵무새1", 20));
		li.add(new Person("앵무새2", 30));
		
		
		return li;

	}
}

@RestController //정수
@RequestMapping("/s9") //함수에 붙여서 경로 더하기 가능
class BppController9 {
	@GetMapping( "/{num}" ) 
	public String f1(@PathVariable String num) {
		System.out.println(num);
		
		return num + " ";
	}
}

@RestController //정수
@RequestMapping("/s10") //함수에 붙여서 경로 더하기 가능
class BppController10 {
	@GetMapping( "/{n1}/{n2}" ) 
	public String f1(@PathVariable String n1, @PathVariable String n2) {
		System.out.println(n1 + " " + n2);
		
		return n1 + n2;
	}
}


@RestController //정수
@RequestMapping("/s11") //함수에 붙여서 경로 더하기 가능
class BppController11 {
	@GetMapping( "/{n1}" ) 
	public Map<String, String> f1(@PathVariable String n1) {
		System.out.println(n1);
		Map<String, String> map = new HashMap<>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		return map ;
	}
}

@RestController
@RequestMapping("/s12")
class BppController12 {
   
   @GetMapping("/{num}")
   public String f1(@PathVariable String num) {
      String result = "호랑이";
      
      return result;
   }
}

@RestController
@RequestMapping("/s13")
class BppController13 {
   
   @GetMapping("/{num}")
   public String f1(@PathVariable String num) {
      String result = "호랑이";
      
      return result;
   }
}

@RestController
@RequestMapping("/s14")
class BppController14 {
   
   @GetMapping("/{num}")
   public Person f1(@PathVariable String num) {
      Person result = new Person("호랑이", 20);
      
      return result;
   }
}

@RestController
@RequestMapping("/s15")
class BppController15 {
   
   @GetMapping("/{num}")
   public Integer[] f1(@PathVariable String num) {
      Integer[] ar = {10, 20, 30};
      
      return ar;
   }
}







//=======================================

//package Pack01;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/bpp")
//public class BppController {
//	@GetMapping("/{bppNum}")
//	public String f1(@PathVariable String bppNum) {
//		System.out.println(1111);
//		return "BppController" + bppNum;
//	}
//}
