package sec10.exam02;

public class Button {
	
	OnClickListener listener;
	
	void setOnclickListener(OnClickListener listener ) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	static interface OnClickListener{
		void onClick();
	}

}
