package com.example.lab2.model;

public class Proffesion {
    private String name;
    private Double speed_brain;
    private Double speed_move;
    private Double concentration;
    private Double reaction;
    private Double move_memory;
    private Double physics;
    private Double moves_coord;
    private Double emotions;
    private Double respons;

    public Proffesion(String name, Double speed_brain, Double speed_move, Double concentration, Double reaction, Double move_memory, Double physics, Double moves_coord, Double emotions, Double respons) {
        this.name = name;
        this.speed_brain = speed_brain;
        this.speed_move = speed_move;
        this.concentration = concentration;
        this.reaction = reaction;
        this.move_memory = move_memory;
        this.physics = physics;
        this.moves_coord = moves_coord;
        this.emotions = emotions;
        this.respons = respons;
    }
}
