package com.example.lab3;

import javafx.beans.property.*;

public class Person {

    private StringProperty firstName;
    private DoubleProperty speed_brain;
    private DoubleProperty speed_move;
    private DoubleProperty concentration;
    private DoubleProperty eye_memory;
    private DoubleProperty reaction;
    private DoubleProperty move_memory;
    private DoubleProperty physics;
    private DoubleProperty moves_coord;
    private DoubleProperty emotions;
    private DoubleProperty respons;

    public Person(StringProperty firstName, DoubleProperty speed_brain) {
        this.firstName = firstName;
        this.speed_brain = speed_brain;
    }

    public Person(StringProperty firstName) {
        this.firstName = firstName;
    }

    public Person(String firstName, double speed_brain, double speed_move, double concentration, double eye_memory, double reaction, double move_memory, double physics, double moves_coord, double emotions, double respons) {
        this.firstName = new SimpleStringProperty(firstName);
        this.speed_brain = new SimpleDoubleProperty(speed_brain);
        this.speed_move = new SimpleDoubleProperty(speed_move);
        this.concentration = new SimpleDoubleProperty(concentration);
        this.eye_memory = new SimpleDoubleProperty(eye_memory);
        this.reaction = new SimpleDoubleProperty(reaction);
        this.move_memory = new SimpleDoubleProperty(move_memory);
        this.physics = new SimpleDoubleProperty(physics);
        this.moves_coord = new SimpleDoubleProperty(moves_coord);
        this.emotions = new SimpleDoubleProperty(emotions);
        this.respons = new SimpleDoubleProperty(respons);
    }
    public Person(String firstName, double speed_brain, double speed_move, double concentration, double eye_memory, double reaction) {
        this.firstName = new SimpleStringProperty(firstName);
        this.speed_brain = new SimpleDoubleProperty(speed_brain);
        this.speed_move = new SimpleDoubleProperty(speed_move);
        this.concentration = new SimpleDoubleProperty(concentration);
        this.eye_memory = new SimpleDoubleProperty(eye_memory);
        this.reaction = new SimpleDoubleProperty(reaction);

        this.move_memory = new SimpleDoubleProperty(0);
        this.physics = new SimpleDoubleProperty(0);
        this.moves_coord = new SimpleDoubleProperty(0);
        this.emotions = new SimpleDoubleProperty(0);
        this.respons = new SimpleDoubleProperty(0);
    }
    public String getFirstName() {
        return firstName.get();
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public double getSpeed_brain() {
        return speed_brain.get();
    }

    public DoubleProperty speed_brainProperty() {
        return speed_brain;
    }

    public void setSpeed_brain(double speed_brain) {
        this.speed_brain.set(speed_brain);
    }

    public double getSpeed_move() {
        return speed_move.get();
    }

    public DoubleProperty speed_moveProperty() {
        return speed_move;
    }

    public void setSpeed_move(double speed_move) {
        this.speed_move.set(speed_move);
    }

    public double getConcentration() {
        return concentration.get();
    }

    public DoubleProperty concentrationProperty() {
        return concentration;
    }

    public void setConcentration(double concentration) {
        this.concentration.set(concentration);
    }

    public double getEye_memory() {
        return eye_memory.get();
    }

    public DoubleProperty eye_memoryProperty() {
        return eye_memory;
    }

    public void setEye_memory(double eye_memory) {
        this.eye_memory.set(eye_memory);
    }

    public double getReaction() {
        return reaction.get();
    }

    public DoubleProperty reactionProperty() {
        return reaction;
    }

    public void setReaction(double reaction) {
        this.reaction.set(reaction);
    }

    public double getMove_memory() {
        return move_memory.get();
    }

    public DoubleProperty move_memoryProperty() {
        return move_memory;
    }

    public void setMove_memory(double move_memory) {
        this.move_memory.set(move_memory);
    }

    public double getPhysics() {
        return physics.get();
    }

    public DoubleProperty physicsProperty() {
        return physics;
    }

    public void setPhysics(double physics) {
        this.physics.set(physics);
    }

    public double getMoves_coord() {
        return moves_coord.get();
    }

    public DoubleProperty moves_coordProperty() {
        return moves_coord;
    }

    public void setMoves_coord(double moves_coord) {
        this.moves_coord.set(moves_coord);
    }

    public double getEmotions() {
        return emotions.get();
    }

    public DoubleProperty emotionsProperty() {
        return emotions;
    }

    public void setEmotions(double emotions) {
        this.emotions.set(emotions);
    }

    public double getRespons() {
        return respons.get();
    }

    public DoubleProperty responsProperty() {
        return respons;
    }

    public void setRespons(double respons) {
        this.respons.set(respons);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName=" + firstName +
                ", speed_brain=" + speed_brain +
                ", speed_move=" + speed_move +
                ", concentration=" + concentration +
                ", eye_memory=" + eye_memory +
                ", reaction=" + reaction +
                ", move_memory=" + move_memory +
                ", physics=" + physics +
                ", moves_coord=" + moves_coord +
                ", emotions=" + emotions +
                ", respons=" + respons +
                '}';
    }
}
