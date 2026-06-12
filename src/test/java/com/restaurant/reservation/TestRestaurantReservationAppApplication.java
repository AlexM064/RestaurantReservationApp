package com.restaurant.reservation;

import org.springframework.boot.SpringApplication;

public class TestRestaurantReservationAppApplication {

    public static void main(String[] args) {
        SpringApplication.from(RestaurantReservationAppApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
