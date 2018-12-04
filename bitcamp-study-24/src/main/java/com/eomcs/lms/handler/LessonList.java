package com.eomcs.lms.handler;


import java.util.Arrays;
import com.eomcs.lms.domain.Lesson;

public class LessonList {

	final int DEFALT_CAPACITY = 10; //기본값 = 10
	Lesson[] lessons; //lesson 정보가 저장되는 배열 
	int size = 0; //생성한 lesson정보를 저장할 위치를 가리킨다

	public LessonList() {
		lessons = new Lesson[DEFALT_CAPACITY]; //lesson정보가 저장되는 배열 (lessons)
		                                              //배열 길이의 기본값이 10으로 설정
	
	}

	public LessonList(int initialcapacity) { //초기값을 생성한
		if (initialcapacity > DEFALT_CAPACITY)//생성한 값이 기본값보다 크
			lessons = new Lesson[initialcapacity];//생성한 값으로 lessons배열의 길이를 지정
		else lessons = new Lesson[DEFALT_CAPACITY];//그렇지 않으면 기존값을 배열의 길이로
	}

	public Lesson[] toArray() {
		return Arrays.copyOf(lessons, size);//저장된 lesson내역을 배열의 size까지 return
		
	}

	public void add(Lesson lesson) {
		if (size >= lessons.length) { //등록된 수업 개수가 size보다 작으면
			int oldCapacity = lessons.length;//기존에 등록된 lesson개수를 old
			int newCapacity = oldCapacity + (oldCapacity >> 1);

			lessons = Arrays.copyOf(lessons, newCapacity);
		}

		lessons[size++] = lesson; // 새로운 lesson정보를 lessons배열의 (size)번째에 넣고
		                                 //size를 1증가시킨다
	}
}