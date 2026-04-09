# Controller
 - Controller는 화면(View)과 비즈니스 로직(Service)을 연결
 - 웹 요청을 받아 처리, 응답 돌려주는 역할 클래스
    - ex)aaa로 가줘 요청 -> 주소 받아들여 어디로갈지 연결

 ## 순서
    1. 사용자 요청 받기
    2. 비즈니스 로직(Service) 호출
    3. Model에 데이터 담기
    4. View로 반환
 