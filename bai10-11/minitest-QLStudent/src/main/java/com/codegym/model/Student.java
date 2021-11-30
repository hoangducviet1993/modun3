package com.codegym.model;

public class Student {
    private int id;
    private String name;
    private double mathScore;
    private double physicsScore;
    private double chemistryScore;

    public Student() {
    }

    public Student(int id, String name, double mathScore, double physicsScore, double chemistryScore) {
        this.id = id;
        this.name = name;
        this.mathScore = mathScore;
        this.physicsScore = physicsScore;
        this.chemistryScore = chemistryScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getPhysicsScore() {
        return physicsScore;
    }

    public void setPhysicsScore(double physicsScore) {
        this.physicsScore = physicsScore;
    }

    public double getChemistryScore() {
        return chemistryScore;
    }

    public void setChemistryScore(double chemistryScore) {
        this.chemistryScore = chemistryScore;
    }
}
