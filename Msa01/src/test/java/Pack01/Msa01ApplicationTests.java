////
////
////
//////package Pack01;
//////import java.util.Random;
//////
//////import org.junit.jupiter.api.Test;
//////import org.springframework.beans.factory.annotation.Autowired;
//////import org.springframework.boot.test.context.SpringBootTest;
//////import org.springframework.boot.test.mock.mockito.MockBean;
//////import org.springframework.stereotype.Service;
//////import static org.mockito.BDDMockito.*;
////
//////@SpringBootTest
//////class Msa01ApplicationTests {
//////
//////	@Test
//////	void test01() {
//////
//////	}
//////}
//
//
//
//package Pack01;
//
//import java.util.Random;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//import org.springframework.stereotype.Service;
//
//import lombok.*;
//import net.bytebuddy.implementation.bytecode.Multiplication;
//
//import static org.mockito.BDDMockito.*;
//
//
//
////곱셈 문제지
//class Multiple{
//   int factorA, factorB;
//   int result;
//   Multiple(int factorA, int factorB){
//      this.factorA = factorA;
//      this.factorB = factorB;
//      this.result = this.factorA * this.factorB;
//   }
//   void show() {
//      System.out.println("factorA : " + factorA);
//      System.out.println("factorB : " + factorB);
//      System.out.println("result : " + result);
//   }
//}
//
//interface RandomGenService{
//   int getRandom();
//}
//@Service
////난수 생성 서비스
//class RandomGenServiceImpl implements RandomGenService{
//   public int getRandom() {
//      return new Random().nextInt(10);
//   }
//}
//
//
//
//
//
//interface MultipleService{
//   Multiple getMultiple();
//   boolean checkAttempt(MultiplicationResultAttempt resultAttempt);
//}
//
////곱셈 생성 서비스
//@Service
//class MultipleServiceImpl implements MultipleService{
//   @Autowired
//   RandomGenService rnd;
//
//   public Multiple getMultiple() {
//      int a = rnd.getRandom();
//      int b = rnd.getRandom();
//      return new Multiple(a, b);
//   }
//   @Override
//   public boolean checkAttempt(MultiplicationResultAttempt resultAttempt) {
//      // TODO Auto-generated method stub
//      return false;
//   }
//}
//
//@RequiredArgsConstructor
//@ToString
//@Getter
//class User{
//   final String alis;
//   User(){
//      alis = "익명";
//   }
//}
//
//
//@RequiredArgsConstructor
//class MultiplicationResultAttempt{
//   
//   final User user;
//   final Multiple multiple;
//   final int resultAttempt;
//   
//   MultiplicationResultAttempt(){
//      this(null,null,0);
//   }
//}
//
//@SpringBootTest
//class Msa01ApplicationTests {
//   @Autowired
//   MultipleService multipleService;
//   @Test
//   void test01() {
//      
//      
//      MultiplicationResultAttempt attemp=new MultiplicationResultAttempt(
//            new User("tiger"),multipleService.getMultiple(),3000
//            );
//      
//      
//      multipleService.checkAttempt(attemp);
//      
//   }
//}
////
////
////
////
//////package Pack01;
//////
//////import java.util.Random;
//////
//////import org.junit.jupiter.api.Test;
//////import org.springframework.beans.factory.annotation.Autowired;
//////import org.springframework.boot.test.context.SpringBootTest;
//////import org.springframework.boot.test.mock.mockito.MockBean;
//////import org.springframework.stereotype.Service;
//////
//////import lombok.Getter;
//////import lombok.RequiredArgsConstructor;
//////import lombok.ToString;
//////
//////import static org.mockito.BDDMockito.*;
//////
//////@RequiredArgsConstructor
//////@ToString
//////@Getter
//////class User {
//////	final String alias;
//////	User(){
//////		alias = "익명";
//////	}
//////	
//////}
//////
//////@SpringBootTest
//////class Msa01ApplicationTests {
//////
//////	@Test
//////	void test01() {
//////		User user1 = new User("호랑이");
//////		User user2 = new User();
//////		System.out.println(user1.toString());
//////		System.out.println(user2.getAlias());
//////	}
//////}
//////
//////
//////
//////
////
////
////
////
////
////
////
////
////
////
////
////
//////========================
////
//////package Pack01;
//////
//////import java.util.Random;
//////import org.junit.jupiter.api.Test;
//////import org.springframework.beans.factory.annotation.Autowired;
//////import org.springframework.boot.test.context.SpringBootTest;
//////import org.springframework.boot.test.mock.mockito.MockBean;
//////import org.springframework.stereotype.Service;
//////
//////import lombok.*;
//////
//////import static org.mockito.BDDMockito.*;
//////
////////@Data는 밑의 5개를 전부 포함. 그러나 final일 때만 사용하는 RequiredArgsConstructor 때문에 필요한 것을 직접 다 입력하는 것이 좋다.
////////@Getter
////////@Setter
////////@RequiredArgsConstructor
////////@ToString
////////@EqualsAndHashCode
////////어노테이션을 데코레이터 한다고 표현.
//////
//////@Getter
//////@Setter
//////@NoArgsConstructor //인수전달이 없는 생성자를 제작해준다.
//////@AllArgsConstructor //인수전달이 있는 생성자를 전부 제작해준다.
//////@ToString
//////class Tiger{
//////	String name;
//////	int age;
//////}
//////
////////@RequiredArgsConstructor //final에 대하며 만들어준다.
//////@Data
//////class Tiger2{
//////	final String name;
//////	final int age;
//////}
//////
//////
////////class Tiger3{
////////	final String name;
////////	final int age;
////////	Tiger3(){
////////		this("",0);
////////	}
////////	Tiger3(String name, int age){
////////		this.name = name;
////////		this.age = age;
////////	}
////////}
//////
//////@RequiredArgsConstructor
//////class Tiger3 {
//////	final String name;
//////	final int age;
//////
//////	Tiger3() {
//////		this("", 0);
//////	}
//////}
//////
//////
//////
//////@SpringBootTest
//////class Msa01ApplicationTests {
//////
//////	@Test
//////	void test01() {
//////		Tiger t1 = new Tiger();
//////		Tiger t2 = new Tiger("호랑이", 10);
//////		Tiger2 t3 = new Tiger2("호랑이", 10);
//////		System.out.println(t2.toString()); //해쉬 코드값과 똑같다
//////		
//////		Tiger3 t4 = new Tiger3();
//////		Tiger3 t5 = new Tiger3("호랑이",10);
//////		System.out.println(t4.toString());
//////		System.out.println(t5.toString());
//////	}
//////
//////}
////
//////=========================================================================
////
//////package Pack01;
//////
//////
////////도구들부터 만들어서 조합한다.= 인터페이스 먼저 만든다.
//////import java.util.Random;
//////
//////import org.junit.jupiter.api.Test;
//////import org.springframework.beans.factory.annotation.Autowired;
//////import org.springframework.boot.test.context.SpringBootTest;
//////import org.springframework.boot.test.mock.mockito.MockBean;
//////import org.springframework.stereotype.Service;
//////import static org.mockito.BDDMockito.*;
//////
//////
//////// 도구들 부터만든다 == 인터페이스를 만든다.
//////
//////// 3.
//////class Multiple {
//////	int factorA, factorB;
//////	int result;
//////
//////	Multiple(int factorA, int factorB) {
//////		this.factorA = factorA;
//////		this.factorB = factorB;
//////		this.result = this.factorA * this.factorB;
//////	}
//////}
//////
//////// 1.
//////interface RandomGenService {
//////	int getGenRandom();
//////
//////}
//////
//////// 2.
//////class RandomGenServiceImpl implements RandomGenService {
//////	@Override
//////	public int getGenRandom() {
//////		return new Random().nextInt(10);
//////	}
//////
//////}
//////
////////4
//////// 곱셈 문제 생성자
//////interface MultipleGenService {
//////	Multiple getMultiple();
//////}
//////
////////5
//////class MultipleGenServiceImpl implements MultipleGenService {
//////	@Override
//////	public Multiple getMultiple() {
//////		RandomGenServiceImpl r = new RandomGenServiceImpl();
//////		return new Multiple(r.getGenRandom(), r.getGenRandom());
//////	}
//////}
//////
//////@SpringBootTest
//////class Msa01ApplicationTests {
//////
//////	@Test
//////	void test01() {
//////
//////	}
//////}
//////
//////
//////
//////
////
////
//////=========================
////
//////package Pack01;
//////import java.util.Random;
//////
//////import org.junit.jupiter.api.Test;
//////import org.springframework.beans.factory.annotation.Autowired;
//////import org.springframework.boot.test.context.SpringBootTest;
//////import org.springframework.boot.test.mock.mockito.MockBean;
//////import org.springframework.stereotype.Service;
//////import static org.mockito.BDDMockito.*;
//////
//////
//////
//////class Multiple{
//////	int factorA, factorB;
//////	int result;
//////	Multiple(int factorA,int factorB){
//////		this.factorA = factorA;
//////		this.factorB = factorB;
//////		this.result = this.factorA * this.factorB;
//////	}
//////	void show() {
//////		System.out.println("factorA :" + factorA);
//////		System.out.println("factorB :" + factorB);
//////		System.out.println("result :" + result);
//////	}
//////}
//////
//////// 난수 생성 서비스. 인터페이스화 시키면 원하는 형태의 함수들을 만들 수 있다.
////////class RandomGenService{
////////	int getGenRandom() {
////////		return new Random().nextInt(10);
////////	}
////////}
//////interface RandomGenService{
//////	int getGenRandom();
//////}
//////@Service
//////class RandomGenServiceImpl implements RandomGenService{
//////public int getGenRandom() { // 인터페이스가 있으면 public으로.
//////	return new Random().nextInt(10);
//////}
//////}
//////
////////이 서비스 또한 인터페이스를 제작했다.
//////interface MultipleService{
//////	Multiple getMultiple();
//////}
//////
////////곱셈 생성 서비스 
//////@Service
//////class MultipleServiceImpl implements MultipleService{
//////	@Autowired
//////	RandomGenService rnd;
//////	public Multiple getMultiple() {
//////		
//////		//autowired 시키자
//////		//RandomGenService rnd = new RandomGenServiceImpl();
//////		int a = rnd.getGenRandom();
//////		int b = rnd.getGenRandom();
////////		a= 3;
////////		b= 4;
//////		return new Multiple(a,b);
//////	}
//////}
//////
//////
//////@SpringBootTest
//////class Msa01ApplicationTests{   
//////	@Autowired
//////	MultipleService multipleService;
//////
//////   @Test
//////   void test01() {
////////		autowired 할 것이다.
////////	   MultipleService multipleService = new MultipleService();
//////	   Multiple multiple = multipleService.getMultiple();
//////	   multiple.show();
//////   }
//////}
//////
////
////
////
//////==========================================================
////
//////package Pack01;
//////import java.util.Random;
//////
//////import org.junit.jupiter.api.Test;
//////import org.springframework.beans.factory.annotation.Autowired;
//////import org.springframework.boot.test.context.SpringBootTest;
//////import org.springframework.boot.test.mock.mockito.MockBean;
//////import org.springframework.stereotype.Service;
//////import static org.mockito.BDDMockito.*;
//////
////////                      Multiplication
////////
//////// MultiplicationService                  RandomGeneratorService
//////// MultiplicationServiceImpl               RandomGeneratorServiceImpl
//////class Multiplication{
//////   int factorA, factorB;
//////   int result;
//////   Multiplication(int factorA, int factorB){
//////      this.factorA = factorA;
//////      this.factorB = factorB;
//////      this.result = factorA * factorB;
//////   }
//////   int getFactorA() {return factorA;}
//////   int getFactorB() {return factorB;}
//////   int getResult() {return result;}
//////   
//////   @Override
//////   public String toString() {
//////      return "Multiplication [factorA=" + factorA + ", factorB=" + factorB + ", result=" + result + "]";
//////   }
//////}
//////// ex) B
//////interface RandomGeneratorService{
//////   int generateRandomFactor();
//////}
//////
//////@Service
//////class RandomGeneratorServiceImpl implements RandomGeneratorService{
//////   @Override
//////   public int generateRandomFactor() {
//////      int a = 10;
//////      int b = 20;
//////      return new Random().nextInt((b - a)+ 1) + a;
//////   }
//////}
//////// ex) C
//////interface MultiplicationService{
//////   Multiplication createRandomMultiplication();
//////}
//////@Service
//////class MultiplicationServiceImpl implements MultiplicationService{   
////////   아래와 같은 방법으로도 Autowired를 할 수 있다.
//////   @Autowired
//////   RandomGeneratorService randomGeneratorService;
//////   
//////   @Override
//////   public Multiplication createRandomMultiplication() {   
//////      int factorA = randomGeneratorService.generateRandomFactor();
//////      int factorB = randomGeneratorService.generateRandomFactor();
//////      return new Multiplication(factorA, factorB);
//////   }
//////   
////////   이 방식이 정석, 사용 권장
////////   @Autowired
////////   MultiplicationServiceImpl(RandomGeneratorService randomGeneratorService){ 
////////      this.randomGeneratorService = randomGeneratorService;
////////   }
//////}
//////
//////@SpringBootTest
//////class Msa01ApplicationTests{   
//////   
//////   @Autowired
//////   MultiplicationServiceImpl multiplicationServiceImpl;
//////   
////// 
//////   @Test
//////   void test01() {
////////      Multiplication m = multiplicationServiceImpl.createRandomMultiplication();
////////      System.out.println(m.toString());
//////      
//////
//////      System.out.println("end");
//////      // 1. 회사에서 시험 문제를 출제한다.
//////      // 2. 시험문제는 랜덤한 2개의 숫자이다.
//////      // 3. 2개의 숫자를 사용자가 곱한다.
//////      // 4. 곱한 결과를 회사에 다시 제출한다.
//////      // 5. 제출된 결과를 채점한다.
//////      // 6. 채점 결과를 사용자에게 다시 돌려준다.
//////   }
//////}
//////
////
//////==================================================================
////
//////
//////package Pack01;
//////import java.util.Random;
//////import org.junit.jupiter.api.Test;
//////import org.springframework.beans.factory.annotation.Autowired;
//////import org.springframework.boot.test.context.SpringBootTest;
//////import org.springframework.boot.test.mock.mockito.MockBean;
//////import org.springframework.stereotype.Service;
//////import static org.mockito.BDDMockito.*;
//////
////////                      Multiplication
////////
//////// MultiplicationService                  RandomGeneratorService
//////// MultiplicationServiceImpl               RandomGeneratorServiceImpl
//////class Multiplication{
//////   int factorA, factorB;
//////   int result;
//////   Multiplication(int factorA, int factorB){
//////      this.factorA = factorA;
//////      this.factorB = factorB;
//////      this.result = factorA * factorB;
//////   }
//////   int getFactorA() {return factorA;}
//////   int getFactorB() {return factorB;}
//////   int getResult() {return result;}
//////   
//////   @Override
//////   public String toString() {
//////      return "Multiplication [factorA=" + factorA + ", factorB=" + factorB + ", result=" + result + "]";
//////   }
//////}
//////// ex) B
//////interface RandomGeneratorService{
//////   int generateRandomFactor();
//////}
//////
//////@Service
//////class RandomGeneratorServiceImpl implements RandomGeneratorService{
//////   @Override
//////   public int generateRandomFactor() {
//////      int a = 10;
//////      int b = 20;
//////      return new Random().nextInt((b - a)+ 1) + a;
//////   }
//////}
//////// ex) C
//////interface MultiplicationService{
//////   Multiplication createRandomMultiplication();
//////}
//////@Service
//////class MultiplicationServiceImpl implements MultiplicationService{   
////////   아래와 같은 방법으로도 Autowired를 할 수 있다.
//////   @Autowired
//////   RandomGeneratorService randomGeneratorService;
//////   
//////   @Override
//////   public Multiplication createRandomMultiplication() {   
//////      int factorA = randomGeneratorService.generateRandomFactor();
//////      int factorB = randomGeneratorService.generateRandomFactor();
//////      return new Multiplication(factorA, factorB);
//////   }
//////   
////////   이 방식이 정석, 사용 권장
////////   @Autowired
////////   MultiplicationServiceImpl(RandomGeneratorService randomGeneratorService){ 
////////      this.randomGeneratorService = randomGeneratorService;
////////   }
//////}
//////
//////interface AAA{
//////   int getRandomNum();
//////}
//////
//////interface BBB{
//////   int get();
//////}
//////@Service
//////class BBBImpl implements BBB{
//////   @Autowired
//////   AAA aaa;
//////   @Override
//////   public int get() {
//////      System.out.println(aaa.getRandomNum());
//////      System.out.println(aaa.getRandomNum());
//////      System.out.println(aaa.getRandomNum());
//////      System.out.println(aaa.getRandomNum());
//////      System.out.println(aaa.getRandomNum());
//////      return 10;
//////   }
//////}
//////@SpringBootTest
//////class Msa01ApplicationTests{   
//////   
//////   @Autowired
//////   MultiplicationServiceImpl multiplicationServiceImpl;
//////   
//////   @MockBean
//////   AAA aaa;
//////   
//////   @Autowired
//////   BBB bbb;
//////   
//////   @Test
//////   void test01() {
////////      Multiplication m = multiplicationServiceImpl.createRandomMultiplication();
////////      System.out.println(m.toString());
//////      
//////      // 랜덤한 2개의 숫자를 뽑는다.
//////      given(aaa.getRandomNum()).willReturn(30, 50, 70, 10, 20);
//////      
//////      bbb.get();
//////      System.out.println("end");
//////      // 1. 회사에서 시험 문제를 출제한다.
//////      // 2. 시험문제는 랜덤한 2개의 숫자이다.
//////      // 3. 2개의 숫자를 사용자가 곱한다.
//////      // 4. 곱한 결과를 회사에 다시 제출한다.
//////      // 5. 제출된 결과를 채점한다.
//////      // 6. 채점 결과를 사용자에게 다시 돌려준다.
//////   }
//////}
////
////
//////======================================================
//////package Pack01;
//////import java.util.Random;
//////
//////import org.junit.jupiter.api.Test;
//////import org.springframework.beans.factory.annotation.Autowired;
//////import org.springframework.boot.test.context.SpringBootTest;
//////import org.springframework.boot.test.mock.mockito.MockBean;
//////import org.springframework.stereotype.Service;
//////import static org.mockito.BDDMockito.*;
//////
//////
//////
//////
//////interface AAA{
//////   int getRandomNum();
//////}
//////
//////interface BBB{
//////   int get();
//////}
//////@Service
//////class BBBImpl implements BBB{
//////   @Autowired
//////   AAA aaa;
//////   @Override
//////   public int get() {
//////      System.out.println(aaa.getRandomNum());
//////      System.out.println(aaa.getRandomNum());
//////      System.out.println(aaa.getRandomNum());
//////      System.out.println(aaa.getRandomNum());
//////      System.out.println(aaa.getRandomNum());
//////      return 10;
//////   }
//////}
//////@SpringBootTest
//////class Msa01ApplicationTests{   
//////   
//////
//////   
//////   @MockBean
//////   AAA aaa;
//////   
//////   @Autowired
//////   BBB bbb;
//////   
//////   @Test
//////   void test01() {
//////
//////      given(aaa.getRandomNum()).willReturn(30, 50, 70, 10, 20);
//////      
//////      bbb.get();
//////      System.out.println("end");
//////      // 1. 회사에서 시험 문제를 출제한다.
//////      // 2. 시험문제는 랜덤한 2개의 숫자이다.
//////      // 3. 2개의 숫자를 사용자가 곱한다.
//////      // 4. 곱한 결과를 회사에 다시 제출한다.
//////      // 5. 제출된 결과를 채점한다.
//////      // 6. 채점 결과를 사용자에게 다시 돌려준다.
//////   }
//////}
//////
//////
////
////
////
//////===================================
//////package Pack01;
////////Crtl + F11 은 실행
//////// 스프링 부트를 활용한 마이크로 서비스 개발 P22 까지
//////import java.util.Random;
//////
//////import org.junit.jupiter.api.Test;
//////import org.springframework.beans.BeansException;
//////import org.springframework.beans.factory.annotation.Autowired;
//////import org.springframework.boot.test.autoconfigure.OverrideAutoConfiguration;
//////import org.springframework.boot.test.context.SpringBootTest;
//////import org.springframework.boot.test.mock.mockito.MockBean;
//////import org.springframework.context.ApplicationContext;
//////import org.springframework.context.ApplicationContextAware;
//////import org.springframework.stereotype.Service;
//////
//////
//////// 							Multiplication
//////// RandomGeneratorService					MultiplicationService
//////// RandomGeneratorServiceImpl				MultiplicationServiceImpl
//////
//////class Multiplication {
//////	int factorA, factorB;
//////	int result;
//////
//////	Multiplication(int factorA, int factorB) {
//////		this.factorA = factorA;
//////		this.factorB = factorB;
//////		this.result = factorA * factorB; 
//////	}
//////
//////	int getFactorA() {
//////		return factorA;
//////	}
//////
//////	int getFactorB() {
//////		return factorB;
//////	}
//////
//////	int getFactor() {
//////		return result;
//////	}
//////
//////	@Override
//////	public String toString() {
//////		return "Multiplication [factor A =" + factorA + ", factorB=" + factorB + "]";
//////	}
//////}
//////
//////// ex) B. 객체가 없으면 생성 X
//////interface RandomGeneratorService {
//////	int generateRandomFactor(); // 어떻게 구현(생성)될 지는 모르지만 미리 테스트를 해보겠다.
//////}
//////
//////@Service
//////class RandomGeneratorServiceImpl implements RandomGeneratorService {
//////	@Override
//////	public int generateRandomFactor() {
////////		int a = 10; //최소 값.
////////		int b = 20; //최대 값
////////		return new Random().nextInt(b-a+1)+10; // 최소와 최대 값 사이의 유효 값 10~20 나오는 유명한 공식
//////		return new Random().nextInt(100);
//////	}
//////}
//////
//////// ex) C.
//////interface MultiplicationService {
//////	Multiplication createRandomMultiplication();
//////}
//////
//////@Service
//////class MultiplicationServiceImpl implements MultiplicationService {
//////
//////	@Autowired
//////	RandomGeneratorService randomGeneratorService;
//////
////////	커뮤니티에서는 밑의 방법이 안전해서 더 좋다고 하나 근거 없는 말이다.
////////	RandomGeneratorService randomGeneratorService;
////////	@Autowired
////////	MultiplicationServiceImpl(RandomGeneratorService randomGeneratorService){
////////		this.randomGeneratorService = randomGeneratorService;
////////	}
//////
//////	@Override
//////	public Multiplication createRandomMultiplication() {
//////		// TODO Auto-generated method stub
//////		int factorA = randomGeneratorService.generateRandomFactor();
//////		int factorB = randomGeneratorService.generateRandomFactor();
//////		return new Multiplication(factorA, factorB);
//////	}
//////
//////}
//////
//////
//////@SpringBootTest
//////class Msa01ApplicationTests {
//////
//////	@Autowired
//////	MultiplicationServiceImpl multiplicationServiceImpl;
//////
//////	@Test
//////	void test01() {
//////		Multiplication m = multiplicationServiceImpl.createRandomMultiplication();
//////		System.out.println(m.toString());
//////		
//////		
//////		
//////	}
//////
//////}
//////
//////
////
////
//////=======================================
////
//////package Pack01;
////////Crtl + F11 은 실행
//////
//////
//////import java.util.Random;
//////
//////import org.junit.jupiter.api.Test;
//////import org.springframework.beans.BeansException;
//////import org.springframework.beans.factory.annotation.Autowired;
//////import org.springframework.boot.test.autoconfigure.OverrideAutoConfiguration;
//////import org.springframework.boot.test.context.SpringBootTest;
//////import org.springframework.context.ApplicationContext;
//////import org.springframework.context.ApplicationContextAware;
//////import org.springframework.stereotype.Service;
//////
////////**인터페이스를 이용하는 전형적인 경우
//////
//////class A{
//////	int a,b;
//////	A(int a, int b){
//////		this.a = a;
//////		this.b = b;
//////	}
//////	int getResult() {return a*b;}
//////}
//////
//////
//////interface B{
//////	int getNum();
//////}
//////
//////
////////랜덤 전문 관리 클래스
//////@Service
//////class BImpl implements B{
//////	@Override
//////	public int getNum() {
//////		return new Random().nextInt(10);
//////	}
//////}
//////
//////interface C{
//////	A f1();
//////}
//////
//////@Service
//////class CImpl implements C{
//////	
//////	@Autowired
//////	B b;
//////	
//////	@Override
//////	public A f1() {
//////		return new A(b.getNum(), b.getNum());
//////	}
//////}
//////
//////
//////@SpringBootTest
//////class Msa01ApplicationTests{
//////	@Autowired
//////	C c;
//////	
//////	@Test
//////	void test01() {
//////	A a = c.f1();
//////	System.out.println(a.a + " " + a.b);
//////	System.out.println(a.getResult());
//////	}
//////}
////
////
////// 자동 생성 어노테이션
////// @Service
////// @Component
////// @Controller
////// @Repositoty
////
////
//////===================================================================
////
////
//////
//////package Pack01;
////////Crtl + F11 은 실행
//////
//////
//////import org.junit.jupiter.api.Test;
//////import org.springframework.beans.BeansException;
//////import org.springframework.beans.factory.annotation.Autowired;
//////import org.springframework.boot.test.context.SpringBootTest;
//////import org.springframework.context.ApplicationContext;
//////import org.springframework.context.ApplicationContextAware;
//////import org.springframework.stereotype.Service;
//////
////////**인터페이스를 이용하는 전형적인 경우
//////
//////interface A{
//////	void f1();
//////}
//////
//////@Service
//////class TigerImpl implements A{ //Impl을 약자로 많이 붙인다.
//////	@Override
//////	public void f1() {
//////		System.out.println("call");
//////	}
//////	
//////}
//////
//////
//////
//////@SpringBootTest
//////class Msa01ApplicationTests{
//////	
////////	B b1 = new B();
////////	A b2 = new B();
//////	
//////	
//////	// 99%
//////	@Autowired
//////	A a; //업캐스팅으로 받은 경우
//////	
//////	// 1%
//////	@Autowired
//////	TigerImpl b;
//////	
//////	@Test
//////	void test01() {
//////		a.f1();
//////		b.f1();
//////	}
//////}
////
////
////
////
////
//////=============================================================
////
//////
//////package Pack01;
////////Crtl + F11 은 실행
//////
//////
//////import org.junit.jupiter.api.Test;
//////import org.springframework.beans.BeansException;
//////import org.springframework.beans.factory.annotation.Autowired;
//////import org.springframework.boot.test.context.SpringBootTest;
//////import org.springframework.context.ApplicationContext;
//////import org.springframework.context.ApplicationContextAware;
//////import org.springframework.stereotype.Service;
//////
//////
//////@Service
//////class A{
//////	void f1() {
//////		System.out.println("call");
//////	}
//////}
//////
//////@Service
//////class B{
//////	@Autowired
//////	A a;	
//////	
//////	void f2() {
//////		System.out.println("call2");
//////		System.out.println(a);
//////		a.f1();
//////	}
//////}
//////
//////
//////
//////@SpringBootTest
//////class Msa01ApplicationTests{
//////	@Autowired	
//////	B b;
//////	
//////	@Test
//////	void test01() {
//////			// 이렇게 한다고 해더라도 a.f1()은 실행이 되지 않는다. 즉 A a가 autowired로 객체 생성이 되지 않는다. 즉 B도 service로 등록해야 한다.
//////			//B b = new B();
//////			
//////			b.f2();
//////	}
//////}
//////
////
////
////
////
////
//////===================================================
////
////
//////package Pack01;
////////Crtl + F11 은 실행
//////
//////
//////import org.junit.jupiter.api.Test;
//////import org.springframework.beans.BeansException;
//////import org.springframework.beans.factory.annotation.Autowired;
//////import org.springframework.boot.test.context.SpringBootTest;
//////import org.springframework.context.ApplicationContext;
//////import org.springframework.context.ApplicationContextAware;
//////import org.springframework.stereotype.Service;
//////
//////
//////@Service
//////class Tiger{
//////	Tiger(){}
//////	void f1() {
//////		System.out.println("call");
//////	}
//////}
//////
//////
//////@SpringBootTest
//////class Msa01ApplicationTests{
//////	@Autowired // 자동 주입을 시켜준다. new로 만든 객체는 spring이 관리안한다. container에서 차곡 차곡 쌓아서 spring이 관리 시키게 만들어야한다.
//////	// 다만 Spring이 객체를 가지고 있다는(@Service) 확신이 있어야한다.
//////	Tiger t;// = new Tiger();
//////	
//////	@Test
//////	void test01() {
//////		System.out.println("start");
//////		System.out.println(toString().hashCode());
//////		t.f1();
//////	}
//////}
//////
////
////
////
////
////
//////===============================
//////package Pack01;
////////Crtl + F11 은 실행
//////
//////
//////import org.junit.jupiter.api.Test;
//////import org.springframework.beans.BeansException;
//////import org.springframework.boot.test.context.SpringBootTest;
//////import org.springframework.context.ApplicationContext;
//////import org.springframework.context.ApplicationContextAware;
//////import org.springframework.stereotype.Service;
//////
//////
////////Spring boot이 Componet scan을 자동으로 시킨다.(디폴트)
////////@Service가 무조건 객체를 생성 시킨다.
//////// 자동 주입 대상으로 자동으로 autowired 되는 애를 구태여 객체로 만들었다. 확인을 위해서
//////@Service("tiger")
//////class Tiger{
//////	Tiger(){
//////		System.out.println("생성자 콜");
//////	}
//////	void f1() {
//////		System.out.println("f1 call");
//////	}
//////}
//////@SpringBootTest
//////class Msa01ApplicationTests implements ApplicationContextAware{
//////	ApplicationContext applicationContext;
//////	@Override
//////	public void setApplicationContext(
//////			ApplicationContext applicationContext) 
//////					throws BeansException {
//////		// TODO Auto-generated method stub
//////		System.out.println("setApplicationContext");
//////		this.applicationContext = applicationContext;
//////	}
//////	@Test
//////	void test01() {
//////		System.out.println(1000);
//////		try {
//////		//등록된 객체를 가져온다
//////		Tiger t = applicationContext.getBean("tiger", Tiger.class);
//////		System.out.println(t.hashCode());
//////		t.f1();
//////		}catch (Exception e) {
//////			// TODO: handle exception
//////			e.printStackTrace();
//////		}
//////		
//////	}
//////}
