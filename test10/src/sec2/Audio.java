package sec2;

public class Audio implements RemoteControl {
	
	int volume;

	@Override
	public void turnOff() {
		System.out.println("전원 Off");
		
	}

	@Override
	public void turnOn() {
		System.out.println("전원 On");
		
	}
	
	@Override
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
	
	

}
