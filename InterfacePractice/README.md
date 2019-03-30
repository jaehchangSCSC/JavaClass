INTERFACE PRACTICE
==================

### RoboCorki 와 실제 강아지 Dog를 비교하면서 TestingInterface에서 실행만 시켜봤습니다.

|클래스/INTERFACE|EXTENDS|IMPLEMENTS|내용|
|:-:|:-:|:-:|:---|
|Animal|||모든 동물이 갖고 있을 수 있는 기본적인 기능들을 내포하고 있는 클래스|
|Robot|||로봇이 갖고 있을 수 있는 기본적인 기능들을 내포하고 있는 클래스|
|Pet(INTERFACE)|||애완동물로써 갖고 있을 수 있는 기능을 내포하고 있는 인터페이스|
|Canine|Animal|| |
|Feline|Animal|| |
|Dog|Canine||강아지|
|RoboDog|Robot|Pet|로봇 클래스로부터 상속을 받아서 로봇이지만 Pet을 Implement받아서 Pet으로써의 기능도하는 "애완 로봇"이다. (그저 강아지랑은 상관이 없도록 구성)|

##### 실행 결과

We Got one Pet Dog and one Pet RoboDog, Let's see the difference.
No more fuel, shutting down.
Woof Woof(There it goes to catch the balls)

Oh... RoboCorki did not have fuel, let's add some and turn it back on
Adding 10 fuel to RoboCorki
...... It is on now
Corki은(는) 고기를(을) 먹습니다.

Let's play again shall we?
Let's Play!
Woof Woof(There it goes to catch the balls)

We are menkind's Friend!
Woof Woof Woof

Time for bed
Shutding Down......
Corki Goes to Sleep
