
 # Scanner
  ### System.in을 통해 사용자의 입력을 받는다.
  ### Scanner클래스를 이용해서 사용한다.
  #### 1. import java.util.Scanner
  #### 2. Scanner scanner(변수명) = new Scanner(System.in)
  #### 3(1). String str(변수명) = scanner.nextLine()(문자열일떄)
  #### 3(2). int a(변수명) = scanner.nextInt()(정수형일때)
  #### 3(3). double b(변수명) = scanner.nextDouble()(실수형일때)
    package Scanner;

    import java.util.Scanner;

    public class Scanner1 {
    public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in); //new를 사용해서 Scanner를 사용한다. System.in은 사용자 입력을 편리하게 만든다.

        System.out.print("문자열을 입력하세요:");
        String str = scanner.nextLine(); //입력을 문자열으로 가져온다
        System.out.println("입력한 문자열 " + str);

        System.out.print("정수를 입력하세요");
        int a = scanner.nextInt(); //입력을 정수로 가져온다.
        System.out.println("입력한 정수 " + a);

        System.out.print("실수를 입력하세요");
        double b = scanner.nextDouble(); //입력을 실수로 가져온다.
        System.out.println("입력한 실수 " + b);
     }
    } 
  ### 주의할 것 : 입력할 때 숫자 타입에 문자타입 넣으면 오류발생
  ### 즉, 타입이 같아야함.

# while안에 Scanner
 ### while((input = scanner.nextInt()) !=-1)처럼 scanner로 입력을 하고 조건을 비교할 수 있다.
