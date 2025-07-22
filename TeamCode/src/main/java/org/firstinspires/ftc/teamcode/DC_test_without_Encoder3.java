package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp         //사용자가 직접 조종하는 코드다!

public class DC_test_without_Encoder3 extends LinearOpMode {            //test 라는 이름의 로봇 제어 코드를 LinearOpMode 방식으로 작성하겠다!

    @Override

    public void runOpMode() throws InterruptedException {

        DcMotor mymotor = hardwareMap.dcMotor.get("motorTest");     //motorTest 라고 configure 한 서보를 mymotor 라고 코딩할 때 쓰겠다!
        mymotor.setDirection(DcMotorSimple.Direction.FORWARD);      //mymotor의 회전방향을 정방향으로 설정 (축을 정면에서 볼 때 시계방향으로 회전)
        mymotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);       //mymotor를 엔코더 없이 작동하게 설정
        mymotor.setPower(0);                                        //mymotor의 파워를 0으로 설정

        int direction = 0;

        waitForStart();                             //시작버튼(▶) 눌리기 기다리기



        while (opModeIsActive()) {                  //시작버튼(▶) 을 눌렀을 때 반복하기

            if (isStopRequested()) return;          //만약 사용자가 중단했다면? -> 코드 멈추기

            mymotor.setPower(gamepad1.right_stick_x);   //모터의 파워를 오른쪽 스틱의 x값으로 설정

            if (gamepad1.dpad_left) {                                       //만약 d패드 왼쪽을 눌렀다면
                mymotor.setDirection(DcMotorSimple.Direction.REVERSE);      //서보 모터의 회전방향을 역방향으로
            }

            if (gamepad1.dpad_right) {                                      //만약 d패드 오른쪽을 눌렀다면
                mymotor.setDirection(DcMotorSimple.Direction.FORWARD);      //서보 모터의 회번 장향을 정방향으로
            }

            telemetry.addData("현재 조이스틱 x값: ", gamepad1.right_stick_x);
            telemetry.addData("현재 조이스틱 y값: ", gamepad1.right_stick_y);
            telemetry.addData("모터1 회전방향: ", mymotor.getDirection());
            telemetry.update();

        }

    }

}

