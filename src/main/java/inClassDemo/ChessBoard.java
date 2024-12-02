package inClassDemo;

import java.util.Arrays;

public class ChessBoard {
    public static void main(String[] args) {
//        Board board1 = new Board();
//        System.out.println(board1.getLength());
//        System.out.println(board1.getWidth());
//        System.out.println(board1.getColor());
//        Board board2 = new Board(45.6, 67.7, "Black");
//        System.out.println(board2.getLength());
//        System.out.println(board2.getWidth());
//
//        System.out.println(board2.getColor());
//        System.out.printf("Area of Board 2 : %.2f", board2.getArea());

//         Create three objects and store it in an array
        Board board1 = new Board();
        Board board2 = new Board(45.6, 67.7, "Black");
        Board board3 = new Board(30.5, 45.6);
        Board[] boards = {board1, board2, board3};

        System.out.println(sumBoard(boards));
        System.out.println(avgBoardArea(boards));

    }
    public static double sumBoard(Board[] board) {
        double sum = 0.0;
        for(Board item: board){
            sum += item.getArea();
//            System.out.println(item.getArea());
//            System.out.println(item);
        }
        return sum;
    }
    public static double avgBoardArea(Board[] board){
        double avg = 0.0;
        double sum = 0.0;
        for(Board item:  board){
            sum += item.getArea();
//            System.out.println(item.getArea());
//            System.out.println(item);
        }
        return sum/board.length;

    }
}
