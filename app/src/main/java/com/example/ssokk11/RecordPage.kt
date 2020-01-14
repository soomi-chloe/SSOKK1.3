package com.example.ssokk11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RecordPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_record_page)
    }



    /*

    1) 혈당
    1. 식전, 식후 버튼 선택
    2. 수치 입력란 누르면 숫자 키패드 뜨도록(단위는 고정임)
    3. 입력 버튼 누르면 그래프에 혈당 찍히도록 & 수치 입력란 초기화
    4. 그래프: 식전 or 식후로 나눠서 찍히는 dot 다르게 되도록 & 수치입력란에 입력받은 dot 위에 수치 찍히도록

    2) 약
    1. AM, PM 선택
    2. 시간 입력 - 핸드폰 알람처럼 숫자 선택하도록(휠)
    3. 입력 버튼 누르면 위에 올라가도록
    4. 위에는 먹은 시간을 받아와 dot 찍히도록

    3) 체중
    1. 수치 입력란 누르면 숫자 키패드 뜨도록
    2. 입력 버튼 누르면 체중값이 마이페이지의 체중 통계에 들어가도록
    3. 수치 입력란을 다시 누르면 수정되도록

    4) 식사
    1. 플러스 버튼 누르면 카메라 or 앨범 중 고를 수 있도록
    2. (카메라인 경우) 카메라 연결, 사진 찍은 후 선택하기 누르도록
    3. (앨범인 경우) 선택
    4. 짧은 메모 밑에 쓸 수 있도록
    5. 선택한 사진이 네모박스 안에 추가되도록

     */

}
