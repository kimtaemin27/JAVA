package sec10.exam02;

public class Window {
	
	Button button1 = new Button();
	Button button2 = new Button();
	
	// 필드 초기값으로 대입
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("call");
		}
	};
	
	Window(){
		button1.setOnclickListener(listener);
		button2.setOnclickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("message");
			}
		});
	}

}
