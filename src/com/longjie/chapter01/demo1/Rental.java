package com.longjie.chapter01.demo1;

/**
 * 租赁
 */
public class Rental {
    private Movie _movie;
    // 租赁的时间
    private int _daysRented;

    public Rental(Movie _movie, int _daysRented) {
        this._movie = _movie;
        this._daysRented = _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }
}
