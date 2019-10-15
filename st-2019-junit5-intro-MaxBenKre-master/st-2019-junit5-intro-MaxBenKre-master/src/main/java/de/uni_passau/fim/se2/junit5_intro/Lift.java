package de.uni_passau.fim.se2.junit5_intro;

class Lift {
  private int topFloor;
  private int currentFloor = 0; // default
  private int capacity = 10;    // default
  private int numRiders = 0;    // default

  Lift(int highestFloor) {
    topFloor = highestFloor;
  }

  Lift(int highestFloor, int maxRiders) {
    this(highestFloor);
    capacity = maxRiders;
  }

  int getTopFloor() {
    return topFloor;
  }

  int getCurrentFloor() {
    return currentFloor;
  }

  int getCapacity() {
    return capacity;
  }

  int getNumRiders() {
    return numRiders;
  }

  boolean isFull() {
    return numRiders == capacity;
  }

  void addRiders(int numEntering) {
    if (numRiders + numEntering <= capacity) {
      numRiders = numRiders + numEntering;
    } else {
      numRiders = capacity;
    }
  }

  void goUp() {
    if (currentFloor < topFloor)
      currentFloor++;
  }

  void goDown() {
    if (currentFloor > 0)
      currentFloor--;
  }

  void call(int floor) {
    if (floor >= 0 && floor <= topFloor) {
      while (floor != currentFloor) {
        if (floor > currentFloor)
          goUp();
        else
          goDown();
      }
    }
  }

}
