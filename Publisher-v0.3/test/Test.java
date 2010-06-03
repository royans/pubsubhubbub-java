package flagthis.test;

import java.io.IOException;
import flagthis.pubsubhubbub.Discovery;
import flagthis.pubsubhubbub.Publisher;
import flagthis.pubsubhubbub.Subscriber;
import flagthis.pubsubhubbub.Web;

public class Test {

	public static void testPublisher() throws Exception {
		Publisher publisher = new Publisher();
		String hub = "http://pubsubhubbub.appspot.com/publish";
		int status = publisher
				.execute(hub,
						"http://www.royans.net/rant/feed/");
		System.out.println("Return status : " + status);
		status = publisher
				.execute(hub,
						"http://www.royans.net/rant/feed/");

		status = publisher
				.execute(hub,
						"http://www.royans.net/rant/feed/");

		System.out.println("Return status : " + status);
	}

	public static void main(String[] args) {
		try {
			testPublisher();
			Discovery discovery=new Discovery();
			System.out.println(discovery.getHub("http://www.royans.net/rant/feed/"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
