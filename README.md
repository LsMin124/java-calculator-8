# java-calculator-precourse

## 목표

입력한 문자열에 대해 숫자를 추출하고 모두 더하는 계산기를 구현할 것.

## 필요 기능

1. 사용자로부터 문자열을 입력받기
2. 입력값이 null 혹은 빈 문자열의 경우 예외처리
3. 쉼표 혹은 콜론 구분자로 숫자 분리
4. 커스텀 구분자 사이의 문자 추출
5. 분리된 문자열을 숫자로 변환
6. 음수에 대한 예외처리
7. 모든 숫자들의 합 반환
8. 계산 결과 출력

## 기타 제한조건
- JDK 21에서의 실행
- 프로그램 시작점은 Application의 main()
- camp.nextstep.edu.missionutils의 Console API 사용하여 구현할것. 사용자 입력값은 Console의 readLine() 활용