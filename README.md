## 숫자야구 (with CleanCode)
1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임
<br>
<br>


### ❇️ 기능 요구사항
**[📌 게임 진행방식]**
1. 컴퓨터가 1에서 9까지 서로 다른 임의의 수 3개를 선택한다. 
2. 게임 플레이어는 컴퓨터가 생각한 3개의 숫자를 입력하고, 
3. 컴퓨터는 입력한 숫자에 대한 결과를 출력한다. 
4. 이 과정을 반복하여 컴퓨터가 선택한 숫자 3개를 모두 맞히면 게임이 종료된다.

<br>
❕게임을 종료한 후 게임을 다시 시작하거나, 완전히 종료할 수 있다.
<br>
<br>
<br>

**[📌 주의사항]**
- 1부터 9까지의 숫자만 가능하다. 
- 같은 수가 
  - 같은 자리에 있다면 스트라이크, 
  - 다른 자리에 있으면 볼, 
  - 같은 수가 전혀 없으면 포볼 또는 낫싱 힌트 출력

<br>
<br>
<br>

**[📌 프로그래밍 요구사항]**
- 자바 코드 컨벤션을 지키면서 프로그래밍 한다. 
  - 기본적으로 Google Java Style Guide을 원칙으로 한다. 
  - 들여쓰기는 '4 space' 
- indent(인덴트, 들여쓰기) depth를 2가 넘지 않도록 구현한다. 
  - ex) if문 안에 if문 택
  - hint) depth를 줄이기 좋은 방법은 함수로 분리하면 된다. 
- 함수가 한 가지 일만 하도록 최대한 작게 만든다.
- 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
  - UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
- else 예약어를 사용하지 않는다. ❌
    - switch/case 또한 허용하지 않는다. 
  - hint) if 조건절에서 값을 return 한다.
- 3항 연산자를 사용하지 않는다. ❌
- 로직에 단위 테스트를 구현한다.
  - 필수가 아닌 선택사항.
  - UI(System out, System in) 로직은 제외해도 된다. 