package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp         //사용자가 직접 조종하는 코드다!

public class servo_test extends LinearOpMode {            //test 라는 이름의 로봇 제어 코드를 LinearOpMode 방식으로 작성하겠다!

    @Override

    public void runOpMode() throws InterruptedException {

        Servo myservo = hardwareMap.servo.get("servoTest");     //servoTest 라고 configure 한 서보를 myservo 라고 코딩할 때 쓰겠다!

        waitForStart();                             //시작버튼(▶) 눌리기 기다리기



        while (opModeIsActive()) {                  //시작버튼(▶) 을 눌렀을 때 반복하기

            if (isStopRequested()) return;              //만약 사용자가 중단했다면? -> 코드 멈추기

            if (gamepad1.a) {                       //만약 게임패드 a를 눌렀다면
                myservo.setPosition(0);             //myservo 의 위치를 0으로 옮긴다.
            }

            if (gamepad1.b) {                       //만약 게임패드 b를 눌렀다면
                myservo.setPosition(1);             //myservo 의 위치를 1로 옮긴다.
            }

            if (gamepad1.x) {                       //만약 게임패드 x를 눌렀다면
                myservo.setPosition(0.5);           //myservo 의 위치를 0.5로 옮긴다.
            }

        }

    }

}

