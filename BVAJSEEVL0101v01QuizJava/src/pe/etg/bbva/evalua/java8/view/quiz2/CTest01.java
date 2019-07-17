package pe.etg.bbva.evalua.java8.view.quiz2;

import java.util.Arrays;
import java.util.Comparator;

class Robot{
Integer currentX;
Integer currentY;
Integer previousX;
Integer previousY;

int tm = 0; // 1-> moveX, 2 -> moveY

// 1 5 1 1
// 2 1 1 1

// 0 5
// 1 5
// x 1
// 2 5
// 2 5 **
// x 2
// 4 6
// 4 6 **

// 0 5
// 2 1
// x 1
// 3 1
// 3 1 **
// x 2
// 5 2
// 5 2 **



Robot(){

this.currentX = 0;
this.currentY = 5;
tm =0;
}

Robot(Integer x, Integer y){

currentX = x;
currentY = y;
previousX = 0;
previousY = 5;
tm = 0;
}

void moveX (Integer dx){
tm = 1;
previousX = currentX;
currentX = currentX + dx;
previousY = currentY;

}
void moveY (Integer dy){
tm = 2;
previousY = currentY;
currentY = currentY + dy;
previousX = currentX;

}
void printCurrentCoordinates(){
System.out.println( currentX + " " + currentY);
}

void printLastCoordinates(){
System.out.println(previousX + " " + previousY);
}

void printLastMove(){
if (tm == 1){
System.out.println("x " + (currentX - previousX));
}else if (tm == 2){
System.out.println("y " + (currentY - previousY));
}

}
}

public class CTest01 {

    public final static void main(String[] args) {
        double d = 10.0 / -0;
        if (d == Double.POSITIVE_INFINITY){
            System.out.println("Positive infinity");
        }else{
            System.out.println("Negative infinity");
        }
    }

    public synchronized void bloque(){

    }
    
    static class a {
        
    }
}
