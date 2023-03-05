import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//1 Задача
    var a = 7;//Глобальная переменная для всех задач

    if (a==10){
        System.out.println("Верно");
    }else {
        System.out.println("Неверно");
    }
    int min = 170;
//2 Задача
    if (min>=0 && min<=15){
            System.out.println("Первая четверть");
        }
        else if (min>15 && min<=30) {
        System.out.println("Вторая четверть");
        }
    else if (min>30 && min<=45) {
        System.out.println("Третья четверть");
    }
    else if (min>45 && min<=59) {
        System.out.println("Четвертая четверть");
    }
    else {
        System.out.println("Значение находится вне диапозона");
    }
//3 Задача
    if (a>0){
        System.out.println("Верно");
    }
    else {
        System.out.println("Неверно");
    }
//4 Задача
        if (a<0){
            System.out.println("Верно");
        }
        else {
            System.out.println("Неверно");
        }
//5 Задача
        if (a>=0){
            System.out.println("Верно");
        }
        else {
            System.out.println("Неверно");
        }
//6 Задача
        if (a<=0){
            System.out.println("Верно");
        }
        else {
            System.out.println("Неверно");
        }
//7 Задача
        if (a!=0){
            System.out.println("Верно");
        }
        else {
            System.out.println("Неверно");
        }
//8 Задача
        String A = "2";
        if (A=="test"){
            System.out.println("Верно");
        }
        else {
            System.out.println("Неверно");
        }
//9 Задача

        if (A=="1" && A instanceof String){
            System.out.println("Верно");
        }
        else {
            System.out.println("Неверно");
        }
//10 Задача
        var b =5;
        var c = 10;
        if (a>b&&a>c || a>b&&b==c){
            System.out.println("Max " + a);
        }
        else if (b>a&&b>c || b>a&&a==c){
            System.out.println("Max " + b);
        }
        else if (c>a&&c>b || c>a&&a==b){
            System.out.println("Max " + c);
        }
        if (a<b&&a<c || a<b&&b==c){
            System.out.println("Min " + a);
        }
        else if (b<a&&b<c || b<a&&a==c){
            System.out.println("Min " + b);
        }
        else if (c<a&&c<b || c<a&&a==b){
            System.out.println("Min " + c);
        }
//11 Задача
        if (a>0&&a!=0){
            System.out.println("Положительное");
        }  else if (a<0&&a!=0){
            System.out.println("Отрицательное");
        } else {
            System.out.println("Число равно 0");
        }
//12 Задача
        if (a%2==0){
            System.out.println("Четное");
        }  else if (a%2!=0){
            System.out.println("Не четное");  }
    }
}