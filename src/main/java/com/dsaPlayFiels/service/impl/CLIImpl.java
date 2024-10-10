package com.dsaPlayFiels.service.impl;

import com.dsaPlayFiels.service.CLI;

import java.util.Scanner;

public class CLIImpl implements CLI {
    @Override
    public String getFirstName() {
        System.out.print("Enter first name: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    @Override
    public String getLastName() {
        System.out.print("Enter last name: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    @Override
    public String getPlayerId() {
        System.out.print("Enter player id: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    @Override
    public int getPlayerMove() {
        System.out.print("Enter 1 to Co-Operate and 2 to Defect: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
