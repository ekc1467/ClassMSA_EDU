package Pack01;

import java.util.Random;
import javax.swing.plaf.basic.BasicScrollPaneUI.VSBChangeListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.*;

@RequiredArgsConstructor
@Getter
@ToString
class Multiplication{
   final int factorA;
   final int factorB;
   Multiplication(){
      this(0, 0);
   }
}

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
class User {// 수강자 정보
   String alias;
}

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
class MultiplicationResultAttempt {
   User user;
   Multiplication multiplication;
   int resultAttempt;
}
// 문제 출제서비스
// 채점 서비스

@Service
class MultiplecationServiceImpl{
   public Multiplication createRandomMultiplication() {
      Random rnd = new Random();
      int factorA = rnd.nextInt(10);
      int factorB = rnd.nextInt(10);
      return new Multiplication(factorA, factorB);
   }
      //답안 채점 서비스
      boolean checkAttempt(MultiplicationResultAttempt mra) {
    	  return mra.getResultAttempt() == 
    			  mra.getMultiplication().getFactorA()*
    			  mra.getMultiplication().getFactorB();
      }  
}

@RestController
public class Tiger {
   @Autowired
   MultiplecationServiceImpl ms;
   @RequestMapping("/t1")
   Multiplication f1() {
	   //문제를 위한 숫자를 제공해주기만 하면 되는 Multiplication을 주면 문제는 그 쪽에서 알아서 만들라.MSA
      System.out.println("들어옴");
      Multiplication m = ms.createRandomMultiplication();
      System.out.println(m.getFactorA());
      System.out.println(m.getFactorB());
      return ms.createRandomMultiplication();
   }
   @RequestMapping("/t2")
   Boolean f2(@RequestBody MultiplicationResultAttempt mra) {
      System.out.println(mra);
      System.out.println(mra.getUser().getAlias());
      System.out.println(mra.multiplication.factorA);
      System.out.println(mra.multiplication.factorB);
      System.out.println(mra.resultAttempt);  
      // 데이터를 주기만 하고 해결은 그 곳에서만 하면 된다. MSA 하나의 마이크로 서비스를 만들었다.
      //return
      return ms.checkAttempt(mra);
   }
}

//함수는 ()을 붙여 리턴에 .을
//변수(클래스)는 그냥 .을


