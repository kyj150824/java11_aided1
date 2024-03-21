package Exam;

public class Man {

		private String name;
		private int age;
		private short gender;
		private boolean isMarried;
		private short childAmount;
		
		public Man(String name, int age, short gender, boolean isMarried, short childAmount) {
			super();
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.isMarried = isMarried;
			this.childAmount = childAmount;
		}
		public Man() {
			
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public short getGender() {
			return gender;
		}
		public void setGender(short gender) {
			this.gender = gender;
		}
		public boolean isMarried() {
			return isMarried;
		}
		public void setMarried(boolean isMarried) {
			this.isMarried = isMarried;
		}
		public short getChildAmount() {
			return childAmount;
		}
		public void setChildAmount(short childAmount) {
			this.childAmount = childAmount;
		}
		
		public String toString(String name, int age, int gender, boolean isMarried, int childAmout) {
			return "Man [name=" + name + "\n age=" + age + "\n gender=" + gender + "\n isMarried=" + isMarried
					+ "\n childAmount=" + childAmout + "]";
		}
		
		


}
