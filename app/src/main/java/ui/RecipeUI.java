package ui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

import data.RecipeFileHandler;

public class RecipeUI {
    private BufferedReader reader;
    private RecipeFileHandler fileHandler;

    public RecipeUI() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        fileHandler = new RecipeFileHandler();
    }

    public RecipeUI(BufferedReader reader, RecipeFileHandler fileHandler) {
        this.reader = reader;
        this.fileHandler = fileHandler;
    }

    public void displayMenu() {
        while (true) {
            try {
                System.out.println();
                System.out.println("Main Menu:");
                System.out.println("1: Display Recipes");
                System.out.println("2: Add New Recipe");
                System.out.println("3: Search Recipe");
                System.out.println("4: Exit Application");
                System.out.print("Please choose an option: ");

                displayRecipes();

                String choice = reader.readLine();

                switch (choice) {
                    case "1":
                        // 設問1: 一覧表示機能
                        break;
                    case "2":
                        // 設問2: 新規登録機能
                        break;
                    case "3":
                        // 設問3: 検索機能
                        break;
                    case "4":
                        System.out.println("Exit the application.");
                        return;
                    default:
                        System.out.println("Invalid choice. Please select again.");
                        break;
                }
            } catch (IOException e) {
                System.out.println("Error reading input from user: " + e.getMessage());
            }
        }
    }

    /**
     * 設問1: 一覧表示機能
     * RecipeFileHandlerから読み込んだレシピデータを整形してコンソールに表示します。
     */
    private void displayRecipes() {
        ArrayList<String> recipes = fileHandler.readRecipes();
        if(recipes.isEmpty()){
            System.out.println("No recipes available.");
        }else{
            System.out.println("Recipes:");
            ArrayList<String> TomatoS = new ArrayList<>();
            for(int i = 0;i < 5;i++){
                TomatoS.add(recipes.get(i));
            }
            ArrayList<String> ChickinK = new ArrayList<>();
            for(int i =5;i < 11;i++){
                ChickinK.add(recipes.get(i));
            }
            ArrayList<String> BeefS = new ArrayList<>();
            for(int i = 11;i < 16;i++){
                BeefS.add(recipes.get(i));
            }
            System.out.println("---------------------");
            System.out.println("Recipe Name: " + TomatoS.get(0));
            System.out.print("Main Ingredients: ");
            for(int i = 1;i < TomatoS.size();i++){
                System.out.print(TomatoS.get(i) + ",");
            }
            System.out.println();
            System.out.println("---------------------");
            System.out.println("Recipe Name: " + ChickinK.get(0));
            System.out.print("Main Ingredients: ");
            for(int i = 1;i < ChickinK.size();i++){
                System.out.print(ChickinK.get(i) + ",");
            }
            System.out.println();
            System.out.println("---------------------");
            System.out.println("Recipe Name: " + BeefS.get(0));
            System.out.print("Main Ingredients: ");
            for(int i = 1;i < BeefS.size();i++){
                System.out.print(BeefS.get(i) + ",");
            }
        }
    }
    

    /**
     * 設問2: 新規登録機能
     * ユーザーからレシピ名と主な材料を入力させ、RecipeFileHandlerを使用してrecipes.txtに新しいレシピを追加します。
     *
     * @throws java.io.IOException 入出力が受け付けられない
     */
    private void addNewRecipe() throws IOException {

    }

    /**
     * 設問3: 検索機能
     * ユーザーから検索クエリを入力させ、そのクエリに基づいてレシピを検索し、一致するレシピをコンソールに表示します。
     *
     * @throws java.io.IOException 入出力が受け付けられない
     */
    private void searchRecipe() throws IOException {

    }

}

