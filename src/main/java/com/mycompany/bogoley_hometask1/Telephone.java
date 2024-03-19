/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bogoley_hometask1;

/**
 *
 * @author beb19
 */
public class Telephone {
    String modelName;

    public static void modify(Telephone phone) {
        phone.modelName = phone.modelName.replace('o', 'a');
        if (!(phone.modelName.startsWith("N") || phone.modelName.startsWith("n"))) {
            phone.modelName = phone.modelName.toLowerCase();
        }
    }
}
