# 배열과 리스트 개념 및 활용

### 배열

* 자료형의 종류가 아닌 집합을 의미
* 자료형 옆에 []를 붙여 사용
* 크기가 고정됨

```java
//기본형식
int[] odds = {1, 3, 5, 7, 9};

String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
```

* 배열의 길이를 먼저 설정한 뒤, 변수를 생성
  
* 초기값이 없을 경우 숫자를 넣어 길이 설정
  
* ArrayIndexOutOfBoundsException : 배열의 길이와 대입한 값이 맞지 않으면 오류 발생

#### 예제
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[10]; 
        
        // for 문 작성하기
        for(int i = 0; i < numbers.length; i++){
        	numbers[i] = scanner.nextInt();
        }
            
        for (int number:numbers) {
            System.out.println(number); 
        }
    }
}

```

### 리스트
* 리스트는 크기가 변할 수 있어 원하는 대로 담을 수 있음
  * ex. 자료형의 개수가 계속 변하는 상황
* ArrayList
  * add(): 리스트에 요솟값 추가
  * get(): 특정 인덱스 값 추출
  * size(): 요소의 개수 리턴
  * contains(): 특정 항복이 있는지 판별 후 리턴
  * remove(): 해당 항목 삭제
* 제네릭스: 자료형을 안전하게 사용하도록 만들어 주는 기능. 불필요한 코드를 줄인다.
  * ```java
    ArrayList<String> pitches =new ArrayList<>();
    pitches.add("138");
    pitches.add("129");
    String one = pitches.get(0);  // 형 변환이 필요없다.
    String two = pitches.get(1);  // 형 변환이 필요없다.
    ```

# HTTP
* 웹 상에서 데이터를 주고 받기 위한 프로토콜
* 요청(request)과 응답(response) 형식으로 구성
   * GET: 조회 및 검색
   * POST: 새 리소스 생성
   * PUT: 데이터 대체
   * PATCH: 수정
   * DELETE: 삭제


# try-catch
* try 블록은 예외 발생 가능성이 있는 코드를, catch 블록은 예외 발생 시 처리할 코드를 작성
* throw와 throw: 예외를 던지거나 처리해야 할 예외를 명시하는 방법을 다룸

# 회고
### 어려웠던 점

반복문을 통해 리스트 요소를 순회하는 부분이 헷갈렸다. 또한, 각 배열과 리스트의 차이점을 알았지만, 언제 어떤 것을 써야 하는지 다양한 실습을 통해 적절한 것을  익숙해질 필요가 있다고 느꼈다.



### 느낀 점
자바의 기본적인 개념과 실습을 통해 활용 방법에 더 익숙해질 수 있었다. 이론적인 내용을 직접 실습하며 부족한 부분을 발견할 수 있었고, 이를 더 보완할 필요가 있다고 생각했다. 특히 반복문을 많이 사용해보며 다양한 상황에도 적절히 사용할 수 있도록 연습해야겠다고 느꼈다.