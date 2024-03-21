package sec2;

public class StrudentExample {

	public static void main(String[] args) {
		Student s1 = new Student("김기태", 1 , 100000);
		Student s2 = new Student("이원석", 2 , 200000);
		Student s3 = new Student("조우진", 3 , 300000);
		
		Bus bus1 = new Bus(101);
		s1.takeBus(bus1);
		s1.print();
		bus1.show();
		
		// 이원석 학생이 버스(101) 두번 이용하고, 지하철을 2호선을 세 번 이용하였을 경우
		// 이원석 학생의 정보와 버스 101호 정보와 지하철 2호선의 정보를 출력
		/*
		Bus bus2 = new Bus(101);
		s2.takeBus(bus2);
		s2.takeBus(bus2);
		s2.print();
		bus2.show();
		*/
		Subway subway2 = new Subway(2);
		s1.takeBus(bus1);
		s1.takeBus(bus1);
		s2.takeSubway(subway2);
		s2.takeSubway(subway2);
		s2.takeSubway(subway2);
		s2.print();
		subway2.show();
		bus1.show();
		
	}

}
