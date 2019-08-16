/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storage.control;

import com.storage.model.Admin;
import com.storage.model.Client;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author erick
 */
public final class Useful {

    public static Client clientRegistred;
    public static Admin adminRegistred;

    public final static boolean checkMail(String mail) {
        Pattern mailPattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"); //Re
        Matcher tmail = mailPattern.matcher(mail);
        return tmail.find();
    }

    public final static String idForCard() {
        String id = "";
        boolean fly = true;
        for (int i = 0; i < 5; i++) {
            if (i < 3) {
                id += (int) Math.floor(Math.random() * 10);
            } else {
                if (fly) {
                    id += "-";
                    fly = false;
                }
                id += (char) (int) Math.floor(Math.random() * (90 - 65) + 65);
            }
        }
        return id;
    }

    public final static String idForProduct() {
        String id = "";
        boolean fly = true;
        for (int i = 0; i < 4; i++) {
            if (i < 2) {
                id += (int) Math.floor(Math.random() * 10);
            } else {
                if (fly) {
                    id += "-";
                    fly = false;
                }
                id += (char) (int) Math.floor(Math.random() * (90 - 65) + 65);
            }
        }
        return id;
    }

}
