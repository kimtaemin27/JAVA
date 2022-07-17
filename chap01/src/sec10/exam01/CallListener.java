package sec10.exam01;

import sec10.exam01.Button.OnClickListener;

public class CallListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("call");
	}

}
