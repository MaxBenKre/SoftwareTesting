package de.uni_passau.fim.se2.junit5_intro;

class MiniMath {
  int min(int left, int right) {
    if (left < right) {
      return left;
    } else {
      return right;
    }
  }

  int max(int left, int right) {
    if (left < right) {
      return right;
    } else {
      return left;
    }
  }

  int abs(int value) {
    if (value < 0) {
      return -value;
    } else {
      return value;
    }
  }

  int floorDivision(int a, int b) {
    if (b == 0) {
      throw new IllegalArgumentException();
    }
    return a / b;
  }
}
