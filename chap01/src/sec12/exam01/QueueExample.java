package sec12.exam01;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendMail", "땡땡땡"));
		messageQueue.offer(new Message("sendMail", "가나다"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail" :
				System.out.println(message.to + " : to send mail");
				break;
			case "sendSMS":
				System.out.println(message.to + " : to send SMS");
				break;
			case "sendKaKaotalk" :
				System.out.println(message.to + " : to send kakaotalk");
				break;
			}
		}

	}

}
