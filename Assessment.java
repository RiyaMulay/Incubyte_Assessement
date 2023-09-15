import java.util.*;

public class Assessment {
    static void Position(int pos[], char currfaceDir) {
        for (int x : pos) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    char nextMove(char currentCommand, int[] position, char faceDir) {
        if (faceDir == 'N' && currentCommand == 'f') {
            position[1] = position[1] + 1;
            return 'N';
        } else if (faceDir == 'N' && currentCommand == 'b') {
            position[1] = position[1] - 1;
            return 'N';
        } else if (faceDir == 'S' && currentCommand == 'f') {
            position[1] = position[1] - 1;
            return 'S';
        } else if (faceDir == 'S' && currentCommand == 'b') {
            position[1] = position[1] + 1;
            return 'S';
        } else if (faceDir == 'E' && currentCommand == 'f') {
            position[0] = position[0] + 1;
            return 'E';
        } else if (faceDir == 'E' && currentCommand == 'b') {
            position[0] = position[0] - 1;
            return 'E';
        } else if (faceDir == 'W' && currentCommand == 'f') {
            position[0] = position[0] - 1;
            return 'W';
        } else if (faceDir == 'W' && currentCommand == 'b') {
            position[0] = position[0] + 1;
            return 'W';
        } else if (faceDir == 'u' && currentCommand == 'f') {
            position[2] = position[2] + 1;
            return 'u';
        } else if (faceDir == 'u' && currentCommand == 'b') {
            position[2] = position[2] - 1;
            return 'u';
        } else if (faceDir == 'd' && currentCommand == 'f') {
            position[2] = position[2] - 1;
            return 'd';
        } else if (faceDir == 'd' && currentCommand == 'b') {
            position[2] = position[2] + 1;
            return 'd';
        } else if (faceDir == 'N') {
            switch (currentCommand) {
                case 'l':
                    return 'W';
                case 'r':
                    return 'E';
                case 'u':
                    return 'u';
                case 'd':
                    return 'd';
            }
        } else if (faceDir == 'S') {
            switch (currentCommand) {
                case 'l':
                    return 'E';
                case 'r':
                    return 'W';
                case 'u':
                    return 'u';
                case 'd':
                    return 'd';
            }
        } else if (faceDir == 'E') {
            switch (currentCommand) {
                case 'l':
                    return 'N';
                case 'r':
                    return 'S';
                case 'u':
                    return 'u';
                case 'd':
                    return 'd';
            }
        } else if (faceDir == 'W') {
            switch (currentCommand) {
                case 'l':
                    return 'S';
                case 'r':
                    return 'N';
                case 'u':
                    return 'u';
                case 'd':
                    return 'd';
            }
        } else if (faceDir == 'u') {
            switch (currentCommand) {
                case 'l':
                    return 'N';
                case 'r':
                    return 'S';
                case 'u':
                    return 'E';
                case 'd':
                    return 'W';
            }
        } else if (faceDir == 'd') {
            switch (currentCommand) {
                case 'l':
                    return 'S';
                case 'r':
                    return 'N';
                case 'u':
                    return 'E';
                case 'd':
                    return 'W';
            }
        }
        return '#';
    }

    public static void main(String[] args) {
        Assessment obj1 = new Assessment();
        Scanner s = new Scanner(System.in);

        int position[] = new int[3];
        System.out.println("Enter initial position of Craft");
        for(int i = 0; i < 2; i++){
            position[i] = s.nextInt();
        }
        s.close();

        s = new Scanner(System.in);
        System.out.println("Enter the command line (use f, b, l, r, u, d)");
        String commandLines = s.nextLine();
        char[] commands = commandLines.toCharArray();
        s.close();
        
        s = new Scanner(System.in);
        System.out.println("Enter current direction craft (use N, S, E, W, u, d)");
        char currfaceDir = s.next().charAt(0);
        s.close();
        
        System.out.println("****The Final coordinates along with direction***\n");
        for (int i = 0; i < commands.length; i++) {
            currfaceDir = obj1.nextMove(commands[i], position,

    currfaceDir);

        }
        Position(position, currfaceDir);
        System.out.println("Current Direction of Craft: " + currfaceDir);
    }
    
        
    
    
    
    
}


    

    

    

    

    