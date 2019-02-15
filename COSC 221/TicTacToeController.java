//Name: Asia Minor
//Date: 2-14-19
//Purpose: the controller class for the tic tac toe gui

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import java.util.Random;

public class TicTacToeController {   //private field declarations of components
   @FXML
   private Label outputLabel;
   @FXML
   private Button newGameButton;
   @FXML
   private ImageView imageBox1;
   @FXML
   private ImageView imageBox2;
   @FXML
   private ImageView imageBox3;
   @FXML
   private ImageView imageBox4;
   @FXML
   private ImageView imageBox5;
   @FXML
   private ImageView imageBox6;
   @FXML
   private ImageView imageBox7;
   @FXML
   private ImageView imageBox8;
   @FXML
   private ImageView imageBox9;
   
   private Image oImage;            //private image declarations
   private Image xImage;
   
   private int[][] numberArray = new int[3][3]; //initializes empty array for the 1s and 0s
   private ImageView[][] imageArray = {{imageBox1, imageBox2, imageBox3}, {imageBox4, imageBox5, imageBox6}, {imageBox7, imageBox8, imageBox9}};
   
   private Random ranNum = new Random();
   int nums = ranNum.nextInt(2) + 0;
    
   //initialize method
   public void initialize() {
      oImage = new Image("o.png");
      xImage = new Image("x.png");
   }
 
   //event listener for the button
   public void newButtonListener() {
      int r, c; //r for row, c for collumn
      
      //Random ranNum = new Random();
      //int nums = ranNum.nextInt(2) + 0;
      
      //int[][] numberArray = new int[3][3];
      //ImageView[][] imageArray = {{imageBox1, imageBox2, imageBox3}, {imageBox4, imageBox5, imageBox6}, {imageBox7, imageBox8, imageBox9}};
      
      for(int i = 0; i <numberArray.length; ++i){
         for(int o = 0; o < numberArray.length; ++ o){
             numberArray[r][c] = nums;
            System.out.print(numberArray[i][o]);
         }
      }  

      for(r = 0; r < numberArray.length; ++r) {
         for(c = 0; c < numberArray.length; ++c) {
            numberArray[r][c] = nums;
            
            if(numberArray[r][c] == 1) {
               imageArray[r][c].setImage(xImage);
            }else if (numberArray[r][c] == 0) {
               imageArray[r][c].setImage(oImage);
            }
         }  
      } 
   }
}