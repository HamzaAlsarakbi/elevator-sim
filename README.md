# Elevator Control System

## Description

This project implements a simulated elevator control system designed for efficiency and scalability. The system consists of three main components: a Scheduler, an ElevatorNode, and a FloorSubsystem. These components work together to manage and respond to elevator requests from various floors, simulating the operation of a real-world elevator system in a multi-story building.

## Team

- Hamza Alsarakbi - project & team lead
- Mahad Mohamed Yonis - software developer
- Nabeel Azard - software developer
- Zarif Khan - software developer
- Arun Karki - software developer

## Setup Instructions

1. Clone or download the project to your local machine.
2. Open a terminal or command prompt and navigate to the project's root directory.
3. Compile the Java files with the command: `javac *.java`.
4. Run the SchedulerLauncher, ElevatorSubsystemLauncher, and FloorSubsystemLauncher in any order.
5. Click start on the Elevator window.
6. Click start on the Floor window.
7. (Optional) Run the "tests" package.

## Test Instructions

1. Unit tests are provided for each subsystem. They can be run to ensure each part of the system functions as expected.
2. Compile and run the test files separately, for example: `javac g5.elevator.FloorSubsystemTest.java && java g5.elevator.FloorSubsystemTest`.
3. To test the system as a whole, modify the input data in the `FloorSubsystem` to simulate different scenarios and observe how the system handles various elevator requests.

## Credits

### Ieration 1

__Mahad Mohamed Yonis__: Co-author of README file. Author of all methods in `FloorSubsystemTest`, `SchedulerSubsystemTest`, `ElevatorNodeTest` classes. Author of methods `doorOpen()`, `doorClose()`, `peopleLoad()`, `peopleUnload()` methods in the `ElevatorNode` class.

__Nabeel Azard__: Co-author of README file. Author of UML class diagram for the program. Co-author of all methods in the FloorSubsystem, `Schedulersystem` classes. Co-author of `traverseOneFloor()`, `setDirection()`, `traverseToElevatorCall()`, `differenceBetweenDestinationAndCurrentFloor()`,  and `run()` methods in the `ElevatorNode` class.

__Zarif Khan__: Co-author of README file. Author of Sequence diagram for the program, Co-author of all methods in the `FloorSubsystem`, `Schedulersystem` classes. Co-author of `traverseOneFloor()`, `setDirection()`, `traverseToElevatorCall()`, `setElevatorCallFloor()`, `differenceBetweenDestinationAndCurrentFloor()`, and `run()` methods in the `ElevatorNode` class.

__Hamza Alsarakbi__: Co-author of README file. Co-author of all methods in the `FloorSubsystem`, `Schedulersystem` classes. Co-author of `traverseOneFloor()`, `setDirection()`, `setElevatorCallFloor()`,  `run()` methods in the `ElevatorNode` class.

__Arun Karki__: Co-author of README file. Co-author of all methods in the `FloorSubsystem`, `Schedulersystem` classes. Co-author of `traverseOneFloor()`, `setDirection()`, `setElevatorCallFloor()`,  `run()` methods in the ElevatorNode class.

### Iteration 2

__Hamza Alsarakbi__: State diagrams, Elevator States, Class diagram

__Mahad Mohamed Yonis__: `ElevatorNode` tests, Documentation, State diagram assistance

__Nabeel Azard__: Elevator state tests, Documentation, State diagram assitance

__Arun Karki__: Minor bug fixes, State diagram assistance

__Zarif Khan__: Scheduler States, Scheduler State test, Updated Class/State diagrams

### Iteration 3

__Hamza Alsarakbi__:
Worked on Scheduler Communication: Floor Registration, Elevator Events, Floor Pickup Request.
Worked on ElevatorNode communication: Initialize sockets on unspecified ports, Events List, Pickup Requests, implemented getPickupIndex() in ElevatorNode. Designed and implemented a UI for the system.
Documentation: Scheduler Sequence Diagram, Elevator State Diagram, Elevator Comm State Diagram

__Mahad Mohamed Yonis__:
Worked on `ElevatorNode` communication: Implemented `run()` method in `ElevatorProcessingAddPickupCommState`.
Documentation: Elevator Sequence Diagram
Implemented Unit Tests

__Nabeel Azard__:
Worked on Scheduler Communication: Initialize sockets, Elevator Registration.
Worked on `ElevatorNode` communication: implemetnted `run()` method in `ElevatorIdleCommState`, `register()` method in `ElevatorNode`, and `sendEvent()` method in `ElevatorNode`.
Documentation: README file, Scheduler State Diagram

__Arun Karki__:
Implemented FloorNode communication: Initialize sockets on unspecified ports, Floor Registration, Floor Pickup Request, Elevator Events.
Documentation: Class Diagram

__Zarif Khan__:
Implemented FloorNode communication: Initialize sockets on unspecified ports, Floor Registration, Floor Pickup Request, Elevator Events.
Documentation: Floor Sequence Diagram

## MIT License

Copyright (c) 2023 [Nabeel Azard, Mahad Mohamed Yonis, Hamza Alsarakbi, Zarif Khan, Arun Karki]

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
