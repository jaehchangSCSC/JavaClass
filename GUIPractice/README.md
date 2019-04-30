**JAVA프로그래밍 실습**
=================

## CALCULATOR

### ATTRIBUTE
##### click(String) : 클릭되어지는 변수로 유저에게 표시가 되는 문자열
##### operation(String) : 연산 변수로 유저가 누른 연산자를 기록하는 변수
##### ANS(Double) : 유저가 연산한 값을 기록하는 변수
##### first(Double) : 연산식 중 앞에 있는 변수
##### second(Double) : 연산식 중 뒤에 있는 변수
##### secondtyped(boolean) : 두번째 변수가 input이 되었는지 확인하는 변수
##### temp(double) : 값을 임시 저장하는 변수
##### memory(Double) : Memory를 기록하는 변수
##### onedecimal(Boolean) : 소수점이 하나만 기록되도록 확인하는 변수
##### operator(Boolean) : 연산자가 사용자에 의해 input되었는지 확인하는 변수
##### double_operator(Boolean) : 연산자가 사용자에 의해 두번 눌러졌는지 확인하는 변수

## METHOD
#### 1 ~ 9숫자
> 만약에 이미 Click에 "0"만 들어가있으면 0으로 인식하고 Click을 ""로 초기화한 뒤에
>> Click에 Buttons[i].getLabel()를 통해 그 버튼에 있는 String값, 즉 그 숫자 String을 Click(String)에 붙인다
>>> 만약에 Operator가 눌러진 경우면 연산식 두번째 숫자이니 Second에 Click을 parseDouble해서 넣어준다
>>>> Operator False이면 연산식 First이니 Click을 parseDouble해서 넣어준다

#### 0, 00 숫자
> 이미 0이거나 값이 추가되지 않은 경우 (그러면 확실하게 소수점이 없는 경우니까) 0만 계속 출력한다
>> 아닌경우 소수점이 있거나 다른 숫자가 있는 경우로 Click 뒤에 "0"을 추가하고 경우에 따라 First/Second에 넣는다

#### . 소수점
> 만약에 onedecimal = false이면 아직 소수점이 없으므로, click += "."로 소수점을 추가해주고 onedecimal를 true로 바꿔준다
>> onedecimal = true이면 이미 소수점이 존재하는 지표로, 아무 행동을 하지 않는다.

#### 사칙연산(+, -, /, *)
> 그냥 사칙연산을 실행 그러나 "/"의 경우 0을 나누면 ERROR가 뜨게 만든다

#### Memory (Memory Clear(MC), Memory Read(MR), Memory Plus(M+), Memory Minus(M-))
> 연속적으로 더하고 빼기를 연산하기 위하여 Memory 변수를 만들어서 M+는 Memory숫자에 더하고 M-는 Memory숫자에서 감소하며 MR은 Memory를 불러와서 TextField에 표시된다
>> MC는 Memory Clear으로 Memory 초기화.

#### Sign Changer (+/-)
> 부호 바꾸는 방식으로 양수이면 그 값을 2배한 값을 빼주고, 음수으면 그 값의 (-2)배한 값을 더해준다

#### = (Result)
> 사칙연산(operation)에 따라서 계산되며 그 결과값을 TextField에 보여준다

#### Backspace
> 값을 하나씩 지우며 더이상 값이 없거나 한 숫자인 경우 0으로 표시해준다.
>> 지우면서 소수점을 지우면 소수점 없어진 것을 감지하고 onedecimal을 false로 변환

## 부가 설명
#### 연속계산
> 숫자를 누르고 "="필요없이 다음 사칙연산 버튼을 누르면서 계속적으로 연산 가능
>> 예) 1, +, 1을 누르고 바로 *를 누르면 1+1이 실행되고 다음 연산 가능
>>>예) 버튼 누르는 순서를 1, +, 1, *, 9 하면 1+1 = 2, 2 * 9 가 실행된다

#### Double_Operation(계산)
> Constant개념으로 사칙연산자를 두번 누르면 실행된다
>> 예) 1, +, +, 1을 누르고 "="를 누르면 1+1이 실행된다. 그러나 1+1과 다른점은 계속적으로 +1을 하고 싶으면 Double_Operation에서는 "="만 계속 눌러주면 된다.
>>> 예) 버튼 누르는 순서를 1,+,+,1,=,=,=,=,=하면 결과값은 6까지 올라간다. 그래서 제곱을 따로 넣지 않고 이 연산으로 충분히 실현 가능하다.


## 수정하면 좋은 점(고려)

#### 비슷한 점들은 묶어서 하나로 만들면 좋을 것 같다, 그러나 숫자 입력하는 것 빼고 거의 다 Unique한 것 같기도 하다.(밑에 이유)
##### 연속 계산을 위해서 Switch...Case...문을 사칙연사자 및 Equal연산에서도 사용하였는데 차이점은 사칙연산을 계속 누르는 경우 그 전 연산자를 통해 계산하고 새로운 연산부호를 넣고 Equal연산은 그 전 연산자를 통해 계산하고 무상태로 초기화해버린다. (각 연산마다 1줄씩 차이난다)


