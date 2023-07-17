# Fare_Calculator
This is a fare calculator program developed on java to  calculate a fare for transportation pass. 
A new city “Ballymanus” has been announced in a state in Australia and the state government has planned to
extend the public transport where the fares will be calculated according to the existing fare rule of the state.
As per the existing fare system, everyone must have to buy the “Move Card” in order to travel on trains, tram,
and buses in different parts of the state, including the new city.
There are 2 options in “Move Card”
 “Move Money”: When you travel occasionally, you can use a “Move Money”. You need to load an
amount onto your “Move Card” and it will automatically calculate the lowest fare possible as you touch
on and touch off. The fare for the Move Money is given in the following table:
Page 2 of 5

Table 1 Move Money Daily Fare
Fare Type Weekdays (Daily) Weekends (Daily)
Full fare $8.80             $6.40
Concession $4.40            $3.20

 “Move Pass”: If you travel often, you can use a “Move Pass” and you’ll need to select the number of
consecutive days you travel when you buy it. You can buy a Move Pass for 7 days or anywhere
between 28 and 365 days. The fare for the Move Pass is given in the following table:

Table 2 Move Pass Fare
Fare Type Weekly rate (7 days pass)       Daily rate for 28-365 days
Full fare $44.00                           $5.30
Concession $22.00                          $2.65

Travelers might need a calculator to work out how much their journey will cost and to find the most cost-
effective way for them to travel using “Move Card”. You have been assigned to design and develop a small

console CALCULATOR program to help the travelers, enabling them to find the appropriate option (“Move
Pass”/”Move Money”) and to calculate the traveling cost. Once a calculation is processed, the program will
return to the initial condition and will be ready to commence another calculation. The CALCULATOR program
should be able to input the following options:

 Fare type: 1 OR 2 (1= Full fare, 2= Concession)
 Number of days to travel on weekdays: a number between 0 and 5
 Number of days to travel on weekends: a number between 0 and 2
 Number of weeks you are planning to travel: a number between 1 and 52
The CALCULATOR will display the following output based on the input provided by the user:

 The amount in “Move Money”
 The amount in “Move Pass”
 And a Recommendation on which option should be cost effective for the user

CRICOS Provider No. 00103D Page 3 of 5
The system should be flexible so that the state government can include new fare types (e.g., student pass)
and the concept of varying fares for different zones (e.g., Zone 1, Zone 2, a combination of multiple zones)
at a later date without having to rewrite the entire program. This means you will need to use an interface for
processing total fares, and polymorphism for the various fare type classes, so that new and different fare
types may be added at a later date with minimal updates to the code.
