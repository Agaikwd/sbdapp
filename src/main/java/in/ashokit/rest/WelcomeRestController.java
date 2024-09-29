package in.ashokit.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	private Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);

	public WelcomeRestController() {
		logger.info("***** WelcomeRestController :: Constructor *****");
	}

	@GetMapping
	public String welcomeMsg() {
		logger.info("***** welcomeMsg() execution start *****");
		String msg = "Beauty in Falling Leaves";
		logger.info("***** welcomeMsg() execution end *****");
		String s = "hello";
		logger.info("******************************************************************");
		return msg;
	}
	
	@GetMapping("/greet")
	public String greetMsg() {
		logger.info("***** greetMsg() execution start *****");
		String msg = "As leaves fleeting fall from above
Under skies ever here
Darkness comes to the door
Table place set before its honored seat
The chase has come and gone
Yearning to be let go
Colors in the mirror
Better still, to inform
Skies ever here

Been this way throughout time
Been this way throughout my life
Your heart brings me home
Been this way throughout time
From the tumult of the heave
Not born of belief
Your heart brings me home
Brings me home

As seasons come here to rest
Lilting rays aglow
Obsidian flow
Fire hewn within the stone
Life that has come before
Looming fears of the wilt
Shadows at the door
Colors in the mirror
See upcoming rock shows
Get tickets for your favorite artists

You might also like
Original Face
YOB
Lungs Reach
YOB
Marrow
YOB

Been this way throughout time
Been this way throughout my life
Your heart brings me home
Been this way throughout my life
From the tumult of the heave
Not born of belief
Our nature redeemed
Unburden our grief
Your heart brings me home

Lifting off, renewed
Astral form in flight
Enthrall every hue
Unknown to our eyes
Every cell of being
Outside of mind
Mantra not apart
From ineffable heart

Endless worlds in endless mind
Caught in dreams of our own design
Dressed and groomed tradition dead
All around you the infinite
Seeing
Beauty in falling leaves";
		System.out.println("testing git collaboration");
		logger.info("***** greetMsg() execution end *****");
		int i = 10;
		logger.info("***** greetMsg() execution successfull *****");
		boolean status = false;
		logger.info("***** ***************************** *****");
		return msg;
	}
	
	
}
