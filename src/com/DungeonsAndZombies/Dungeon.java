package com.DungeonsAndZombies;


public class Dungeon {

    String[][] map = {
            {"S", ".", "#", "#", ".", ".", ".", ".", ".", "T"},
            {"#", "T","#","#",".",".","#","#","#","." },
            {"#", ".","#","#","#","E","#","#","#","E" },
            {"#", ".","E",".",".",".","#","#","#","." },
            {"#", "#","#","T","#","#","#","#","#","G" },
    };
    int[][] currentHeroLocation = new int[1][2];

    public Dungeon(){


    }

    public void printMap(){

        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map[i].length; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    public void spawn(Hero hero){

        int maxSpawnPoints = map.length * map[0].length;
        int[][] spawningPoint = new int[maxSpawnPoints][2];

        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map[i].length; j++){
                if (map[i][j] == "S" || map[i][j] == "s"){
                    //capture spawning point
                    spawningPoint[0][0] = i;
                    spawningPoint[0][1] = j;

                    //place a hero on the spawning point
                    map[i][j] = "H";

                    //currentHeroLocation update
                    currentHeroLocation[0][0] = i;
                    currentHeroLocation[0][1] = j;

                    break;
                }
            }
        }
    }

    public void moveHero(MoveDirection direction){

        int[][] targetDirection = new int[1][2];

        if (direction == MoveDirection.down){


            targetDirection[0][1] = currentHeroLocation[0][1];
            targetDirection[0][0] = currentHeroLocation[0][0]-1;
        }
        else if(direction == MoveDirection.up){

            if (currentHeroLocation[0][0] < map.length ){
                return;
            }

            targetDirection[0][1] = currentHeroLocation[0][1];
            targetDirection[0][0] = currentHeroLocation[0][0]+1;
        }
        else if(direction == MoveDirection.right){
            targetDirection[0][1] = currentHeroLocation[0][1]+1;
            targetDirection[0][0] = currentHeroLocation[0][0];
        }
        else if(direction == MoveDirection.left){
            targetDirection[0][1] = currentHeroLocation[0][1]-1;
            targetDirection[0][0] = currentHeroLocation[0][0];
        }

//        for (int i = 0; i < map.length; i++){
//            for (int j = 0; j < map[i].length; j++){
//
//            }
//        }

        //check if inside the map

        //check for row
        if (currentHeroLocation[0][0] > map.length ){
            return;
        }
        //check for col
        if (currentHeroLocation[0][1] > map[0].length ){
            return;
        }



        //check if target point not an obstacle

        //check if an enemy -> start a fight

        //check if a Treasure -> treasure logic


    }
}
