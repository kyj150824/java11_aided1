package sec2;

public class RemoteExam1 {

	public static void main(String[] args) {
		RemoteControl r1;
		
		//REmoteControl()로 객체를 생성하려면, 구현 내용을 기술해야함.
		
		r1 = new RemoteControl(){
			int volume;
			
			public void turnOff() {
				System.out.println("전원 Off");
				
			};

			public void turnOn() {
				System.out.println("전원 On");
				
			};
		
			public void setVolume(int volume) {
				System.out.println("현재 볼륨 :" + volume);
				if(volume > MAX) {
					this.volume = RemoteControl.MAX;
				} else if(volume < MIN) {
					this.volume = RemoteControl.MIN;
				} else {
					this.volume = volume;
				};	
			}
		};
		
		RemoteControl.changeBattery();
		r1.turnOn();
		r1.setVolume(4);
		r1.setMute(false);
		r1.setMute(true);
		r1.turnOff();
		
	}
}
