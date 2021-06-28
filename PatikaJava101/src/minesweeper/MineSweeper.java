package minesweeper;

import java.util.Scanner;

public class MineSweeper {
	
	Scanner input = new Scanner(System.in);
	public void start() {
		
		System.out.print("Satýr sayýsý: ");
        int line = input.nextInt();
        System.out.print("Sütun sayýsý: ");
        int column = input.nextInt();
        int mine = (line * column) /4;
        String[][] matrix = new String[line][column];
        
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line; j++) {
                matrix[i][j] = "-";
            }
        }
        
        for (int i = 0; i < mine; i++) {
            int randLine = (int) (Math.random() * line);
            int randColumn = (int) (Math.random() * column);
            switch (matrix[randLine][randColumn]) {
                case "*":
                    i -= 1;
                case "-":
                    matrix[randLine][randColumn] = "*";
            }
        }
        
        System.out.println("Mayýnlarýn Konumu");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===============");
        play(matrix, line, column);
	}
	
	public void play (String[][] matrix, int line, int column ) {
		System.out.println("Mayýn Tarlasý Oyununa Hoþ Geldiniz ! ");
		String[][] playMatrix = new String[line][column];
		for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                playMatrix[i][j] = "-";
            }
        }
		boolean status = true;
        int count = 0;
        int lineInput, columnInput, info = 0;
        do {
            for (int i = 0; i < line; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print(playMatrix[i][j] + " ");
                }
                System.out.println();
            }
            do {
                System.out.print("Satýr giriniz: ");
                lineInput = input.nextInt();
                System.out.print("Sütun giriniz: ");
                columnInput = input.nextInt();
                if (lineInput >= line || columnInput >= column) {
                    System.out.println("Satýr veya sütun sayýsýndan büyük sayý seçilemez!");
                }
            } while (lineInput >= line || columnInput >= column);

            if (matrix[lineInput][columnInput].equals("*")) {
                System.out.println("Game Over!!");
                status = false;
            } else {
                info = 0;
                if (lineInput - 1 >= 0) {
                    if (matrix[lineInput - 1][columnInput].equals("*")) {
                        info++;
                    }
                }
                if (lineInput - 1 >= 0 && columnInput - 1 >= 0) {
                    if (matrix[lineInput - 1][columnInput - 1].equals("*")) {
                        info++;
                    }
                }
                if (columnInput - 1 >= 0) {
                    if (matrix[lineInput][columnInput - 1].equals("*")) {
                        info++;
                    }
                }
                if (columnInput + 1 < column) {
                    if (matrix[lineInput][columnInput + 1].equals("*")) {
                        info++;
                    }
                }
                if (columnInput + 1 < column && lineInput + 1 < line) {
                    if (matrix[lineInput + 1][columnInput + 1].equals("*")) {
                        info++;
                    }
                }
                if (lineInput + 1 < line) {
                    if (matrix[lineInput + 1][columnInput].equals("*")) {
                        info++;
                    }
                }
                if (lineInput - 1 >= 0 && columnInput + 1 < column) {
                    if (matrix[lineInput - 1][columnInput + 1].equals("*")) {
                        info++;
                    }
                }
                if (lineInput + 1 < line && columnInput - 1 >= 0) {
                    if (matrix[lineInput + 1][columnInput - 1].equals("*")) {
                        info++;
                    }
                }
                playMatrix[lineInput][columnInput] = String.valueOf(info);
                count++;
                
                System.out.println("Great !");
                
            }
            System.out.println("==================");
        } while (status && count < (line * column) - ((line * column) / 4));
        

        if (status) {
            System.out.println("Oyunu Kazandýnýz! ");
            for (int i = 0; i < line; i++) {
                for (int j = 0; j < column; j++) {
                    if (playMatrix[i][j].equals("-")) {
                        System.out.print("* ");
                    } else {
                        System.out.print(playMatrix[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
		
	}	
	
}
