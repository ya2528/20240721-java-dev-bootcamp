import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

void main() throws IOException {
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(inputStreamReader);
    System.out.print("Please provide any input 1: ");
    String input1 = br.readLine();
    System.out.println("User Input 1: " + input1);
}