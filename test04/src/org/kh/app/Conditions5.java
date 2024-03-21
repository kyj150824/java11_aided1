package org.kh.app;

public class Conditions5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* if ~ else if ~ else */
		/*
		  if (조건식1){
		    	실행문1;
		  } else if(조건식2){
		  		실행문2;
		  } else if(조건식3){
		  		실행문3;
		  } else ( 
		  		실행문n;
		  }	
		  
		  if(조건식1) 실행문1;
		  else if(조건식2) 실행문2;
		  else if(조건식3) 실행문3;
		  else 실행문n;
		 */
		
		/*
		  switch(변수명){
		   case 값1:
		   		실행문1;
		   		break;
		   
		   case 값2:		
				실행문2;
				break;
		  
		   case 값3:
		   		실행문3;
		   		break;
		   
		   case 값4:		
				실행문4;
				break;
		 
		 	default:
		 	 	실행문n;	
		}
		 */
		int rank =1;
		String sisang = "";
		switch(rank) {
		case 1:
			sisang = "최우수상";
			break;
		case 2:
			sisang = "노력상";
			break;
		case 3:
			sisang = "아차상";
			break;
		default:
			sisang= "";
	 }
	String remark = "";
	switch(rank){
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				remark = "우등생";
				break;
	 default:
		remark = "일반";
	}
	}

}
