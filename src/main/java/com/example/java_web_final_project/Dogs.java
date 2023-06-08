package com.example.java_web_final_project;

    package com.example.myproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

    @Entity
    public class Dogs {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String breed;
        private String health;
        private int height;

        public Dogs(Long id, String breed, String health, int height) {
            this.id = id;
            this.breed = breed;
            this.health = health;
            this.height = height;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public String getHealth() {
            return health;
        }

        public void setHealth(String health) {
            this.health = health;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        @Override
        public String toString() {
            return "Dogs{" +
                    "id=" + id +
                    ", breed='" + breed + '\'' +
                    ", health='" + health + '\'' +
                    ", height=" + height +
                    '}';
        }
    }
}
