package sec2;

public class RemoteExam4 {
	public static void main(String[] args) {
		
		Audio au = new Audio(){
			
			int volume;
			
			public void turnOff() {
				System.out.println("전원 Off");
				
			}

			public void turnOn() {
				System.out.println("전원 On");
				
			}
		
			public void setVolume(int volume) {
				System.out.println("현재 볼륨 :" + volume);
				if(volume > MAX) {
					this.volume = RemoteControl.MAX;
				} else if(volume < MIN) {
					this.volume = RemoteControl.MIN;
				} else {
					this.volume = volume;
				}
			}
		};
		
		RemoteControl.changeBattery();
		au.turnOn();
		au.setVolume(20);
		au.setMute(true);
		au.setMute(false);
		au.turnOff();
	}	
}

