**CHATTING PROGRAM**

==========================================

## 2019년 6월 

#### 채팅 프로그램을 구현하면서 Socket Programming 및 Multi-Thread Programming을 사용하겠습니다

#### 사용한 API
##### 1) ServerSocekt : 서버 역할을 하는 소켓 객체
##### 2) Socket : 클라이언트와 서버 간의 통신을 담당하는 객체
##### 3) InetAddress : IP 주소를 표현할 때 사용하는 클래스
##### 4) InetSocketAddress : SocketAddress를 상속받은 클래스로, 소켓의 IP주소와 port번호를 알 수 있도록 구현한 클래스
##### 5) InputStream / OutputStream : byte 데이터를 입출력하기 위한 IO 클래스


### TCPServer
#### ServerSocket 객체로 연결을 받아들이는 소켓을 생성한 후, 클라이언트로부터 요청을 대기

### TCPClient
#### 상수로 TCP Server의 IP를 작성한 후, 통신을 담당하는 Socket 객체를 생성하여 connect() 메서드를 호출합니다.

### ChatServer
#### 클라이언트의 요청을 받아들이는 TCP

### ChatServerProcessThread
#### 클라이언트로부터 요청이 오면 클라이언트와 통신을 하기 위해 서버에서 생성되는 쓰레드

### ChatClientApp
#### TCP 클라이언트 클래스

### ChatWindow
#### java.awt로 작성된 UI 화면 클래스


## ChatServer를 실행하고 chatclient.jar을 실행.

## 출처 : https://victorydntmd.tistory.com/135