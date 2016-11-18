package fajn_tutorial;


public class Fish extends Pet {
    int currentDepth = 0;

    public int dive(int howDeep) {
        currentDepth = currentDepth + howDeep;
        if (currentDepth > 100) {
            System.out.println("Я маленькая рыбка " + " и не могу плавать глубже 100м");
            currentDepth = currentDepth - howDeep;
        } else {
            System.out.println("Погружаюсь еще на " + howDeep + " м");
            System.out.println("Я на глубине " + currentDepth + " м");
        }
        return currentDepth;
    }

    public String say(String something){
        return "Разве вы не знаете, что рыбы говорят?)";
    }

    public void sleep(){

    }
}
