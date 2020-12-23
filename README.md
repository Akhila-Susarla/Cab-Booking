# Cab-Booking
  For an effortless cab booking experience.

## Project Title:
  Cab Booking System

## Aim:
  It aims to give the users an effortless cab booking experience.
  
## Technologies Used:
  Java
  
## Assumptions Taken:
  * The nearest cab is 10 min (or less) away.
  * The distance beween the user's location and their destination.
  * Duration of the cab ride is estimated accordingly.
  * To avoid any sort of inaccuracies of fare mechanisms, taxi-meter system is used.
  
## Sample Senario:
  A user can open the application and enter their pickup point along with their destination, this is  followed by the program selecting a random number that is going to be considered as the distance between the pickup location and the drop location. Next the user will be asked to select a car of their choice after which, the overall estimated price will be calculated based on the car selected and the number of kilometers to be travelled. Once the user picks the payment method (that can be paid after the ride), they are given with the details of the driver, waiting time for the cab to arrive and pick them up and the price of the service provided (since this application isn't linked to GPS yet, we are generating a random number from the range 10-50 as the distance between the pick up and drop points for price calculation purpose).
