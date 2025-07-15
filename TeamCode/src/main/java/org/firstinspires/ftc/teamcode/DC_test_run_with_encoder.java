package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp         //사용자가 직접 조종하는 코드다!

public class DC_test_run_with_encoder extends LinearOpMode {            //DC_test_run_with_encode 라는 이름의 로봇 제어 코드를 LinearOpMode 방식으로 작성하겠다!

    @Override

    public void runOpMode() throws InterruptedException {

        DcMotor mymotor = hardwareMap.dcMotor.get("motorTest");     //motorTest 라고 configure 한 서보를 mymotor 라고 코딩할 때 쓰겠다!
        mymotor.setDirection(DcMotorSimple.Direction.FORWARD);      //mymotor의 회전방향을 정방향으로 설정 (축을 정면에서 볼 때 시계방향으로 회전)
        mymotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);    //mymotor를 멈추고 엔코더를 0으로 설정
        mymotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);         //mymotor를 엔코더를 이용하려 작동하게 설정
        mymotor.setPower(0);                                        //mymotor의 파워를 0으로 설정

        waitForStart();                                             //시작버튼(▶) 눌리기 기다리기



        while (opModeIsActive()) {                                  //시작버튼(▶) 을 눌렀을 때 반복하기

            if (isStopRequested()) return;                          //만약 사용자가 중단했다면? -> 코드 멈추기


            if (gamepad1.a) {                                       //만약 게임패드 a를 눌렀다면
                mymotor.setTargetPosition(1000);                    //mymotor 의 목표 엔코더 값을 1000으로 설정한다.
                mymotor.setPower(1);                                //mymotor 의 파워를 1로 설정한다.
                mymotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);   //mymotor 가 설정된 엔코더 포지션까지 작동한다.
            }

            if (gamepad1.a) {                                       //만약 게임패드 a를 눌렀다면
                mymotor.setTargetPosition(2000);                    //mymotor 의 목표 엔코더 값을 2000으로 설정한다.
                mymotor.setPower(1);                                //mymotor 의 파워를 1로 설정한다.
                mymotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);   //mymotor 가 설정된 엔코더 포지션까지 작동한다.
            }

            if (gamepad1.a) {                                       //만약 게임패드 a를 눌렀다면
                mymotor.setTargetPosition(-1000);                   //mymotor 의 목표 엔코더 값을 -1000으로 설정한다.
                mymotor.setPower(1);                                //mymotor 의 파워를 1로 설정한다.
                mymotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);   //mymotor 가 설정된 엔코더 포지션까지 작동한다.
            }

            if (gamepad1.a) {                                       //만약 게임패드 a를 눌렀다면
                mymotor.setTargetPosition(-2000);                   //mymotor 의 목표 엔코더 값을 -2000으로 설정한다.
                mymotor.setPower(1);                                //mymotor 의 파워를 1로 설정한다.
                mymotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);   //mymotor 가 설정된 엔코더 포지션까지 작동한다.
            }

            if (gamepad1.dpad_up) {                                         //만약 d패드 위를 눌렀다면
                mymotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);    //mymotor를 멈추고 엔코더값을 0으로 설정한다.
            }

            telemetry.addData("현재 엔코더값: ", mymotor.getCurrentPosition());
            telemetry.addData("현재 목표 엔코더값: ", mymotor.getTargetPosition());

        }

    }

}

