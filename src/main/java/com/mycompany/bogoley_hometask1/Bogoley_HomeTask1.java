/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bogoley_hometask1;

/**
 *
 * @author beb19
 */
import java.util.Scanner;

public class Bogoley_HomeTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String modelName = scanner.nextLine();
        Telephone phone = new Telephone();
        phone.modelName = modelName;
        Telephone.modify(phone);
        System.out.println(modelName);
        System.out.println(phone.modelName);
    }
}