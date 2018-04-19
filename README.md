# CountDownTimer

This is just a simple example of a countdown timer using Singleton Design Pattern.

Same timer will run across multiple activities (In this example there are two activities).

onResume() method is not necessary.Code inside onResume canbe used in onCreate.

NOTE: The code inside onResume should be executed in any starting state of an activity lifecycle, 
else timer will not be synchronized across two activities
